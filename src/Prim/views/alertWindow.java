package Prim.views;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DialogPane;
import javafx.stage.Modality;

 
/**
 * A sample that demonstrates the Dialog control.
 */
public class alertWindow {

    
     protected void createAlert(AlertType type, Integer line, String title) throws FileNotFoundException{
    	 try {		 
    	String message = findMessage(line);
        Alert avviso = new Alert(type, message);
        avviso.initModality(Modality.APPLICATION_MODAL);
       
      //  DialogPane dp = avviso.getDialogPane();
      //  dp.getStylesheets().add(getClass().getResource("/progetto/greedy/application.css").toExternalForm());
     //   if(avviso.getAlertType() == AlertType.WARNING) dp.getStyleClass().add("myDialog1");
     //   if(avviso.getAlertType() == AlertType.INFORMATION) dp.getStyleClass().add("myDialog2");
        avviso.setTitle(title);
		avviso.showAndWait();
    	 } catch(Exception e) {
    		 System.out.println(e.getMessage());
    	 }
    }

     public String findMessage(Integer line) throws FileNotFoundException {
    	 String message = new String();
         try {	
 			Scanner scanner = new Scanner (new File("Prim/views/avvisi.txt")); 
 			//scanner.skip(Pattern.compile(alert));
 			while(line > 0) {
 				message = scanner.nextLine();
 				line = line-1;
 			   }
 				//System.out.println(scanner.nextLine());
 			 			 scanner.close();
 		}    catch(FileNotFoundException ex) {
 	        System.out.println(
 	                "Unable to open file 'avvisi.txt'");                
 	        }
         return(message);
     }
     
     
     
}
