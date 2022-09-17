package com.sparta.homework01.service;

import com.sparta.homework01.Person;
import com.sparta.homework01.controller.PersonRequestDto;
import com.sparta.homework01.domain.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor//Lombok
@Service//스프링에 이 클래스는 서비스임을 명시
public class PersonService {

    private final PersonRepository personRepository;

    @Transactional//SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person1.update(requestDto);
        return person1.getId();
    }


}
