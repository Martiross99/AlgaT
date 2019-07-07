package progetto.greedy;




import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {


		try {

			progettoController progetto = new progettoController();
			progetto.load();
			progetto.start(primaryStage);
			

			//progettoController progetto = new progettoController();
			//progetto.load();
			//progetto.start(primaryStage);

		//    StackPane root = new StackPane();
//		    
//		    root.getChildren().addAll(menu.getController(0),menu.getController(1)); 
//		    root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
//		    root.getStyleClass().add("stackp");
//		    
//		    Scene scene = new Scene(root);
//		    primaryStage.setScene(scene);
		     
//		     primaryStage.setMaximized(true);   
//		     primaryStage.setResizable(false);
//		     primaryStage.show();
			
//			SceneLoader_Kruskal sc = new SceneLoader_Kruskal();
//			sceneController main = new sceneController();
//			main=sc.Load(main);
//			StackPane root = new StackPane();
//		    
//		    root.getChildren().add(main); 
//		    root.getStylesheets().add(getClass().getResource("/stylesheets/application.css").toExternalForm());
//		    root.getStyleClass().add("stackp");
//		    
//		    Scene scene = new Scene(root);
//		    primaryStage.setScene(scene);		     
//		     primaryStage.setMaximized(true);   
//		     primaryStage.setResizable(false);
//		     primaryStage.show();
//			

//			AnchorPane mPane = FXMLLoader.load(getClass().getResource("/lezione1/esempio.fxml"));
//			Scene mScene = new Scene(mPane);
//			primaryStage.setScene(mScene);
//			primaryStage.show();

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
