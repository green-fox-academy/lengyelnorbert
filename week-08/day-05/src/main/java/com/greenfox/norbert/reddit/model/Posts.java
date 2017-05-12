package com.greenfox.norbert.reddit.model;


import com.greenfox.norbert.reddit.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Posts {

  private Iterable<Post> posts;

  @Autowired
  PostRepository postRepository;

  public void preparePostList() {
    posts = postRepository.findAll();
  }

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
