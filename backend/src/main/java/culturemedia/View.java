package backend.src.main.java.culturemedia;

import backend.src.main.java.culturemedia.model.repository.RecordVideo;

import java.time.LocalDateTime;

public record View (String userFullName, LocalDateTime startPlayingtime, Integer age, RecordVideo video) {
    public View(int i, String testView) {
    }

    public String Video() {
        return userFullName;
    }
}
