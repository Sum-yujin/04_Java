package dao;

import java.io.IOException;
import java.util.List;

import dto.Todo;

public interface TodoListDao {

	/**
	 * DAO 객체가 가지고 있는 todoList 반환
	 * @return
	 */
	List<Todo> getMemberList();
	
	boolean addTodo(Todo todo) throws IOException;
	
	void saveFile() throws IOException;
	
	
}
