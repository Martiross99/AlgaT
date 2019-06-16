package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class overViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;
    
    @FXML
    private Button alert;
    @FXML
    private Circle c2;

    @FXML
    private Circle c1;

    @FXML
    private Circle c5;

    @FXML
    private Circle c3;

    @FXML
    private Circle c4;
 


    private Circle cerchio[] = {c1,c2,c3,c4,c5};

    @FXML
    void goBack(ActionEvent event) throws IOException {
    	scenesChanger sc = new scenesChanger();
    	sc.changeScene(event,"/views/prim.fxml");
    }
    
    @FXML
    void information(ActionEvent event) throws IOException {
         alertWindow aw = new alertWindow();
         aw.createAlert(AlertType.WARNING,"Per iniziare questa demo devi aver letto i capitoli...");
    }
    

    @FXML
    void toFill(MouseEvent event) {
      Circle x = (Circle) event.getSource();
      x.setFill(Color.LIGHTCORAL);
    }

    @FXML
    void unfill(MouseEvent event) {
    	Circle x = (Circle) event.getSource();
        x.setFill(Color.WHITESMOKE);
    }
    
    @FXML
    void gotoApp(MouseEvent event) {

    }

    @FXML
    void gotoConcept(MouseEvent event) throws IOException {
         scenesChanger sc = new scenesChanger();
         sc.mouseScene(event,"/views/concept.fxml");
    }

    @FXML
    void gotoEfficiency(MouseEvent event) {

    }

    @FXML
    void gotoEsercizi(MouseEvent event) {

    }

    @FXML
    void gotoImplementation(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'overView.fxml'.";
        assert alert != null : "fx:id=\"alert\" was not injected: check your FXML file 'overView.fxml'.";
        assert c4 != null : "fx:id=\"c4\" was not injected: check your FXML file 'overView.fxml'.";
        assert c3 != null : "fx:id=\"c3\" was not injected: check your FXML file 'overView.fxml'.";
        assert c5 != null : "fx:id=\"c5\" was not injected: check your FXML file 'overView.fxml'.";
        assert c1 != null : "fx:id=\"c1\" was not injected: check your FXML file 'overView.fxml'.";
        assert c2 != null : "fx:id=\"c2\" was not injected: check your FXML file 'overView.fxml'.";
    }
    
}