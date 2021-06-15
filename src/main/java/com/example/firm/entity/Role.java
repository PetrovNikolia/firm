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
public class Role extends AbstractClassEntity {

    @Column
    String name;

//    @Override
//    public String getAuthority() {
//        return getName();
//    }
}
