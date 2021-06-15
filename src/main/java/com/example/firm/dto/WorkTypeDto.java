package com.example.firm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkTypeDto {

    private String name;

    @Override
    public String toString() {
        return "WorkTypeDto{" +
                ", name='" + name + '\'' +
                '}';
    }
}
