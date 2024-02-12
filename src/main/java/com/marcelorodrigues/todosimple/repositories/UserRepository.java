package com.marcelorodrigues.todosimple.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelorodrigues.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   
  
}
