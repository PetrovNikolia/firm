package com.example.firm.mapper;

import com.example.firm.dto.WorkTypeDto;
import com.example.firm.entity.WorkType;
import org.mapstruct.Mapper;

@Mapper()
public interface WorkTypeMapper {

    WorkTypeDto toDto(WorkType workType);
}
