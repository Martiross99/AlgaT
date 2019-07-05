package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.ISceneController;
import model.sceneController;
import model.sceneLoader;
import model.scenesChanger;

	public class defProblemController implements ISceneController {
     
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
	    private ImageView image;
	
	    @FXML
	    private Label kruskal;

	    @FXML
	    void goBack(ActionEvent event) throws IOException{
	    	sc.setScene(sceneLoader.concept);
	    }

	    @FXML
	    void goNext(ActionEvent event) throws IOException {
	    	sc.setScene(sceneLoader.idea);
	    }
	    
	    @FXML
	    void gotoKruskal(MouseEvent event) {

	    }

		@Override
		public void setSceneParent(sceneController sceneParent) {
			sc = sceneParent;	
		}
	    
	    @FXML
	    void initialize() {
	        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'idea.fxml'.";
	        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'idea.fxml'.";
	        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'idea.fxml'.";
            image.setImage(new Image("/Image/Minimum_spanning_tree.png"));
	    }

	}
