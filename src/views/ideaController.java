package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.scenesChanger;

public class ideaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    private Button next;

    @FXML
    void goBack(ActionEvent event) throws IOException{
    	scenesChanger sc = new scenesChanger();
    	sc.changeScene(event,"/views/defProblem.fxml");

    }

    @FXML
    void goNext(ActionEvent event) throws IOException {
    	scenesChanger sc = new scenesChanger();
    	sc.changeScene(event,"/views/correttezza.fxml");

    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'idea.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'idea.fxml'.";

    }
}