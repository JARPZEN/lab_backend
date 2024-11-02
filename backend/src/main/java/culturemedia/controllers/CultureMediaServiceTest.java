package backend.src.main.java.culturemedia.controllers;


import backend.src.main.java.culturemedia.exception.VideoNotFoundException;
import backend.src.main.java.culturemedia.model.repository.RecordVideo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


public class CultureMediaServiceTest {

    @Mock
    private CultureMediaService cultureMediaService;

    private CultureMediaController cultureMediaController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    // Prueba para findAll
    @Test
    public void testFindAllVideosSuccess() throws VideoNotFoundException {
        // Configurar el mock para devolver una lista con un video
        List<RecordVideo> mockVideos = List.of(new RecordVideo(0));
        when(cultureMediaService.findAll()).thenReturn(mockVideos);

        List<RecordVideo> videos = cultureMediaController.findAllVideos();

        assertNotNull(videos);
        assertEquals(1, videos.size());
    }

    @Test
    public void testFindAllVideosThrowsException() throws VideoNotFoundException {
        // Configurar el mock para lanzar VideoNotFoundException
        when(cultureMediaService.findAll()).thenThrow(new VideoNotFoundException("No videos found"));

        VideoNotFoundException exception = assertThrows(VideoNotFoundException.class, () -> {
            cultureMediaController.findAllVideos();
        });

        assertEquals("No videos found", exception.getMessage());
    }

    // Prueba para findById
    @Test
    public void testFindByIdSuccess() throws VideoNotFoundException {
        RecordVideo mockVideo = new RecordVideo(0);
        when(cultureMediaService.findById(1L)).thenReturn(mockVideo);

        RecordVideo video = cultureMediaService.findById(1L);

        assertNotNull(video);
    }

    @Test
    public void testFindByIdThrowsException() throws VideoNotFoundException {
        when(cultureMediaService.findById(2L)).thenThrow(new VideoNotFoundException("Video not found with id 2"));

        VideoNotFoundException exception = assertThrows(VideoNotFoundException.class, () -> {
            cultureMediaService.findById(2L);
        });

        assertEquals("Video not found with id 2", exception.getMessage());
    }
}
