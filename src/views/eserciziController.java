package views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import model.sceneController;


//gestisce i file : esercizi.fxml


public class eserciziController  implements model.ISceneController{

	sceneController sc;

    @FXML
    private Button back, next, inserisci,done, riprova;
    
    @FXML
    private TextField tentativo;

    @FXML
    private TextArea risposta;


    @FXML
    private RadioButton rb1,rb2,rb3,rb4;
    private ToggleGroup rb = new ToggleGroup();
    
    
  //Funzioni che gestiscono il file esercizi.fxml
	@FXML
	 void verifica(ActionEvent event) {
		risposta.clear();
		  rb1.setToggleGroup(rb);rb2.setToggleGroup(rb);rb3.setToggleGroup(rb);rb4.setToggleGroup(rb);
            if(rb2.isSelected()) {
            	risposta.appendText("Corretto!");
            	next.setDisable(false); 
            }
            else {
            	risposta.setText("Sbagliato, riprova");
            	next.setDisable(true);
            }
	    }

 //Funzioni che gestiscono il file esercizi2.fxml
	 @FXML
	  void controlla2(ActionEvent event) throws FileNotFoundException {
		 
		 String prova = tentativo.getText();
		 Integer pr;
	  if(prova.length()!=0) {
		  inserisci.setDisable(true);
		  riprova.setDisable(false); 
		  
		 try {
			pr = Integer.parseInt(prova);
		 } catch(NumberFormatException e) {
			 risposta.appendText("Inserimento non valido");
			 return;
		 }		 

		try {	
			Scanner scanner = new Scanner (new File("src/views/risposte.txt")); 
			Scanner anno = scanner.useDelimiter("[^1-9]+"); 
				String s =	pr.toString();
//				if(scanner.hasNextInt()) System.out.println(scanner.next()); System.out.println(s);
				if(anno.next().equals(s)) {
					    risposta.appendText("Corretto!"); 
		            	next.setDisable(false);
					}
				else risposta.appendText("Hai sbagliato, riprova");
			 scanner.close();
		}    catch(FileNotFoundException ex) {
	        System.out.println(
	                "Unable to open file 'risposte.txt'");                
	        }
		 }

       }	
	 
 //funzioni che gestiscono il file esercizi3.fxml
	 
	    @FXML
	    void controlla3(ActionEvent event) throws FileNotFoundException {
			 
			String prova = tentativo.getText();
			if(prova.length()!=0) {
			try {	
				Scanner scanner = new Scanner (new File("src/views/risposte.txt"));
				scanner.skip(Pattern.compile("..57"));
				boolean found = false;
				while(scanner.hasNext()) {
					if(scanner.nextLine().equals(prova)) {
						risposta.appendText("Corretto!"); 
						found = true;
					}
				}
			    if(!found) risposta.appendText("Sbagliato, riprova");
			    inserisci.setDisable(true);
			    riprova.setDisable(false);
	           scanner.close();
			}    catch(FileNotFoundException ex) {
		        System.out.println("Unable to open file 'risposte.txt'");                
		        }
			}
	    }
	    
	    @FXML
	    void clean(ActionEvent event) {
	    	risposta.clear();
	    	tentativo.clear();
	    	inserisci.setDisable(false);
	    	riprova.setDisable(true);
	    }
	
 //Funzioni che gestiscono lo scambio tra le pagine	 
    @FXML
	 void goBack(ActionEvent event) throws IOException {
	  sc.goBack();
	  }
	    
	@FXML
	  void goNext(ActionEvent event) throws IOException {
	    sc.goNext();
	    pulisciSchermata();
      }		    

	public void pulisciSchermata() {
		 if(sc.getIndex(sc.getChildren().get(0)) == 11  || sc.getIndex(sc.getChildren().get(0)) == 12) { 
		        risposta.clear();
	        	tentativo.clear();
	        	inserisci.setDisable(false);
	        	riprova.setDisable(true);
		   }
		   risposta.clear();
	}
	
	@Override
	public void setSceneParent(sceneController parent) {
		sc = parent;	
	}
	



    @FXML
	void initialize() {
    	
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'esercizi.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'esercizi.fxml'.";
        
    	
     //FXML esercizi 	
	    assert rb1 != null : "fx:id=\"rb1\" was not injected: check your FXML file 'esercizi.fxml'.";
	    assert rb2 != null : "fx:id=\"rb2\" was not injected: check your FXML file 'esercizi.fxml'.";
	    assert rb3 != null : "fx:id=\"rb3\" was not injected: check your FXML file 'esercizi.fxml'.";
	    assert rb4 != null : "fx:id=\"rb4\" was not injected: check your FXML file 'esercizi.fxml'.";
        assert done != null : "fx:id=\"done\" was not injected: check your FXML file 'esercizi.fxml'.";
          
     //FXML esercizi2/esercizi3   
        assert inserisci != null : "fx:id=\"inserisci\" was not injected: check your FXML file 'esercizi2.fxml'.";  
        assert tentativo != null : "fx:id=\"tentativo\" was not injected: check your FXML file 'esercizi2.fxml'.";
        assert risposta != null : "fx:id=\"risposta\" was not injected: check your FXML file 'esercizi2.fxml'.";
        assert riprova != null : "fx:id=\"riprova\" was not injected: check your FXML file 'esercizi3.fxml'.";
    }
}
