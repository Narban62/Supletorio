package ec.edu.uce.Supletorio.Repository;


import ec.edu.uce.Supletorio.Entidades.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
