package cl.simulacion5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.simulacion5.entity.Post;
import cl.simulacion5.service.PostService;

@Controller
@RequestMapping("posts")
public class CommentController {

	@Autowired
	PostService postService;
	
	@GetMapping("/comments/{postid}")
	public ModelAndView listarPosts(@PathVariable(name = "postid") int postid) {
		
		ModelAndView mav = new ModelAndView("listadocomments");
		Post post = postService.getPostById(postid);
		mav.addObject("post", post);
		mav.addObject("comments", post.getComment());
		return mav;
		
	}
	
}
