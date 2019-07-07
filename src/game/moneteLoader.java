package game;

import model.sceneController;

public class moneteLoader {

    public static Integer monete = 1;
    public static String moneteScene= "/game/monete.fxml";



    public sceneController Load(sceneController controller) throws Exception {

        controller.loadScene(monete, moneteScene);

        controller.setScene(monete);

        return controller;

    }
}
