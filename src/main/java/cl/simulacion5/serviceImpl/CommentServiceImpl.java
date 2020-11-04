package cl.simulacion5.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion5.entity.Comment;
import cl.simulacion5.repository.CommentRepository;
import cl.simulacion5.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;
	
	@Override
	public void addComment(Comment comment) {
		commentRepository.save(comment);
	}

	@Override
	public Comment getCommentById(int commentid) {
		Optional<Comment> com = commentRepository.findById(commentid);
		return com.get();
	}

	@Override
	public List<Comment> getListComments() {
		List<Comment> com = commentRepository.findAll();
		return com;
	}

	@Override
	public void editComment(Comment comment) {
		commentRepository.save(comment);
	}

	@Override
	public void deleteComment(int commentid) {
		commentRepository.deleteById(commentid);
	}

	@Override
	public void deleteAll() {
		commentRepository.deleteAll();
	}

	@Override
	public void addListComments(List<Comment> list) {
		commentRepository.saveAll(list);
	}

}
