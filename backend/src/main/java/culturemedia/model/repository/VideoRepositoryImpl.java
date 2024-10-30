package backend.src.main.java.culturemedia.model.repository;

import java.util.ArrayList;
import java.util.List;

public class VideoRepositoryImpl implements VideoRepository {

    private final List<RecordVideo> videos;

    public VideoRepositoryImpl() {
        videos = new ArrayList<>();
    }

    @Override
    public List<RecordVideo> findAll() {
        return videos;
    }

    @Override
    public RecordVideo save(RecordVideo video) {
        this.videos.add( video );
        return video;
    }

    @Override
    public List<RecordVideo> find(String title) {
        List<RecordVideo> filteredVideos = null;
        for ( RecordVideo video : videos ) {
            if(title.equals( video.title() )){
                if(filteredVideos == null){
                    filteredVideos = new ArrayList<RecordVideo>();
                }
                filteredVideos.add(video);
            }
        }
        return filteredVideos;
    }

    @Override
    public List<RecordVideo> find(Double fromDuration, Double toDuration) {
        List<RecordVideo> filteredVideos = new ArrayList<RecordVideo>();
        for ( RecordVideo video : videos ) {
            if(video.duration()> fromDuration && video.duration()< toDuration){
                filteredVideos.add(video);
            }
        }
        return filteredVideos;
    }
}