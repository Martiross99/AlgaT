package views;

import java.io.IOException;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import model.sceneController;
import model.sceneLoader;

//gestisce i seguenti file FXML : prim.fxml, overView.fxml, concept.fxml, defProblem.fxml

public class firstController implements model.ISceneController {
	
	
		sceneController sc;
		
		ObservableList<String> definizioni = FXCollections.observableArrayList("Grafo non orientato e connesso","Albero di copertura", "Albero di copertura minimo", "Pesi");
			
	    @FXML
	    private Button start, back, next, alert,controlla;
	    
	    @FXML
	    private AnchorPane ap;
		    
	    @FXML
		private StackPane sp1,sp2,sp3,sp4,sp5,sp6;    //stackPanes FXML overView
	
	    
	    @FXML
	    private ImageView image;

	    @FXML
	    private Label kruskal;


		@FXML
	    private ChoiceBox<String> cbox ;

	    @FXML
	    private CheckBox check1,check2,check3,check4;

		
	//FUNZIONI CHE GESTISCONO L'FXML OVERVIEW
		    @FXML
		    void information(ActionEvent event) throws IOException {
		         alertWindow aw = new alertWindow();
		         aw.createAlert(AlertType.WARNING,"Per iniziare questa demo devi aver letto i capitoli...", "Nota Bene");
		    }
		    
		    @FXML
		    void gotoApp(MouseEvent event) {
		    	//sc.setScene(sceneLoader.applicazioni);
		    }

		    @FXML
		    void gotoIdea(MouseEvent event) throws IOException {
		        sc.setScene(sceneLoader.idea);
		    }
		    
		    @FXML
		    void gotoCorrect(MouseEvent event) throws IOException {
		    	 sc.setScene(sceneLoader.correttezza);
		    }


		    @FXML
		    void gotoEfficiency(MouseEvent event) {
		    	sc.setScene(sceneLoader.efficienza);
		    }

		    @FXML
		    void gotoEsercizi(MouseEvent event) {
		      sc.setScene(sceneLoader.esercizi);
		    }

		    @FXML
		    void gotoImplementation(MouseEvent event) throws IOException {
		    	sc.setScene(sceneLoader.implementation);
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
		    	c.setFill(Color.rgb(196,229,242));
		    }  
		    
		    
 //FUNZIONI CHE GESTISCONO L'FXML CONCEPT	
		    
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
		    
		    
  //Funzioni che gestiscono lo scambio tra le pagine
		 
        @FXML
		 void goBack(ActionEvent event) throws IOException {
		  //sc.goBack();
        	   if(ap!=null) {
   		    	 System.out.println(ap.getHeight());
   		    }
		  }
		    
		@FXML
		  void goNext(ActionEvent event) throws IOException {
		    sc.goNext();
		    
//		    if(ap!=null) {
//                DoubleProperty x = new SimpleDoubleProperty(sc.getScene().getHeight());
//                DoubleProperty y = new SimpleDoubleProperty();
//                 y.bind(x);
//                 ap.he;
//		    	 System.out.println(ap.getHeight());
//		    }
		   
		    }		    

		@Override
		public void setSceneParent(sceneController parent) {
			sc = parent;
			
		}

	    @FXML
	    void initialize() {
	        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'prim.fxml'.";
	        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'overView.fxml'.";
	        
	        //FXML prim
	        assert ap != null : "fx:id=\"ap\" was not injected: check your FXML file 'prim.fxml'.";
	        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'prim.fxml'.";
	        
	        //FXML overView
	        assert alert != null : "fx:id=\"alert\" was not injected: check your FXML file 'overView.fxml'.";
	        assert sp5 != null : "fx:id=\"sp5\" was not injected: check your FXML file 'overView.fxml'.";
	        assert sp1 != null : "fx:id=\"sp1\" was not injected: check your FXML file 'overView.fxml'.";
	        assert sp3 != null : "fx:id=\"sp3\" was not injected: check your FXML file 'overView.fxml'.";
	        assert sp4 != null : "fx:id=\"sp4\" was not injected: check your FXML file 'overView.fxml'.";
	        assert sp2 != null : "fx:id=\"sp2\" was not injected: check your FXML file 'overView.fxml'.";
	        assert sp6 != null : "fx:id=\"sp6\" was not injected: check your FXML file 'overView.fxml'.";
	        
	        //FXML concept
	        assert cbox != null : "fx:id=\"cbox\" was not injected: check your FXML file 'concept.fxml'.";
	        assert check1 != null : "fx:id=\"check1\" was not injected: check your FXML file 'concept.fxml'.";
	        assert check3 != null : "fx:id=\"check3\" was not injected: check your FXML file 'concept.fxml'.";
	        assert check2 != null : "fx:id=\"check2\" was not injected: check your FXML file 'concept.fxml'.";
	        assert check4 != null : "fx:id=\"check4\" was not injected: check your FXML file 'concept.fxml'.";
	        assert controlla != null : "fx:id=\"controlla\" was not injected: check your FXML file 'concept.fxml'.";
	        if(cbox != null) { cbox.setValue("Pesi"); cbox.setItems(definizioni); }

	        //FXML defProblem
	        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'defProblem.fxml'.";
		    assert kruskal != null : "fx:id=\"kruskal\" was not injected: check your FXML file 'defProblem.fxml'.";
	         if(image!=null)   image.setImage(new Image("/Image/Minimum_spanning_tree.png"));
	        
	    }

}
