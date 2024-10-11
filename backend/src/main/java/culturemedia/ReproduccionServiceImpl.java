package backend.src.main.java.culturemedia;

import backend.src.main.java.culturemedia.model.repository.RecordVideo;
import backend.src.main.java.culturemedia.model.repository.ViewRepository;

import java.util.List;

public abstract class ReproduccionServiceImpl implements reproduccionService {
    // Dependencia del repositorio
    private ViewRepository viewRepository;

    // Constructor donde inyectamos el repositorio
    public ReproduccionServiceImpl(ViewRepository viewsRepository) {
        this.viewRepository = viewsRepository;
    }

    @Override
    public RecordVideo agregarReproduccion(RecordVideo reproduccion) {
        return null;
    }

    // Implementación del método para agregar una reproducción
    @Override
    public View agregarReproduccion(View reproduccion) {
        // Aquí puedes agregar lógica adicional si lo deseas (ej. validaciones)
        return viewRepository.agregar(reproduccion);
    }

    // Implementación del método para obtener todas las reproducciones
    public List<View> obtenerReproducciones() {
        return viewRepository.getReproducciones();
    }

    // Implementación del método para buscar una reproducción por ID
    public String buscarReproduccionPorId(String id) {
        // Puedes recorrer la lista de reproducciones y buscar por ID, o usar otras estrategias
        for (View View : viewRepository.getReproducciones()) {
            if (RecordVideo.getCode().equals(id)) {
                return RecordVideo.getCode();
            }
        }
        return null;  // Retorna null si no encuentra la reproducción
    }
}
