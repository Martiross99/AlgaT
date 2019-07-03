package progetto.greedy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.introSceneLoader;

import java.net.URL;
import java.util.ResourceBundle;

public class algoritmiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane lessonP;

    @FXML
    void openIntro(ActionEvent event) {
        introSceneLoader intro = new introSceneLoader();
        Stage primaryStage = (Stage) lessonP.getScene().getWindow();
        try {
            intro.start(primaryStage);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openKruskal(ActionEvent event) {

    }

    @FXML
    void openPrim (ActionEvent event){

    }

    @FXML
    void openMenu(ActionEvent event) {
        try{
            AnchorPane mPane = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Scene mScene = new Scene(mPane);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(mScene);
            window.show();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void initialize() {

    }
}