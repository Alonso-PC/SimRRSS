package cl.simulacion5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cl.simulacion5.RestComponent.CommentRestComponent;
import cl.simulacion5.RestComponent.PostRestComponent;
import cl.simulacion5.entity.Comment;
import cl.simulacion5.entity.Post;
import cl.simulacion5.service.CommentService;
import cl.simulacion5.service.PostService;

@Controller
public class DataController {
	
	@Autowired
	PostRestComponent pr;
	@Autowired
	CommentRestComponent cr;
	@Autowired
	PostService postService;
	@Autowired
	CommentService commentService;
	
	@GetMapping("/data")
	public String cargaDatos() {
		
		List<Post> listPost = postService.getListPosts();
		List<Comment> listComment = commentService.getListComments();
		
		commentService.deleteAll();;
		postService.deleteAll();;
		
		postService.addListPosts(listPost);
		commentService.addListComments(listComment);
		
		return "data";
		
	}

}
