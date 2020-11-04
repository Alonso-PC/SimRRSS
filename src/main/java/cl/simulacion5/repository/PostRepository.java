package cl.simulacion5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.simulacion5.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

	
}
