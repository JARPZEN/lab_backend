package backend.src.main.java.culturemedia.controllers;

import backend.src.main.java.culturemedia.exception.VideoNotFoundException;
import backend.src.main.java.culturemedia.model.repository.RecordVideo;

import java.util.ArrayList;
import java.util.List;

public class CultureMediaServiceImpl implements CultureMediaService {

    @Override
    public List<RecordVideo> findAll() throws VideoNotFoundException {
        List<RecordVideo> videos = new ArrayList<>();
        if (videos.isEmpty()) {
            throw new VideoNotFoundException("No videos found");
        }
        return videos;
    }

    @Override
    public RecordVideo findById(Long id) throws VideoNotFoundException {
        // Aquí se asume que no hay video con el ID solicitado para este ejemplo.
        throw new VideoNotFoundException("Video not found with id " + id);
    }
}

