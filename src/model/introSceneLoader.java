package model;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class introSceneLoader extends Application{


	public static Integer intro = 1;
	public static String introScene = "/lezione1/1_1.fxml";
	public static Integer proprieta = 2;
	public static String proprietaScene = "/lezione1/1_2.fxml";
	public static Integer esempio = 3;
	public static String esempioScene = "/lezione1/1_3.fxml";
	public static Integer gioco = 4;
	public static String giocoScene = "/lezione1/esempio.fxml";
	public static Integer end = 5;
	public static String endScene = "/views/1_5.fxml";

	 
    public Stage stage;
     
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		sceneController main = new sceneController();
		main.loadScene(intro, introScene);
		main.loadScene(proprieta, proprietaScene);
		main.loadScene(esempio, esempioScene);
		main.loadScene(gioco, giocoScene);
		main.loadScene(end, endScene);

		main.setScene(intro);

		StackPane root = new StackPane();
		root.getChildren().add(main);
		Scene scene = new Scene(root);


		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
