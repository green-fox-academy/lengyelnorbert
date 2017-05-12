package com.greenfox.norbert.reddit.service;


import com.greenfox.norbert.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
