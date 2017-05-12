package com.greenfox.norbert.reddit.service;


import com.greenfox.norbert.reddit.model.Post;
import com.greenfox.norbert.reddit.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {

  @Autowired
  PostRepository postRepository;

  @Autowired
  Posts posts;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Posts postList() {
    posts.preparePostList();
    return posts;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody Post post) {
    postRepository.save(post);
    return postRepository.findOne(post.getId());
  }

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upvotePost(@PathVariable(value = "id", required = false) long idToUpvote) {
    Post post = postRepository.findOne(idToUpvote);
    post.upVotePost();
    postRepository.save(post);
    return postRepository.findOne(idToUpvote);
  }

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downvotePost(@PathVariable(value = "id", required = false) long idToDownvoat) {
    Post post = postRepository.findOne(idToDownvoat);
    post.downVotePost();
    postRepository.save(post);
    return postRepository.findOne(idToDownvoat);
  }
}
