package org.jt.todolist.repository;

import org.jt.todolist.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
public interface TodoRepository extends JpaRepository<Todo, Integer> {
  
@Modifying
@Query("UPDATE Todo SET isCompleted = :isCompleted WHERE id = :id")
void updateIsCompleted(int id,boolean isCompleted);


}
