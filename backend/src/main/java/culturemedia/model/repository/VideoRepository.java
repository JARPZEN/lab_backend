package backend.src.main.java.culturemedia.model.repository;

import java.util.List;

public interface VideoRepository {

    static List<RecordVideo> findAll() {
        return List.of();
    }

    static ViewsRepositoryImpl.ReproduccionServiceImpl save(RecordVideo video) {
        return null;
    }

    // Método para buscar videos por título
    List<RecordVideo> findByTitle(String title);

    // Método para buscar videos por duración
    List<RecordVideo> findByDurationRange(Double fromDuration, Double toDuration);

    List<RecordVideo> find(String title);  // Método para buscar videos por título
    List<RecordVideo> find(Double fromDuration, Double toDuration);  // Método para buscar videos por duración
}

