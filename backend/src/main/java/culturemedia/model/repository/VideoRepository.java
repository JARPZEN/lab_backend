package backend.src.main.java.culturemedia.model.repository;

import java.util.List;

public interface VideoRepository {
    static List<RecordVideo> findAll()  // Método para obtener todos los videos
    {
        return null;
    }

    static RecordVideo save(RecordVideo save)  // Método para guardar un video
    {
        return null;
    }

    List<RecordVideo> find(String title);  // Método para buscar videos por título
    List<RecordVideo> find(Double fromDuration, Double toDuration);  // Método para buscar videos por duración
}

