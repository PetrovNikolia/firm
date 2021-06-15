package com.example.firm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestForm {

    private String firstName;

    private String lastName;

    private String organization;

    private String msg;

    private String workType;
}
