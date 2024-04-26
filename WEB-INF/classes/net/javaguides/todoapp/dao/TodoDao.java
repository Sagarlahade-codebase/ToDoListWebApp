package net.javaguides.todoapp.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.TreeSet;

import net.javaguides.todoapp.model.Todo;

public interface TodoDao {

	void insertTodo(Todo todo) throws SQLException;

	Todo selectTodo(long todoId);

	TreeSet<Todo> selectAllTodos();

	boolean deleteTodo(int id) throws SQLException;

	boolean updateTodo(Todo todo) throws SQLException;

}