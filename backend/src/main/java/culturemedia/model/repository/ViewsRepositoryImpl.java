package backend.src.main.java.culturemedia.model.repository;

import java.util.ArrayList;
import java.util.List;

import backend.src.main.java.culturemedia.View;

public class ViewsRepositoryImpl extends ViewRepository {

    private final List<View> views;

    public ViewsRepositoryImpl() {
        this.views = new ArrayList<>();
    }

    @Override
    public View save(View view) {
        this.views.add( view );
        return view;
    }
}