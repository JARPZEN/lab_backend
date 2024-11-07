package backend.src.main.java.culturemedia;

import java.time.LocalDateTime;

public record View() {

    // Constructor adicional
    public View(String userFullName, LocalDateTime startPlayingTime, Integer age) {
        this();
    }

    // Método que devuelve el nombre del usuario completo
    public String getUserFullName(String userFullName) {
        return userFullName;
    }
}