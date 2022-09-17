package com.sparta.homework01;


import com.sparta.homework01.controller.PersonRequestDto;
import com.sparta.homework01.domain.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String job;

    @Column(nullable = true)
    private int age;

    @Column(nullable = true)
    private double hight;

    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.job = requestDto.getJob();
        this.age = requestDto.getAge();
        this.hight = requestDto.getHight();
    }

    public Person(String name, String job, int age, double hight) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.hight = hight;
    }

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.job = requestDto.getJob();
        this.age = requestDto.getAge();
        this.hight = requestDto.getHight();
    }


}
