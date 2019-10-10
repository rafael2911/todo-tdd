package br.com.crcarvalho.todo.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.crcarvalho.todo.entity.ToDo;
import br.com.crcarvalho.todo.repository.ToDoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToDoServiceTest {
	
	@Autowired
	private ToDoRepository toDoRepository;
	
	@Test
	public void getAllToDos() {
		ToDo todoSample = new ToDo("Todo Sample 1", true);
		toDoRepository.save(todoSample);
		ToDoService todoService = new ToDoService(toDoRepository);
		
		List<ToDo> toDoList = todoService.findAll();
		ToDo lastToDo = toDoList.get(toDoList.size()-1);
		
		assertEquals(todoSample.getText(), lastToDo.getText());
		assertEquals(todoSample.isCompleted(), lastToDo.isCompleted());
		assertEquals(todoSample.getId(), lastToDo.getId());
	}
	
}
