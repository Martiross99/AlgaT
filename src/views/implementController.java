package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import model.sceneController;
import model.sceneLoader;

public class implementController implements model.ISceneController  {

	sceneController sc;
	
    @FXML
    private Circle c1,c2;
    
    @FXML
    private Label answer;
    
    @FXML
    private Button back, next;


    @FXML
    void getAnswer(MouseEvent event) {
    	 Circle c = (Circle) event.getSource();
    	 answer.setFont(Font.font("Arial",FontWeight.BOLD,FontPosture.REGULAR, 17));
    	 answer.setOpacity(1.00);
    	 if(c == c2) {
    		 answer.setText("Corretto!");
    		 answer.setDisable(false);
    		 toColor(c2);
    	 }
    	 else {
    		 answer.setText("Sbagliato");
    		 answer.setDisable(false);
    		 toColor(c1);
    	 }
    }

    @FXML
    void toColor(MouseEvent event) {
       Circle c = (Circle) event.getSource();
       c.setStroke(Color.CORAL);
    }

    @FXML
    void toUncolor(MouseEvent event) {
    	Circle c = (Circle) event.getSource();
        c.setStroke(Color.BLACK);;
    }
    
    void toColor(Circle c) {
    	c.setStroke(Color.CORAL);
    }
    
    
    @FXML
    void goBack(ActionEvent event) {
       sc.setScene(sceneLoader.correttezza);
    }

    @FXML
    void goNext(ActionEvent event) {
       sc.setScene(sceneLoader.pseudoCodice);
    }
    
	@Override
	public void setSceneParent(sceneController sceneParent) {
		sc = sceneParent;		
	}
    
    @FXML
    void initialize() {
        assert c1 != null : "fx:id=\"c1\" was not injected: check your FXML file 'implementation.fxml'.";
        assert c2 != null : "fx:id=\"c2\" was not injected: check your FXML file 'implementation.fxml'.";
        assert answer != null : "fx:id=\"answer\" was not injected: check your FXML file 'implementation.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'implementation.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'implementation.fxml'.";
    }
}
