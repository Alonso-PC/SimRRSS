package cl.simulacion5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.simulacion5.entity.Post;
import cl.simulacion5.service.PostService;

@Controller
@RequestMapping("posts")
public class PostController {

	@Autowired
	PostService postService;
	
	@GetMapping("/list")
	public ModelAndView listarPosts() {
		
		ModelAndView mav = new ModelAndView("listadopost");
		List<Post> lista = postService.getListPosts();
		mav.addObject("posts", lista);
		return mav;
		
	}
	
}
