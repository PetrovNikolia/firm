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
public class WorkerDto {

    private UUID uuid;
    private String name;
    private List<WorkTypeDto> workType;

    @Override
    public String toString() {
        return "WorkerDto{" +
                "uuid=" + uuid +
                ", name=" + name +
                ", workType=" + workType +
                '}';
    }
}
