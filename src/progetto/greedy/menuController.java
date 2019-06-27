package progetto.greedy;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class menuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BLEZ;

    @FXML
    private Button BES;

    @FXML
    private Button BGAME;

    @FXML
    void openSection(ActionEvent event, String page) {
        try{
            Group subPane = FXMLLoader.load(getClass().getResource("lezione_1.fxml"));
            setOnlyFirstPage(subPane);
            Scene subScene = new Scene(subPane);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(subScene);
        } catch(Exception e){};
    }

    @FXML
    void initialize() {
        assert BLEZ != null : "fx:id=\"BLEZ\" was not injected: check your FXML file 'menu.fxml'.";
        BLEZ.setOnAction(event -> openSection(event, BLEZ.getText()));
        assert BES != null : "fx:id=\"BES\" was not injected: check your FXML file 'menu.fxml'.";
        assert BGAME != null : "fx:id=\"BGAME\" was not injected: check your FXML file 'menu.fxml'.";

    }
    
    void setOnlyFirstPage(Group pages){
        for (Node p: pages.getChildren()) {
            p.setVisible(false);
        }
        pages.getChildren().get(0).setVisible(true);
    }

}