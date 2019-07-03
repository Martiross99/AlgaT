package views;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.sceneController;

public class domandeController  implements model.ISceneController{

	sceneController sc;

    @FXML
    private Button back, next, inserisci,done, riprova;
    
    @FXML
    private TextField tentativo;

    @FXML
    private TextArea risposta;
    
    
  //Funzioni che gestiscono il file esercizi2.fxml
    
  	 @FXML
  	  void controlla2(ActionEvent event) throws FileNotFoundException {
  		 
  		 String prova = tentativo.getText();
  		 prova = prova.trim();
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
  			Scanner scanner = new Scanner (new File("Prim/views/risposte.txt")); 
  			String anno = scanner.nextLine();
//  				if(scanner.hasNextInt()) System.out.println(scanner.next()); System.out.println(s);
  				if(anno.equals(prova)) {
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
		prova = prova.trim();
		System.out.println(prova);
		if(prova.length()!=0) {
		try {	
			Scanner scanner = new Scanner (new File("Prim/views/risposte.txt"));
			scanner.skip(Pattern.compile("..57"));
			boolean found = false;
			while(scanner.hasNext()) {
				String a = scanner.nextLine();
				if(a.equals(prova)) {
					risposta.appendText("Corretto!"); 
					found = true;
				}
			}
		    if(!found) risposta.appendText("Sbagliato, riprova");
		    if(found) next.setDisable(false);
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
		        risposta.clear();
	        	tentativo.clear();
	        	inserisci.setDisable(false);
	        	riprova.setDisable(true);
		   risposta.clear();
	}
	
	@Override
	public void setSceneParent(sceneController parent) {
		sc = parent;	
	}
	

	
	
	 @FXML
		void initialize() {
	    	
	        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'domande.fxml'.";
	        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'domande.fxml'.";
	        
	          
	     //FXML esercizi2/esercizi3   
	        assert inserisci != null : "fx:id=\"inserisci\" was not injected: check your FXML file 'domande.fxml'.";  
	        assert tentativo != null : "fx:id=\"tentativo\" was not injected: check your FXML file 'domande.fxml'.";
	        assert risposta != null : "fx:id=\"risposta\" was not injected: check your FXML file 'domande.fxml'.";
	        assert riprova != null : "fx:id=\"riprova\" was not injected: check your FXML file 'domande2.fxml'.";
	    }

}
