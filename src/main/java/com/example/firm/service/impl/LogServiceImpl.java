package com.example.firm.service.impl;

import com.example.firm.entity.Log;
import com.example.firm.repository.LogRepository;
import com.example.firm.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;
    @Override
    public void saveLog(Log log) {
        logRepository.save(log);
    }
}
