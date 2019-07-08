package Kruskal.views;


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

public class CKruskal_910 implements model.ISceneController {

	sceneController sc;
	
	@FXML
	private Button Dom1;
	
	@FXML
    private Button Dom2;
	
	//in comune
    @FXML
    private TextArea Risultato;

    @FXML
    private TextField Tentativo;

    @FXML
    private Button Riprova;

    @FXML
    private Button PrevB, NextB;

    @FXML
    void Clear(ActionEvent event) {
    	
    	Tentativo.clear();
    	Risultato.clear();
    	
    }

    @FXML
    void GetAnswer(ActionEvent event) throws FileNotFoundException {
    	
    	String filename;
    	
    	Button x = (Button) event.getSource();
    	
    	if(x.equals(Dom1)) filename = "src/Kruskal/views/risposte_K.txt";
    	else filename = "src/Kruskal/views/risposte2_K.txt";
    	
    	String prova = Tentativo.getText();
    	prova = prova.trim();
    	if(prova.length()!=0) {
    		try {	
    			Scanner scanner = new Scanner (new File(filename));
    			boolean found = false;
    			while(scanner.hasNext()) {
    				String a = scanner.nextLine();
    				if(a.equals(prova)) {
    					Risultato.appendText("Corretto!"); 
    					found = true;
    					NextB.setDisable(false);
    				}
    			}
    			if(!found) Risultato.appendText("Sbagliato, riprova");
    	        scanner.close(); }
    		catch(FileNotFoundException ex) {
    			System.out.println("Unable to open answers file");                
    		        }
    			}
    }

    @Override
	public void setSceneParent(sceneController parent) {
		sc = parent;
		
	}

    @FXML
    void NextB(ActionEvent event) throws IOException {
    	sc.goNext();
    }

    @FXML
    void PrevB(ActionEvent event) throws IOException {
    	sc.goBack();	
    }
    

    @FXML
    void initialize() {
        assert Risultato != null : "fx:id=\"Risultato\" was not injected: check your FXML file 'scena9.fxml'.";
        assert Tentativo != null : "fx:id=\"Tentativo\" was not injected: check your FXML file 'scena9.fxml'.";
        assert Dom1 != null : "fx:id=\"Dom1\" was not injected: check your FXML file 'scena9.fxml'.";
        assert Dom2 != null : "fx:id=\"Dom1\" was not injected: check your FXML file 'scena10.fxml'.";
        assert Riprova != null : "fx:id=\"Riprova\" was not injected: check your FXML file 'scena9.fxml'.";
        assert PrevB != null : "fx:id=\"PrevB\" was not injected: check your FXML file 'scena9.fxml'.";
        assert NextB != null : "fx:id=\"NextB\" was not injected: check your FXML file 'scena9.fxml'.";

    }
}