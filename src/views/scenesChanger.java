package views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class scenesChanger {
	
	public void changeScene (ActionEvent event,String viewName) throws IOException{
		   Parent parent = FXMLLoader.load(getClass().getResource(viewName));
		      Scene overView = new Scene(parent);
		      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		       window.setScene(overView);
		       window.show();
	}

}
