package br.com.crcarvalho.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crcarvalho.todo.entity.ToDo;
import br.com.crcarvalho.todo.service.ToDoService;

@RestController
@RequestMapping("todos")
public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;
	
	@GetMapping
	public List<ToDo> findAll(){
		
		return toDoService.findAll();
	}
	
}
