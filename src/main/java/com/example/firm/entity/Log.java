package com.example.firm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Log extends AbstractClassEntity{
    @Column
    private String method;
    @Column
    private String result;
    @Column
    private Date time;
}
