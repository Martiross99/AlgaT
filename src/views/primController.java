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
import model.sceneController;
import model.sceneLoader;
import model.scenesChanger;
import progetto.greedy.Main;


public class primController implements model.ISceneController {

	sceneController sc;
	
	
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
    	sc.setScene(sceneLoader.overView);
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'prim.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'prim.fxml'.";

    }

	@Override
	public void setSceneParent(sceneController parent) {
		sc = parent;
		
	}
}