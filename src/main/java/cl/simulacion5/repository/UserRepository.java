package cl.simulacion5.repository;

import org.springframework.stereotype.Repository;

import cl.simulacion5.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
