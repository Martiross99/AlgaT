package progetto.greedy;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class firstController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private Button next;

    @FXML
    private Button prev;


    @FXML
    void changePage(ActionEvent event){
        try {
            Group pages = FXMLLoader.load(getClass().getResource("lezione_1.fxml"));
            setPage(pages);
            Scene newPage = new Scene(pages);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(newPage);
            window.show();
        } catch(Exception e){}
    }


    @FXML
    void initialize(){
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'lezione_1.fxml'.";
        assert prev != null : "fx:id=\"prev\" was not injected: check your FXML file 'lezione_1.fxml'.";
    }

    void setPage(Group pages){
        for (Node p: pages.getChildren()) {
            p.setVisible(false);
        }
        pages.getChildren().get().setVisible(true);
    }
}
