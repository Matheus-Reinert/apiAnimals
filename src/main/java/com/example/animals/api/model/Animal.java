package com.example.animals.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue
    private Long id;
    private String animalDescription;
    private AnimalClass animalClass;
    private AnimalGroup animalGroup;



}
