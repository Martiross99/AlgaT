package views;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import model.sceneController;
import model.sceneLoader;


public class conceptController implements model.ISceneController {

	sceneController sc;
	
	ObservableList<String> definizioni = FXCollections.observableArrayList("Grafo non orientato e connesso","Albero di copertura", "Albero di copertura minimo", "Pesi");
	
    @FXML
    private Button back, next, controlla;
    
    @FXML
    private ImageView image;

    @FXML
    private Label kruskal;


	@FXML
    private ChoiceBox<String> cbox ;

    @FXML
    private CheckBox check1,check2,check3,check4;

    
//FUNZIONI CHE GESTISCNO L'FXML CONCEPT
    
    @FXML
    void verify(ActionEvent event) {
        if(check1.isSelected() && check2.isSelected() && check3.isSelected() && check4.isSelected()) next.setDisable(false);
        if(!check1.isSelected() || !check2.isSelected() || !check3.isSelected() || !check4.isSelected()) next.setDisable(true);
    }

    @FXML
    void tocheck(ActionEvent event) throws IOException {
        String s = cbox.getValue();
        alertWindow info = new alertWindow();
		if(s == definizioni.get(1))
             info.createAlert(AlertType.INFORMATION, "x","Definizione Albero di copetura");
        else if (s==definizioni.get(2))
        	 info.createAlert(AlertType.INFORMATION, "y", "Definizione Albero di copertura minimo");
        else if (s==definizioni.get(3))
        	 info.createAlert(AlertType.INFORMATION, "z", "Definizione Pesi");
        else  info.createAlert(AlertType.INFORMATION, "w", "Definzione Grafo non orientato e connesso");
    }

  //FUNZIONI CHE GESTISCONO L'FXML DEFPROBLEM
    
    @FXML
    void gotoKruskal(MouseEvent event) {

    }
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
       sc.goBack();
    }
    
    @FXML
    void goNext(ActionEvent event) throws IOException {
          sc.goNext();
    }
    
    
    @Override
	public void setSceneParent(sceneController parent) {   
    	sc = parent;
	}
    
    
    @FXML
    void initialize() {
    	
    	  assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'defProblem.fxml'.";
	      assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'defProblem.fxml'.";
	      
    	  assert cbox != null : "fx:id=\"cbox\" was not injected: check your FXML file 'concept.fxml'.";
          assert check1 != null : "fx:id=\"check1\" was not injected: check your FXML file 'concept.fxml'.";
          assert check3 != null : "fx:id=\"check3\" was not injected: check your FXML file 'concept.fxml'.";
          assert check2 != null : "fx:id=\"check2\" was not injected: check your FXML file 'concept.fxml'.";
          assert check4 != null : "fx:id=\"check4\" was not injected: check your FXML file 'concept.fxml'.";
          assert controlla != null : "fx:id=\"controlla\" was not injected: check your FXML file 'concept.fxml'.";
          if(cbox != null) { cbox.setValue("Pesi"); cbox.setItems(definizioni); }
          
	      assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'defProblem.fxml'.";
	      assert kruskal != null : "fx:id=\"kruskal\" was not injected: check your FXML file 'defProblem.fxml'.";
           if(image!=null)   image.setImage(new Image("/Image/Minimum_spanning_tree.png"));
    }
}
