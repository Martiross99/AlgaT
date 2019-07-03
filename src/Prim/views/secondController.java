package Prim.views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import model.introLoad;
import model.primLoad;
import model.sceneController;


//classe per la gestione dei seguenti file : idea.fxml, correttezza.fxml, implementation.fxml

public class secondController implements model.ISceneController{

	sceneController sc;

    @FXML
    private Button back, next;
    @FXML
    private Circle c1,c2;   //fxml implementazione
    
    @FXML
    private Label answer;

    @FXML
    private Button definition, corollary; //fxml correttezza
    
    
    @FXML
    private ImageView immagine;    //fxml pseudocode


    
//FUNZIONI DI GESTIONE DELL'FXML CORRETTEZZA
    
    @FXML
    void checkCorollary(ActionEvent event) throws IOException {
         sc.setScene(introLoad.introIV);
    }

    @FXML
    void checkDefinition(ActionEvent event) throws IOException {
    	alertWindow definizione = new alertWindow();
    	definizione.createAlert(AlertType.INFORMATION, 4, "Definizione Taglio");
    }
   
//FUNZIONI DI GESTIONE DELL'FXML IMPLEMENTAZIONE
    
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
    
 
 //funzioni che gestiscono il cambio delle scene   
    
    @FXML
    void goBack(ActionEvent event) throws IOException{
       sc.goBack();
    }

    @FXML
    void goNext(ActionEvent event) throws IOException {
    	sc.goNext();
    }
    
	@Override
	public void setSceneParent(sceneController sceneParent) {
		sc = sceneParent;
	}

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'idea.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'idea.fxml'.";
        
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'correttezza.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'correttezza.fxml'.";
        assert definition != null : "fx:id=\"definition\" was not injected: check your FXML file 'correttezza.fxml'.";
        assert corollary != null : "fx:id=\"corollary\" was not injected: check your FXML file 'correttezza.fxml'.";
        
        assert c1 != null : "fx:id=\"c1\" was not injected: check your FXML file 'implementation.fxml'.";
        assert c2 != null : "fx:id=\"c2\" was not injected: check your FXML file 'implementation.fxml'.";   
        assert answer != null : "fx:id=\"answer\" was not injected: check your FXML file 'implementation.fxml'.";
     

       assert immagine != null : "fx:id=\"immagine\" was not injected: check your FXML file 'pseudocodice.fxml'.";
        if(immagine!=null) immagine.setImage(new Image("/Image/prim.jpg"));
       
    }

}