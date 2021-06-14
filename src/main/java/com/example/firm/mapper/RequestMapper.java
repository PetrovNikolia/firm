package com.example.firm.mapper;

import com.example.firm.dto.RequestDto;
import com.example.firm.entity.Request;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper()
public interface RequestMapper {

    RequestDto toDto(Request request);

    List<RequestDto> toDto(List<Request> requests);
}
