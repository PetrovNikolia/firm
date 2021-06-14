package com.example.firm.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Request extends AbstractClassEntity{

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String organization;

    @Column
    private String msg;

    @Column
    private String circulationTime;

    @ManyToOne
    private MyUser myUser;

    @OneToOne
    private WorkType workType;

}
