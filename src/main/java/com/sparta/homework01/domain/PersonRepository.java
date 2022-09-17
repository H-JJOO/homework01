package com.sparta.homework01.domain;

import com.sparta.homework01.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
