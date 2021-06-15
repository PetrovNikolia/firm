package com.example.firm.service.impl;

import com.example.firm.dto.RequestDto;
import com.example.firm.dto.RequestForm;
import com.example.firm.entity.MyUser;
import com.example.firm.entity.Request;
import com.example.firm.exception.custom.MyNotFoundException;
import com.example.firm.mapper.RequestMapper;
import com.example.firm.repository.RequestRepository;
import com.example.firm.repository.UserRepository;
import com.example.firm.repository.WorkTypeRepository;
import com.example.firm.service.MessageService;
import com.example.firm.service.RequestService;
import com.example.firm.util.AuthUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Component
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {

    private final static String TIME_FORMAT = "yyyyMMddHHmm";

    private final RequestRepository requestRepository;
    private final UserRepository userRepository;
    private final WorkTypeRepository workTypeRepository;

    private final RequestMapper requestMapper;

    private final MessageService messageService;

    @Override
    public RequestDto getRequest(UUID uuid) {
        return requestMapper.toDto(requestRepository.findById(uuid).orElseThrow(MyNotFoundException::new));
    }

    @Override
    public List<RequestDto> getAllRequestUser() {
        return requestMapper.toDto(requestRepository.findAll());
    }

    @Override
    public RequestDto add(RequestForm requestForm) {
        Request newRequest = Request.builder()
                .firstName(requestForm.getFirstName())
                .lastName(requestForm.getLastName())
                .organization(requestForm.getOrganization())
                .circulationTime(new SimpleDateFormat(TIME_FORMAT).format(new Date()))
                .msg(requestForm.getMsg())
                .myUser(checkUser(AuthUtils.getCurrentUserUuid()))
                .workType(workTypeRepository.findByName(requestForm.getWorkType()).orElseThrow(MyNotFoundException::new))
                .build();
        RequestDto requestDto = requestMapper.toDto(requestRepository.save(newRequest));
        messageService.sendMsg(requestDto.toString());
        return requestDto;
    }

    @Override
    public void deleteRequest(UUID uuid) {
        requestRepository.deleteById(uuid);
    }

    private MyUser checkUser(UUID currentUserUuid) {
        return userRepository.findByName(currentUserUuid).orElseGet(() -> userRepository.save(new MyUser(currentUserUuid)));

    }
}
