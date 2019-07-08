package Prim.views;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.sceneController;

public class domandeController  implements model.ISceneController{

	sceneController sc;

    @FXML
    private Button back, next, menu, inserisci,done, riprova;
    
    @FXML
    private AnchorPane ap;
    
    @FXML
    private TextField tentativo;

    @FXML
    private TextArea risposta;
    
    @FXML
    private Text thirdQuestion,fourthQuestion;
    
    
  //Funzioni che gestiscono il file esercizi2.fxml
    
  	 @FXML
  	  void controlla2(ActionEvent event) throws FileNotFoundException {
  		 
  		 String prova = tentativo.getText();      //prende la risposta dell'utente
  		 prova = prova.trim();                     //senza gli spazi
  		 
  	  if(prova.length()!=0) {             //se l'utente ha inserito qualcosa controlla la risposta
  		  
  		  inserisci.setDisable(true);
  		  riprova.setDisable(false); 
  		  
  		 try {
  			 Integer.parseInt(prova);                   //se l'inserimento non è un numero, la risposta non è valida
  		 } catch(NumberFormatException e) {
  			 risposta.appendText("Inserimento non valido");
  			 return;
  		 }		 

  		try {	
  			Scanner scanner = new Scanner (new File("src/Prim/views/risposte.txt")); //apre uno scanner che scorre il file di testo risposte
  			String anno = scanner.next();
  				if(anno.equals(prova)) {
  					    risposta.appendText("Corretto!"); 
  		            	next.setDisable(false);
  					}
  				
  				else risposta.appendText("Hai sbagliato, riprova");
  				
  			 scanner.close();
  		}    catch(FileNotFoundException ex) {
  	        System.out.println("Unable to open file 'risposte.txt'");                
  	        }
  		 }

         }	
  	 
  
    
    
  //funzioni che gestiscono il file esercizi3.fxml
	 
    @FXML
    void controlla3(ActionEvent event) throws FileNotFoundException { 
    	
		String prova = tentativo.getText();
		prova = prova.trim();
		
		if(prova.length()!=0) {
			
		try {	
			Scanner s = new Scanner (new File("src/Prim/views/risposte.txt"));
			Integer line = 0;
			if(thirdQuestion != null) line = 3;                       //a seconda di quale è la domanda si richiede allo scanner di leggere una diversa rig del file txt
			else if(fourthQuestion != null) line = 4;
			else line = 2;
			
			String riga = getLine(s,line);
			
			Scanner scanner = new Scanner(riga);
			scanner.useDelimiter("/");
			
			boolean found = false;
			while(scanner.hasNext() ) {
				String a = scanner.next();
				if(a.equals(prova)) {
					risposta.appendText("Corretto!"); 
					found = true;
				}
			}
		    if(!found) risposta.appendText("Sbagliato, riprova");
		    else if((found) && (line < 4)) next.setDisable(false);
		    else menu.setDisable(false);
		    
		    inserisci.setDisable(true);
		    riprova.setDisable(false);
		    
           scanner.close();
           
		}    catch(FileNotFoundException ex) {
			
	        System.out.println("Unable to open file 'risposte.txt'");  
	        
	        }
		}
    }
    
  String getLine(Scanner s, Integer line) {       //funzione che restituisce la riga da cui leggere le risposte
	  
    	String riga = new String();
    	while(line > 0) {
    		    riga = s.nextLine();
				line = line-1;
    	}
    	return(riga);
    	
    }
    
    @FXML
    void clean(ActionEvent event) {         //pulisce l'interfaccia ogni volta che viene schiacciato il tasto riprova
    	risposta.clear();
    	tentativo.clear();
    	inserisci.setDisable(false);
    	riprova.setDisable(true);
    }
    
  //Funzioni che gestiscono lo scambio tra le pagine	 
    
    @FXML
	 void goBack(ActionEvent event) throws IOException {
	    sc.goBack();
	    pulisciSchermata();
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
	
    @FXML
	 void gotoMenu(ActionEvent event) throws IOException { 
	   Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	   sc.getProgetto().gotoMenu(window);
	  }
	
	@Override
	public void setSceneParent(sceneController parent) {
		sc = parent;	
	}
	

	
	
	 @FXML
		void initialize() {
	    	
	        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'domande.fxml'.";
	        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'domande.fxml'.";
	        assert ap != null : "fx:id=\"ap\" was not injected: check your FXML file 'domande4.fxml'.";
	        
	  	  if (ap != null) {                              //se viene premuto il tasto invio, mette in azione di tasto inserisci 
	  	      ap.setOnKeyPressed(e -> {                   //e controlla la risposta
	  		    if (e.getCode() == KeyCode.ENTER) {
	  		        try {
	  		        inserisci.fire();
	  		        }catch (Exception error) {
	  		        	System.out.println(error.getMessage());
	  		        }
	  		    }
	  		});
	            }
	          
	     //FXML domande  
	        assert inserisci != null : "fx:id=\"inserisci\" was not injected: check your FXML file 'domande.fxml'.";  
	        assert tentativo != null : "fx:id=\"tentativo\" was not injected: check your FXML file 'domande.fxml'.";
	        assert risposta != null : "fx:id=\"risposta\" was not injected: check your FXML file 'domande.fxml'.";
	        assert riprova != null : "fx:id=\"riprova\" was not injected: check your FXML file 'domande.fxml'.";
	        
	     //FXML domande3
	        assert thirdQuestion != null : "fx:id=\"thirdQuestion\" was not injected: check your FXML file 'domande3.fxml'.";
	        
	     //FXML domande4
	        assert fourthQuestion != null : "fx:id=\"fourthQuestion\" was not injected: check your FXML file 'domande4.fxml'.";
	        assert menu != null : "fx:id=\"menu\" was not injected: check your FXML file 'domande4.fxml'.";
	        
	    }

}
