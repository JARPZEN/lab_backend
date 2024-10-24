package backend.src.main.java.culturemedia.model.repository;

import backend.src.main.java.culturemedia.View;
import backend.src.main.java.culturemedia.exception.VideoNotFoundException;
import java.util.List;

public class RecordVideo {
    private static String code;
    private String title;
    private String description;
    private double duration;

    // Constructor
    public RecordVideo(String code, String title) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    // Getters y Setters (opcional para acceder a las variables)
    public static String getCode() {
        return code;
    }

    public static void addVideo(RecordVideo recordVideo) {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String title() {
        return "title";
    }

    public Double duration() {
        return duration;
    }

    //metodo para obtener todos los videos
    public static List<RecordVideo> findAll() throws VideoNotFoundException {
        List<RecordVideo> videos = VideoRepository.findAll();
        if (videos.isEmpty()) {
            throw new VideoNotFoundException("No videos found");
        }
        return videos;
    }

    // Método para guardar un video
    public RecordVideo save(RecordVideo video) {
        return VideoRepository.save(video);
    }

    // Método para guardar una view
    public View save(View view) {
        return ViewRepository.save(view);
    }
}


