package views;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import model.scenesChanger;

public class correttezzaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    private Button next;
    
    @FXML
    private Button definition;

    @FXML
    private Button corollary;

    @FXML
    void checkCorollary(ActionEvent event) {
         alertWindow corollario = new alertWindow();
         corollario.createAlert(AlertType.INFORMATION, "boh", "Definizione di taglio");
    }

    @FXML
    void checkDefinition(ActionEvent event) {
    	alertWindow corollario = new alertWindow();
        corollario.createAlert(AlertType.INFORMATION, "boh", "Corollario");
    }

    @FXML
    void goBack(ActionEvent event) throws IOException{
    	scenesChanger sc = new scenesChanger();
    	sc.changeScene(event,"/views/idea.fxml");
    }

    @FXML
    void goNext(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'correttezza.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'correttezza.fxml'.";
        assert definition != null : "fx:id=\"definition\" was not injected: check your FXML file 'correttezza.fxml'.";
        assert corollary != null : "fx:id=\"corollary\" was not injected: check your FXML file 'correttezza.fxml'.";
    }
}

