package repository;

import entity.Todolist;

public interface TodoListRepository {

  //dapetin semua data todolist
  Todolist[] getAll();

  //menambahkan data todolist
  void add(Todolist todolist);

  //menghapus data todolis
  boolean remove(Integer number);

}
