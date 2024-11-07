package backend.src.main.java.culturemedia.model.repository;

import java.util.ArrayList;
import java.util.List;

import backend.src.main.java.culturemedia.View;
import backend.src.main.java.culturemedia.exception.VideoNotFoundException;
import backend.src.main.java.culturemedia.reproduccionService;

public class ViewsRepositoryImpl extends ViewRepository {

    private final List<View> views;

    public ViewsRepositoryImpl() {
        this.views = new ArrayList<>();
    }

    public static class ReproduccionServiceImpl extends RecordVideo implements reproduccionService {
        // Dependencia del repositorio
        private ViewRepository viewRepository;

        // Constructor donde inyectamos el repositorio
        public ReproduccionServiceImpl(ViewRepository viewsRepository) {
            super(0);
            this.viewRepository = viewsRepository;
        }

        public ReproduccionServiceImpl(String testVideo, String testUrl) {
            super(0);
        }

        public static void addVideo(RecordVideo video) {
        }

        @Override
        public RecordVideo agregarReproduccion(RecordVideo reproduccion) {
            return null;
        }

        // Implementación del método para agregar una reproducción
        @Override
        public View agregarReproduccion(View reproduccion) {
            // Aquí puedes agregar lógica adicional si lo deseas (ej. validaciones)
            return viewRepository.agregar(reproduccion);
        }

        // Implementación del método para obtener todas las reproducciones
        public List<View> obtenerReproducciones() {
            return viewRepository.getReproducciones();
        }

        // Implementación del método para buscar una reproducción por ID
        public String buscarReproduccionPorId(String id) {
            // Puedes recorrer la lista de reproducciones y buscar por ID, o usar otras estrategias
            for (View View : viewRepository.getReproducciones()) {
                if (RecordVideo.getCode().equals(id)) {
                    return RecordVideo.getCode();
                }
            }
            return null;  // Retorna null si no encuentra la reproducción
        }
        // Método para obtener todos los videos
        public static List<RecordVideo> findAll() throws VideoNotFoundException {
            List<RecordVideo> videos = VideoRepository.findAll();
            if (videos.isEmpty()) {
                throw new VideoNotFoundException("No videos found");
            }
            return videos;
        }


        // Método para guardar un video
        public static RecordVideo save(ReproduccionServiceImpl video) {
            if (video == null) {
                throw new IllegalArgumentException("Video cannot be null");
            }
            return VideoRepository.save(video);
        }


        // Método para guardar una view
        public View save() {
            return save((View) null);
        }

        // Método para guardar una view
        public static View save(View view) {
            if (view == null) {
                throw new IllegalArgumentException("View cannot be null");
            }
            return ViewRepository.save(view);
        }

    }
}