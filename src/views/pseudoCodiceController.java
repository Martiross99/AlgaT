package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.ISceneController;
import model.sceneController;
import model.sceneLoader;

public class pseudoCodiceController implements ISceneController {
    
	sceneController sc;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    private Button back;

    @FXML
    private Button next;

    @FXML
    void goBack(ActionEvent event) {
       sc.setScene(sceneLoader.implementation);
    }

    @FXML
    void goNext(ActionEvent event) {
    	 sc.setScene(sceneLoader.esecuzione);
    }

    @FXML
    void initialize() {
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'pesudocodice.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'pesudocodice.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'pesudocodice.fxml'.";
        image.setImage(new Image("file:C:\\Users\\Erika\\Desktop\\programmi-java\\progettoAlgaT\\src\\Image/PrimAlg.jpg"));
    }

	@Override
	public void setSceneParent(sceneController sceneParent) {
		sc = sceneParent;
	}
}
