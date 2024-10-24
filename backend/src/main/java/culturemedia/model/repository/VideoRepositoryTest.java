package backend.src.main.java.culturemedia.model.repository;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import backend.src.main.java.culturemedia.model.repository.RecordVideo;
import backend.src.main.java.culturemedia.model.repository.VideoRepositoryImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
//volviiiiiii
class VideoRepositoryTest {

    private VideoRepository videoRepository;

    @BeforeEach
    void init(){

        videoRepository = new VideoRepositoryImpl();

        List<RecordVideo> videos = List.of(new RecordVideo("01", "Título 1", "----", 4.5),
                new RecordVideo("02", "Título 2", "----", 5.5),
                new RecordVideo("03", "Título 3", "----", 4.4),
                new RecordVideo("04", "Título 4", "----", 3.5),
                new RecordVideo("05", "Clic 5", "----", 5.7),
                new RecordVideo("06", "Clic 6", "----", 5.1));


        for ( RecordVideo video : videos ) {
            videoRepository.save( video );
        }

    }

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() {
        List<RecordVideo> videos = videoRepository.findAll( );
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

    @Test
    void when_FindByTitle_does_not_match_any_video_an_empty_list_should_be_returned_successfully() {
        assert(false);
    }

    @Test
    void when_FindByDuration_does_not_match_any_video_an_empty_list_should_be_returned_successfully() {
        assert(false);
    }

}
