package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class primController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    private Button start;

    @FXML
    void goBack(ActionEvent event) {

    }

    @FXML
    void start(ActionEvent event) throws IOException {
    	scenesChanger sc = new scenesChanger();
    	sc.changeScene(event,"/views/overView.fxml");
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'prim.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'prim.fxml'.";

    }
}