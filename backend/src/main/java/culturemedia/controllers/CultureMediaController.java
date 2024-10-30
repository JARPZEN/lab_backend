package backend.src.main.java.culturemedia.controllers;


import backend.src.main.java.culturemedia.exception.VideoNotFoundException;
import backend.src.main.java.culturemedia.model.repository.RecordVideo;

import java.util.List;

public class CultureMediaController {

    private final CultureMediaServiceImpl cultureMediaService;


    public CultureMediaController(CultureMediaServiceImpl cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }


    public List<RecordVideo> find_allVideos() throws VideoNotFoundException {
        List<RecordVideo> videos = null;
        videos = cultureMediaService.findAll();
        return videos;
    }


}