package cl.simulacion5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.simulacion5.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
