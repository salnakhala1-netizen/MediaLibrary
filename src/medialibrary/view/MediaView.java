package medialibrary.view;

import medialibrary.model.Media;
import java.util.List;

public class MediaView {

    public void showMedia(List<Media> list) {

        System.out.println("Media List:");

        for (Media m : list) {
            System.out.println(m.getTitle());
        }
    }
}

