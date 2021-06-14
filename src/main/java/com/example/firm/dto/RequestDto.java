package com.example.firm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {

    private String firstName;

    private String lastName;

    private String organization;

    private String circulationTime;

    private String msg;

    private WorkTypeDto workType;

    @Override
    public String toString() {
        return "RequestDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", organization='" + organization + '\'' +
                ", circulationTime='" + circulationTime + '\'' +
                ", workType=" + workType +
                '}';
    }
}
