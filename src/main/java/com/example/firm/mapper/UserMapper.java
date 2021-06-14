package com.example.firm.mapper;

import com.example.firm.dto.UserDto;
import com.example.firm.entity.MyUser;
import org.mapstruct.Mapper;

@Mapper()
public interface UserMapper {

    UserDto toDto(MyUser myUser);
}
