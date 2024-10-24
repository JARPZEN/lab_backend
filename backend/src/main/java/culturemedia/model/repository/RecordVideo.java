package backend.src.main.java.culturemedia.model.repository;

public class RecordVideo {
    private static String code;
    private String title;
    private String description;
    private double duration;

    // Constructor
    public RecordVideo(String code, String title, String description, double duration) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    // Getters y Setters (opcional para acceder a las variables)
    public static String getCode() {
        return code;
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
}

