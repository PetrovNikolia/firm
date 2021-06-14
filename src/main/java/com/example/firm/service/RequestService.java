package com.example.firm.service;

import com.example.firm.dto.RequestDto;
import com.example.firm.dto.RequestForm;

import java.util.List;
import java.util.UUID;

public interface RequestService {

    RequestDto getRequest(UUID uuid);

    List<RequestDto> getAllRequestUser();

    RequestDto add(RequestForm requestForm);

    void deleteRequest(UUID uuid);
}
