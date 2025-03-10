// ToDoDAO.java
package dao;
import java.util.List;
import beans.Register;
import beans.Task;

public interface ToDoDAO {
  public int register(Register register);
  public int login(String email, String pass);
  public List<Task> findTasksByRegId(int regId);
  public int addTask(Task task, int regId);
  public boolean markTaskCompleted(int taskId, int regId);
  public String getFLNameByRegID(int regId);
}