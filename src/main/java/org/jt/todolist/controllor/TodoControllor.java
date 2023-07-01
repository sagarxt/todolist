package org.jt.todolist.controllor;

import org.jt.todolist.model.Todo;
import org.jt.todolist.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

// import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class TodoControllor {
  private final TodoService todoService;

  @RequestMapping("/todo")
  public String todoPage(Model model) {
    var todos = todoService.todos();
    model.addAttribute("todos", todos);
    return "todoPage";
  }

  @PostMapping("/addtodo")
  String addTodo(@RequestParam("action") String action) {
    System.out.println(action);
    var todo = Todo.builder().action(action).build();
    todoService.addTodo(todo);
    return "redirect:/todo";
  }

  // String addTodo(HttpServletRequest request) {
  // String todo = request.getParameter("action");
  // System.out.println(todo);
  // return "redirect:/todo";
  // }

  @GetMapping("/removetodo")
  public String removeTodo(@RequestParam int id){
    todoService.removeById(id);
    return "redirect:/todo";
  }

  @GetMapping("/completetodo")
  public String completedTodo(@RequestParam int id, @RequestParam("isComplete") boolean isCompleted){
    todoService.completeById(id, isCompleted);
    return "redirect:/todo"; 
  }
}
