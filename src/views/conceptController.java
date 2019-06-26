package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import model.sceneController;
import model.sceneLoader;
import model.scenesChanger;

public class conceptController implements model.ISceneController {

	sceneController sc;
	
	ObservableList<String> definizioni = FXCollections.observableArrayList("Grafo non orientato e connesso","Albero di copertura", "Albero di copertura minimo", "Pesi");
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


	@FXML
    private ChoiceBox<String> cbox ;

    @FXML
    private CheckBox check1,check2,check3,check4;

    @FXML
    private Button done;
    
    @FXML
    private Button controlla;

    @FXML
    private Button back;
    
    
    
    @Override
	public void setSceneParent(sceneController parent) {   
    	sc = parent;
	}

    @FXML
    void goBack(ActionEvent event) throws IOException {
//    	scenesChanger sc = new scenesChanger();
//    	sc.changeScene(event,"/views/overView.fxml");
    }

    @FXML
    void verify(ActionEvent event) {
    	//CheckBox[] cb = {check1,check2,check3,check4};
        if(check1.isSelected() && check2.isSelected() && check3.isSelected() && check4.isSelected()) done.setDisable(false);
        if(!check1.isSelected() || !check2.isSelected() || !check3.isSelected() || !check4.isSelected()) done.setDisable(true);
    }

    @FXML
    void goOn(ActionEvent event) throws IOException {
          sc.setScene(sceneLoader.defProblem);
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

    @FXML
    void initialize() {
        assert check1 != null : "fx:id=\"check1\" was not injected: check your FXML file 'concept.fxml'.";
        assert check2 != null : "fx:id=\"check2\" was not injected: check your FXML file 'concept.fxml'.";
        assert check3 != null : "fx:id=\"check3\" was not injected: check your FXML file 'concept.fxml'.";
        assert check4 != null : "fx:id=\"check4\" was not injected: check your FXML file 'concept.fxml'.";
        assert done != null : "fx:id=\"done\" was not injected: check your FXML file 'concept.fxml'.";
        assert cbox != null : "fx:id=\"cbox\" was not injected: check your FXML file 'concept.fxml'.";
        cbox.setValue("Pesi");
        cbox.setItems(definizioni);
        assert controlla != null : "fx:id=\"controlla\" was not injected: check your FXML file 'concept.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'concept.fxml'.";
    }
}
