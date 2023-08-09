package service;

public interface TodoListService {

  //menampilkan seluruh todolist
  void showTodoList();

  //nambah todolist
  void addTodoList(String todo);

  //menghapus data todolist
  void removeTodoList(Integer number);

}
