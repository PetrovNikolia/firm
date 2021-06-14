package com.example.firm.mapper;

import com.example.firm.dto.RoleDto;
import com.example.firm.entity.Role;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper()
public interface RoleMapper {

    RoleDto toDto(Role role);

    List<RoleDto> toDto(Set<Role> roles);
}
