package progetto.greedy;

import Prim.model.primLoad;
import intro_KP.model.introLoad;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ISceneController;
import model.introSceneLoader;
import model.sceneController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class algoritmiController implements ISceneController {

	sceneController sc;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane lessonP;

    @FXML
    void openIntro(ActionEvent event) throws IOException {
//        introLoad introPK = new introLoad();
//        Stage primaryStage = (Stage) lessonP.getScene().getWindow();
//        try {
//            introPK.start(primaryStage);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
    	
    	// progettoController menu = new progettoController();
	     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	     sc.getProgetto().loadController(1,window);
    }

    @FXML
    void openKruskal(ActionEvent event) throws IOException{
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	     sc.getProgetto().loadController(3,window);
    }

    @FXML
    void openPrim (ActionEvent event) throws IOException {
//        primLoad Prim = new primLoad();
//        Stage primaryStage = (Stage) lessonP.getScene().getWindow();
//        try {
//            Prim.start(primaryStage);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//    	 progettoController menu = new progettoController ();
	    
//	     menu.loadController(2,window);
    	
    	 Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	 sc.getProgetto().loadController(2, window);
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException  {
//        try{
//            AnchorPane mPane = FXMLLoader.load(getClass().getResource("menu.fxml"));
//            Scene mScene = new Scene(mPane);
//            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//            window.setScene(mScene);
//            window.show();
//        }catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
    	
    	
	    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	    sc.goBack();	

    }

    @FXML
    void initialize() {

    }

	@Override
	public void setSceneParent(sceneController sceneParent) {		
		sc = sceneParent;
	}
}