package progetto.greedy;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lezione1.introSceneLoader;
import model.ISceneController;
import model.sceneController;

public class lezioniController implements ISceneController {

	
	sceneController sc;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane lessonP;

    @FXML

    void openLesson1(ActionEvent event) {    	
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
   	    sc.getProgetto().loadController(4, window);
    }



    @FXML
    void openAlgoritmi(ActionEvent event) {
    	sc.goNext();
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException {
//    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//    	sc.getProgetto().gotoMenu(window);
    //	sc.goBack();
    	sc.setScene(1);
    }

    @FXML
    void initialize() {

    }

	@Override
	public void setSceneParent(sceneController sceneParent) {
		sc = sceneParent;
		
	}
}