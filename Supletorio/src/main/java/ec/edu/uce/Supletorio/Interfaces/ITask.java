package ec.edu.uce.Supletorio.Interfaces;

import ec.edu.uce.Supletorio.Model.Task;

import java.util.List;
import java.util.Optional;

public interface ITask {

    Task createTask(Task task);

    List<Task> getAllTasks();

    Optional<Task> updateTask(Long id, Task updatedTask);

    void deleteTask(Long id);

    List<Task> getTasksByStatus(Task.TaskStatus status);
}
