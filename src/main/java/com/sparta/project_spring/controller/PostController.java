package com.sparta.project_spring.controller;

import com.sparta.project_spring.domain.Post;
import com.sparta.project_spring.domain.PostCheckDto;
import com.sparta.project_spring.domain.PostRepository;
import com.sparta.project_spring.domain.PostRequestDto;
import com.sparta.project_spring.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostRepository postRepository;

    private final PostService postService;

    @PostMapping("/api/posts")
    public Post createPost(@RequestBody PostRequestDto requestDto) {

        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    @GetMapping("/api/posts")
    public List<Post> getpost() {

        return postRepository.findAll(Sort.by(Sort.Direction.DESC,"createdAt"));
    }


    @GetMapping("/api/posts/{id}")
    public Optional<Post> findById(@PathVariable Long id){
        return postRepository.findById(id);
    }

    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.update(id, requestDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public Long deletePost (@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }
    @PostMapping("/api/posts/password/{id}")
    @ResponseBody
    public PostCheckDto passwordcheck(@RequestBody PostCheckDto postCheckDto) {
        postCheckDto.setResult(postService.passwordcheck(postCheckDto.getId(), postCheckDto.getPassword()));
        return postCheckDto;
    }

}
