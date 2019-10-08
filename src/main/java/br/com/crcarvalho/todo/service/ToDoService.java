package br.com.crcarvalho.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.crcarvalho.todo.entity.ToDo;

@Service
public class ToDoService {

	public List<ToDo> findAll() {
		
		return new ArrayList<ToDo>();
	}

}
