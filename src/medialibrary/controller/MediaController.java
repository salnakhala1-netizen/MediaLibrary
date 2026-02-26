
package medialibrary.controller;

import medialibrary.model.Media;
import medialibrary.view.MediaView;
import java.util.ArrayList;
import java.util.List;

public class MediaController {

    private final List<Media> mediaList = new ArrayList<>();
    private final MediaView view;

    public MediaController(MediaView view) {
        this.view = view;
    }

    public void addMedia(String title) {
        mediaList.add(new Media(title));
    }

    public void displayMedia() {
        view.showMedia(mediaList);
    }
}

