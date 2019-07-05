package progetto.greedy;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ISceneController;
import model.introSceneLoader;
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
//        introSceneLoader intro = new introSceneLoader();
//        Stage primaryStage = (Stage) lessonP.getScene().getWindow();
//        try {
//            intro.start(primaryStage);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
    }

    @FXML
    void openAlgoritmi(ActionEvent event) {
//        try{
//            AnchorPane mPane = FXMLLoader.load(getClass().getResource("algoritmi.fxml"));
//            Scene mScene = new Scene(mPane);
//            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//            window.setScene(mScene);
//            window.show();
//        }catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
    	sc.goNext();
    }

    @FXML
    void openMenu(ActionEvent event) {
//        try{
//            AnchorPane mPane = FXMLLoader.load(getClass().getResource("menu.fxml"));
//            Scene mScene = new Scene(mPane);
//            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//            window.setScene(mScene);
//            window.show();
//        }catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
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