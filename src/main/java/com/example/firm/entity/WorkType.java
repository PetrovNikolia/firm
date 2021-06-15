package com.example.firm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class WorkType extends AbstractClassEntity {

    @Column
    private String name;

}
