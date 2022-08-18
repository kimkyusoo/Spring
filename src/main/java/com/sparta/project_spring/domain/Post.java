package com.sparta.project_spring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor // 기본생성자를 대신 생성
@Entity
public class Post extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령.
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime modifiedAt;


    public Post(PostRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.userName = requestDto.getUserName();
        this.text = requestDto.getText();
        this.password = requestDto.getPassword();
        this.createdAt = requestDto.getCreatedAt();
        this.modifiedAt = requestDto.getModifiedAt();
    }

    public Post(String title, String userName, String text, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.title = title;
        this.userName = userName;
        this.text = text;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public void update(PostRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.userName = requestDto.getUserName();
        this.text = requestDto.getText();
        this.password = requestDto.getPassword();
        this.modifiedAt = requestDto.getModifiedAt();
    }
}
