package com.example.firm.mapper;

import com.example.firm.dto.WorkerDto;
import com.example.firm.entity.Worker;
import org.mapstruct.Mapper;

@Mapper()
public interface WorkerMapper {

    WorkerDto toDto(Worker worker);
}
