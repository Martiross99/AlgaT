package Prim.views;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DialogPane;
import javafx.stage.Modality;

public class alertWindow {

    
     protected void createAlert(AlertType type, Integer line, String title) throws FileNotFoundException{     //crea un alertBox prendendo in input
    	 try {		                                                                                           //la riga del file di testo dal quale deve leggere
    	String message = findMessage(line);                                                                    //che trova chiamando la funzione findMessage
        Alert avviso = new Alert(type, message);
        avviso.initModality(Modality.APPLICATION_MODAL);
       
        DialogPane dp = avviso.getDialogPane();
        dp.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
        if(avviso.getAlertType() == AlertType.WARNING) dp.getStyleClass().add("alertWarn");
        if(avviso.getAlertType() == AlertType.INFORMATION) dp.getStyleClass().add("alertInfo");
        avviso.setTitle(title);
		avviso.showAndWait();
    	 } catch(Exception e) {
    		 System.out.println(e.getMessage());
    	 }
    }

     public String findMessage(Integer line) throws FileNotFoundException {
    	 String message = new String();
         try {	
 			Scanner scanner = new Scanner (new File("src/Prim/views/avvisi.txt")); 
 			while(line > 0) {
 				message = scanner.nextLine();
 				line = line-1;
 			   }
 			 	 scanner.close();
 		    } catch(FileNotFoundException ex) {
 	        System.out.println(
 	                "Unable to open file 'avvisi.txt'");                
 	        }
         return(message);
     }    
     
}
