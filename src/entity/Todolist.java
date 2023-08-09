package entity;

public class Todolist {
  //model untuk menyimpan data todolist
  private String todo;

  //constructor yang tidak ada parameternya
  public Todolist() {
  }
  //constructor yang ada parameter todo
  public Todolist(String todo) {
    this.todo = todo;
  }

  //getter
  public String getTodo() {
    return todo;
  }

  //setter
  public void setTodo(String todo) {
    this.todo = todo;
  }
}
