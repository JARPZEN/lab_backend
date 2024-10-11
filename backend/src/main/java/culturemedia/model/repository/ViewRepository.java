package backend.src.main.java.culturemedia.model.repository;

import backend.src.main.java.culturemedia.View;

import java.util.ArrayList;
import java.util.List;

public class ViewRepository {
    private List<View> reproducciones;

    // Constructor que inicializa la lista de reproducciones
    public ViewRepository() {
        this.reproducciones = new ArrayList<>();
    }

    // Método para agregar una reproducción
    public View agregar(View View) {
        this.reproducciones.add(View);
        return View;  // Retorna la reproducción agregada
    }

    // Método para obtener todas las reproducciones (opcional)
    public List<View> getReproducciones() {
        return reproducciones;
    }
}

