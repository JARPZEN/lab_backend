package backend.src.main.java.culturemedia;

import backend.src.main.java.culturemedia.model.repository.RecordVideo;

public interface reproduccionService {
    // Método para agregar una nueva reproducción
    RecordVideo agregarReproduccion(RecordVideo reproduccion);

    // Implementación del método para agregar una reproducción
    View agregarReproduccion(View reproduccion);
}

