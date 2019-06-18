package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.scenesChanger;

public class overViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;
    
    @FXML
    private Button next;
    
    @FXML
    private Button alert;
    
    @FXML
    private StackPane sp1,sp2,sp3,sp4,sp5,sp6;


    @FXML
    void goBack(ActionEvent event) throws IOException {
    	scenesChanger sc = new scenesChanger();
    	sc.changeScene(event,"/views/prim.fxml");
    }
    
    @FXML
    void goNext(ActionEvent event) throws IOException {
    	scenesChanger sc = new scenesChanger();
    	sc.changeScene(event,"/views/concept.fxml");
    }
    
    @FXML
    void information(ActionEvent event) throws IOException {
         alertWindow aw = new alertWindow();
         aw.createAlert(AlertType.WARNING,"Per iniziare questa demo devi aver letto i capitoli...", "Nota Bene");
    }
    

    @FXML
    void toFill(MouseEvent event)  throws IOException {
    	StackPane x = (StackPane) event.getSource();
    	Circle c = (Circle) x.getChildren().get(0);
    	c.setFill(Color.LIGHTCORAL);
    }

    @FXML
    void unfill(MouseEvent event)  throws IOException{
    	StackPane x = (StackPane) event.getSource();
    	Circle c = (Circle) x.getChildren().get(0);
    	c.setFill(Color.WHITESMOKE);
    }
    
    @FXML
    void gotoApp(MouseEvent event) {

    }

    @FXML
    void gotoIdea(MouseEvent event) throws IOException {
         scenesChanger sc = new scenesChanger();
         sc.mouseScene(event,"/views/idea.fxml");
    }
    
    @FXML
    void gotoCorrect(MouseEvent event) throws IOException {
    	 scenesChanger sc = new scenesChanger();
         sc.mouseScene(event,"/views/correttezza.fxml");
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
        assert alert != null : "fx:id=\"alert\" was not injected: check your FXML file 'overView.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'overView.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'overView.fxml'.";
        assert sp5 != null : "fx:id=\"sp5\" was not injected: check your FXML file 'overView.fxml'.";
        assert sp1 != null : "fx:id=\"sp1\" was not injected: check your FXML file 'overView.fxml'.";
        assert sp3 != null : "fx:id=\"sp3\" was not injected: check your FXML file 'overView.fxml'.";
        assert sp4 != null : "fx:id=\"sp4\" was not injected: check your FXML file 'overView.fxml'.";
        assert sp2 != null : "fx:id=\"sp2\" was not injected: check your FXML file 'overView.fxml'.";
        assert sp6 != null : "fx:id=\"sp6\" was not injected: check your FXML file 'overView.fxml'.";

    }
    
}