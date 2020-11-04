package cl.simulacion5.service;

import java.util.List;

import cl.simulacion5.entity.Post;

public interface PostService {

	void addPost(Post post);
	Post getPostById(int postid);
	List<Post> getListPosts();
	void editPost(Post post);
	void deletePost(int postid);
	void deleteAll();
	void addListPosts(List<Post> list);
	
}
