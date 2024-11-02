package backend.src.main.java.culturemedia.controllers;

import backend.src.main.java.culturemedia.exception.VideoNotFoundException;
import backend.src.main.java.culturemedia.model.repository.RecordVideo;

import java.util.List;

public interface CultureMediaService {
    List<RecordVideo> findAll() throws VideoNotFoundException;
    RecordVideo findById(Long id) throws VideoNotFoundException;
}

