package ec.edu.uce.Supletorio;

import ec.edu.uce.Supletorio.Model.Task;
import ec.edu.uce.Supletorio.Service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SupletorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupletorioApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDatabase(TaskService taskService) {
		return args -> {
			taskService.createTask(new Task("Comprar suministros", "Comprar material de oficina", Task.TaskStatus.PENDING, LocalDateTime.now()));
			taskService.createTask(new Task("Preparar reporte mensual", "Compilar datos y preparar el reporte del mes", Task.TaskStatus.PENDING, LocalDateTime.now()));
		};
	}
}
