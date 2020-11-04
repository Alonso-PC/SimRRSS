package cl.simulacion5.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion5.entity.Post;
import cl.simulacion5.repository.PostRepository;
import cl.simulacion5.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;
	
	@Override
	public void addPost(Post post) {
		postRepository.save(post);
	}

	@Override
	public Post getPostById(int postid) {
		Optional<Post> post = postRepository.findById(postid);
		return post.get();
	}

	@Override
	public List<Post> getListPosts() {
		List<Post> lista = postRepository.findAll();
		return lista;
	}

	@Override
	public void editPost(Post post) {
		postRepository.save(post);
	}

	@Override
	public void deletePost(int postid) {
		postRepository.deleteById(postid);
	}

	@Override
	public void deleteAll() {
		postRepository.deleteAll();
	}

	@Override
	public void addListPosts(List<Post> list) {
		postRepository.saveAll(list);
	}

}
