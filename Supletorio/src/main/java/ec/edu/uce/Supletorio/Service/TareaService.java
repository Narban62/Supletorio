package ec.edu.uce.Supletorio.Service;

import ec.edu.uce.Supletorio.Entidades.Tarea;
import ec.edu.uce.Supletorio.Repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    @Autowired
    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public Tarea crearTarea(Tarea tarea) {
        tarea.setFechaCreacion(LocalDateTime.now());
        return tareaRepository.save(tarea);
    }

    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.findAll();
    }

    public Optional<Tarea> obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id);
    }

    public Tarea actualizarTarea(Long id, Tarea tareaActualizada) {
        if (!tareaRepository.existsById(id)) {
            return null;
        }
        tareaActualizada.setId(id);
        return tareaRepository.save(tareaActualizada);
    }

    public boolean eliminarTarea(Long id) {
        if (tareaRepository.existsById(id)) {
            tareaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Tarea crearTareaEjemplo() {
        Tarea tarea = new Tarea();
        tarea.setTitulo("Comprar leche");
        tarea.setDescripcion("Comprar leche para la semana");
        tarea.setEstado(Tarea.Estado.PENDIENTE);
        tarea.setFechaCreacion(LocalDateTime.now());
        return tareaRepository.save(tarea);
    }
}
