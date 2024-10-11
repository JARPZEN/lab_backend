package backend.src.main.java.culturemedia.model.repository;

import java.util.List;

public interface VideoRepository {
    List<RecordVideo> findAll();  // Método para obtener todos los videos
    RecordVideo save(RecordVideo save);  // Método para guardar un video
    List<RecordVideo> find(String title);  // Método para buscar videos por título
    List<RecordVideo> find(Double fromDuration, Double toDuration);  // Método para buscar videos por duración
}

