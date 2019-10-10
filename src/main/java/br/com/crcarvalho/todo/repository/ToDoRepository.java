package br.com.crcarvalho.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crcarvalho.todo.entity.ToDo;

@Repository("toDoRepository")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
