package com.sparta.project_spring;

import com.sparta.project_spring.domain.PostRepository;
import com.sparta.project_spring.service.PostService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
//생성일자, 수정일자 적용하는데 필수.
@SpringBootApplication
public class ProjectSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(PostRepository postRepository, PostService postService) {
        return (args) -> {

//데이터 생성
//            System.out.println("print data");
//            List<Post> postList = postRepository.findAll();
//            for (int i = 0; i < postList.size(); i++) {
//                Post post = postList.get(i);
//                System.out.println(post.getId());
//                System.out.println(post.getTitle());
//                System.out.println(post.getUserName());
//                System.out.println(post.getText());
//생성된 데이터 확인
//            }
//
//            postList = postRepository.findAll();
//            for (int i = 0; i < postList.size(); i++) {
//                Post post = postList.get(i);
//                System.out.println(post.getId());
//                System.out.println(post.getTitle());
//                System.out.println(post.getUserName());
//                System.out.println(post.getText());
////업데이트된 데이터 확인
//
//            postRepository.findById(1L).orElseThrow(
//                    () -> new IllegalAccessException("해당아이디는 존재하지 않습니다.")
//            );
////                특정 내용 조회
//
//            }
        };
    }
}
