package com.sparta.project_spring.service;

import com.sparta.project_spring.domain.Post;
import com.sparta.project_spring.domain.PostRepository;
import com.sparta.project_spring.domain.PostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
// 생성자를 자동으로 생성해주는 것. final 사용시 필수로 작성.
@Service // 스프링에게 이 클래스는 서비스임을 명시
public class PostService {

    // final: 서비스에게 꼭 필요한 녀석임을 명시
    private final PostRepository postRepository;

    @Transactional
    public Long update(Long id, PostRequestDto requestDto) {
        Post post1 = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        post1.update(requestDto);
        return post1.getId();
    }

    public int passwordcheck(Long id, String password) {
        Optional<Post> optional = postRepository.findById(id);
        Post post = optional.get();
        String realpassword = post.getPassword();
        if (realpassword.equals(password)) {
            return 1;
        } else {
            return 0;
        }
        }
    }