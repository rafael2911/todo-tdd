package br.com.crcarvalho.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crcarvalho.todo.entity.ToDo;
import br.com.crcarvalho.todo.repository.ToDoRepository;

@Service
public class ToDoService {

	private ToDoRepository toDoRepository;
	
	@Autowired
	public ToDoService(ToDoRepository toDoRepository) {
		this.toDoRepository = toDoRepository;	
	}

	public List<ToDo> findAll() {
		
		return toDoRepository.findAll();
	}

}
