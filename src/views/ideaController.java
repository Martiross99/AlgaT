package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.sceneController;
import model.sceneLoader;
import model.scenesChanger;

public class ideaController implements model.ISceneController{

	sceneController sc;
	
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
       sc.setScene(sceneLoader.defProblem);
    }

    @FXML
    void goNext(ActionEvent event) throws IOException {
    	sc.setScene(sceneLoader.correttezza);
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'idea.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'idea.fxml'.";

    }

	@Override
	public void setSceneParent(sceneController sceneParent) {
		sc = sceneParent;
	}
}