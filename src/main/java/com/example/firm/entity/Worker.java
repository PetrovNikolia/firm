package com.example.firm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Worker extends AbstractClassEntity {

    @Column
    private String name;

    @Column
    private String email;

    @OneToMany(mappedBy = "name")
    private List<WorkType> workType;
}
