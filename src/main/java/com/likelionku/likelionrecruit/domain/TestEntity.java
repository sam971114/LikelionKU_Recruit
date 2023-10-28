package com.likelionku.likelionrecruit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
}
