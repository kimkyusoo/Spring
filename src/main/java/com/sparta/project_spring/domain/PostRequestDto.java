package com.sparta.project_spring.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor

public class PostRequestDto {
    private  final String title;
    private  final String userName;
    private  final String text;
    private  final String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}