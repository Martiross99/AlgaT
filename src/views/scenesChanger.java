package views;

import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class scenesChanger {
	
	public void changeScene (ActionEvent event,String viewName) throws IOException{
		   Parent parent = FXMLLoader.load(getClass().getResource(viewName));
		      Scene scene = new Scene(parent);
		      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		       window.setScene(scene);
		       window.show();
	}

	public void mouseScene (MouseEvent event,String viewName) throws IOException{
		   Parent parent = FXMLLoader.load(getClass().getResource(viewName));
		      Scene scene = new Scene(parent);
		      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		       window.setScene(scene);
		       window.show();
	}

	
}
