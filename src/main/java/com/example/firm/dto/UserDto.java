package com.example.firm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private UUID uuid;
    private UUID name;
    private List<RoleDto> roles;
    private List<RequestDto> requests;

    @Override
    public String toString() {
        return "UserDto{" +
                "uuid=" + uuid +
                ", name=" + name +
                ", roles=" + roles +
                ", request=" + requests +
                '}';
    }
}
