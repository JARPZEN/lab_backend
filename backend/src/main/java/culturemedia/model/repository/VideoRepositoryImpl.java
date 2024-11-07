package backend.src.main.java.culturemedia.model.repository;

import java.util.ArrayList;
import java.util.List;

public class VideoRepositoryImpl implements VideoRepository {

    public List<RecordVideo> findAll() {
        // Implementación para obtener todos los videos
        return new ArrayList<>(); // Ejemplo de retorno
    }

    @Override
    public List<RecordVideo> findByTitle(String title) {
        return List.of();
    }

    @Override
    public List<RecordVideo> findByDurationRange(Double fromDuration, Double toDuration) {
        return List.of();
    }

    @Override
    public List<RecordVideo> find(String title) {
        // Implementación para buscar videos por título
        return new ArrayList<>(); // Ejemplo de retorno
    }

    @Override
    public List<RecordVideo> find(Double fromDuration, Double toDuration) {
        // Implementación para buscar videos por duración
        return new ArrayList<>(); // Ejemplo de retorno
    }
}