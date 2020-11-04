package cl.simulacion5.service;

import java.util.List;

import cl.simulacion5.entity.Comment;

public interface CommentService {

	void addComment(Comment comment);
	Comment getCommentById(int commentid);
	List<Comment> getListComments();
	void editComment(Comment comment);
	void deleteComment(int commentid);
	void deleteAll();
	void addListComments(List<Comment> list);
}
