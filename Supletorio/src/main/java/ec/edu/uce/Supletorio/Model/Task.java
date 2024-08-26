package ec.edu.uce.Supletorio.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDateTime creationDate;

    public Task() {
    }

    public Task(Long id, String title, TaskStatus status, String description, LocalDateTime creationDate) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.description = description;
        this.creationDate = creationDate;
    }

    public Task(String title, String description, TaskStatus status, LocalDateTime creationDate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public enum TaskStatus {
        PENDING,
        COMPLETED
    }
}
