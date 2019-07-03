package lezione1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.sceneController;

import java.io.IOException;

public class navController implements model.ISceneController{

    sceneController sc;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        sc.goBack();
    }

    @FXML
    void goNext(ActionEvent event) throws IOException {
        sc.goNext();
    }

    @Override
    public void setSceneParent(sceneController sceneParent) {
        sc = sceneParent;
    }
}
