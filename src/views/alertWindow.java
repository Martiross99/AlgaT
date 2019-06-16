package views;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;

 
/**
 * A sample that demonstrates the Dialog control.
 */
public class alertWindow {

    
     protected void createAlert(AlertType type, String message) {
        Alert alert = new Alert(type, message);
        alert.initModality(Modality.APPLICATION_MODAL);

		alert.showAndWait();
//		  .filter(response -> response == ButtonType.OK)
//	      .ifPresent(response -> System.out.print("x"));
    }

}
