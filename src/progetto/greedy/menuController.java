package progetto.greedy;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ISceneController;
import model.sceneController;

public class menuController implements ISceneController {

	sceneController sc;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BLEZ;

    @FXML
    private Button BGAME;

    @FXML
    void openLezioni(ActionEvent event) {
//        try{
//            AnchorPane subPane = FXMLLoader.load(getClass().getResource("lezioni.fxml"));
//            Scene subScene = new Scene(subPane);
//            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//            window.setScene(subScene);
//            window.show();
//        } catch(Exception e){
//            System.out.println(e.getMessage());
//        }
    	sc.goNext();
    }

    @FXML
    void openMonete(ActionEvent event) {
//        try{
//            AnchorPane subPane = FXMLLoader.load(getClass().getResource("../../game/monete.fxml"));
//            Scene subScene = new Scene(subPane);
//            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//            window.setScene(subScene);
//            window.show();
//        } catch(Exception e){
//            System.out.println(e.getMessage());
//        }
    	
//    	sc.goNext();
    }

    @FXML
    void initialize() {
        assert BLEZ != null : "fx:id=\"BLEZ\" was not injected: check your FXML file 'menu.fxml'.";
        BLEZ.setOnAction(event -> openLezioni(event));
        assert BGAME != null : "fx:id=\"BGAME\" was not injected: check your FXML file 'menu.fxml'.";
    //    BGAME.setOnAction(event -> openMonete(event));

    }

	@Override
	public void setSceneParent(sceneController sceneParent) {
		sc = sceneParent;
		
	}

}