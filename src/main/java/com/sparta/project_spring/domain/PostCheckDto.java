package com.sparta.project_spring.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public class PostCheckDto {
    private Long id;
    private String password;
    private int result;
}

