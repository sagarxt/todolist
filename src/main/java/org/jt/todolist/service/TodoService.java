package org.jt.todolist.service;

import java.util.List;

import org.jt.todolist.model.Todo;
import org.jt.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
  private final TodoRepository todoRepository;

  public void addTodo(Todo todo) {
    todoRepository.save(todo); 
  }

  public List<Todo> todos() {
    return todoRepository.findAll();
  }

  public void removeById(int id) {
    todoRepository.deleteById(id);
  }

  @Transactional
  public void completeById(int id , boolean isCompleted) {
    todoRepository.updateIsCompleted(id, isCompleted);
  }
}
