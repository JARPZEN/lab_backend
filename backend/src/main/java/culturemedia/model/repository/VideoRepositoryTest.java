package backend.src.main.java.culturemedia.model.repository;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import backend.src.main.java.culturemedia.exception.VideoNotFoundException;
import backend.src.main.java.culturemedia.View;
import backend.src.main.java.culturemedia.ReproduccionServiceImpl;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
//volviiiiiii
class VideoRepositoryTest {

    private VideoRepository videoRepository;

    @BeforeEach
    void init(){

        videoRepository = new VideoRepositoryImpl();

        List<RecordVideo> videos = List.of(new RecordVideo("01", "Título 1"),
                new RecordVideo("02", "Título 2"),
                new RecordVideo("03", "Título 3"),
                new RecordVideo("04", "Título 4"),
                new RecordVideo("05", "Clic 5"),
                new RecordVideo("06", "Clic 6"));


        for ( RecordVideo video : videos ) {
            VideoRepository.save( video );
        }

    }

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() {
        List<RecordVideo> videos = VideoRepository.findAll( );
        assertEquals(6, videos.size());
    }

    @Test
    void when_FindByTitle_only_videos_which_contains_the_word_in_the_title_should_be_returned_successfully() {
        List<RecordVideo> videos = videoRepository.find( "Clic" );
        assertEquals(2, videos.size());
    }

    @Test
    void when_FindByDuration_only_videos_between_the_range_should_be_returned_successfully() {
        List<RecordVideo> videos = videoRepository.find( 4.5, 5.5 );
        assertEquals(3, videos.size());
    }


    // Prueba 1: Cuando no hay videos, debería lanzar la excepción VideoNotFoundException
    @Test
    public void testFindAllThrowsVideoNotFoundExceptionWhenNoVideos() {
        // El repositorio de prueba por defecto no tiene videos
        assertThrows(VideoNotFoundException.class, () -> {
            RecordVideo.findAll();
        });
    }

    // Prueba 2: Cuando hay videos, deberían ser retornados correctamente
    @Test
    public void testFindAllReturnsAllVideos() throws VideoNotFoundException {
        // Añadimos videos al repositorio de prueba
        RecordVideo.addVideo(new RecordVideo("Video1", "URL1"));
        RecordVideo.addVideo(new RecordVideo("Video2", "URL2"));

        // Llamada al método y verificación de que retorna los videos correctamente
        List<RecordVideo> result = RecordVideo.findAll();
        assertEquals(2, result.size());
        assertEquals("Video1", result.get(0).getCode());
        assertEquals("Video2", result.get(1).getCode());
    }

    // Pruebas para findAll
    @Test
    public void testFindAllThrowsVideoNotFoundExceptionWhenNoVideos2() {
        assertThrows(VideoNotFoundException.class, () -> {
            ReproduccionServiceImpl.findAll();
        });
    }


    @Test
    public void testFindAllReturnsAllVideos2() throws VideoNotFoundException {
        ReproduccionServiceImpl.addVideo(new RecordVideo("Video1", "URL1"));
        ReproduccionServiceImpl.addVideo(new RecordVideo("Video2", "URL2"));


        List<RecordVideo> result = ReproduccionServiceImpl.findAll();
        assertEquals(2, result.size());
        assertEquals("Video1", result.get(0).getCode());
        assertEquals("Video2", result.get(1).getCode());
    }


    // Pruebas para save(Video video)
    @Test
    public void testSaveVideoStoresVideoCorrectly() {
        ReproduccionServiceImpl video = new ReproduccionServiceImpl("Test Video", "Test URL");
        RecordVideo savedVideo = ReproduccionServiceImpl.save(video);
        assertEquals(video, savedVideo);
    }


    @Test
    public void testSaveVideoThrowsIllegalArgumentExceptionWhenVideoIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            ReproduccionServiceImpl.save((ReproduccionServiceImpl) null);
        });
    }


    // Pruebas para save(View view)
    @Test
    public void testSaveViewStoresViewCorrectly() {
        View view = new View(1, "Test View");
        View savedView = ReproduccionServiceImpl.save(view);
        assertEquals(view, savedView);
    }


    @Test
    public void testSaveViewThrowsIllegalArgumentExceptionWhenViewIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            ReproduccionServiceImpl.save((View) null);
        });
    }

}
