
package medialibrary;

import medialibrary.view.MediaView;
import medialibrary.controller.MediaController;

public class Main {

    public static void main(String[] args) {

        MediaView view = new MediaView();
        MediaController controller = new MediaController(view);

        controller.addMedia("Java Lecture");
        controller.addMedia("Software Engineering Notes");

        controller.displayMedia();
    }
}

