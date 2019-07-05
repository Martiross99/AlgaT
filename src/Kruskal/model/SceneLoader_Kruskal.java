package Kruskal.model;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.sceneController;

public class SceneLoader_Kruskal extends Application {
		
		 public static Integer kruskal = 1;
		 public static String kruscene = "/Kruskal.views/Intro.fxml";
		 public static Integer scena1_K = 2;
		 public static String minalbero = "/Kruskal.views/scena1.fxml";
		 public static Integer scena2_K = 3;
		 public static String intro_K = "/Kruskal.views/scena2.fxml";
		 public static Integer scena3_K = 4;
		 public static String costo = "/Kruskal.views/scena3.fxml";
		 public static Integer scena4_K = 5;
		 public static String costop2 = "/Kruskal.views/scena4.fxml";
		 public static Integer scena5_K = 6;
		 public static String parte23 = "/Kruskal.views/scena5.fxml";
		 public static Integer scena6_K = 7;
		 public static String pseudo = "/Kruskal.views/scena6.fxml";
		 public static Integer scena7_K = 8;
		 public static String esercizio1 = "/Kruskal.views/scena7.fxml";
		 public static Integer scena8_K = 9;
		 public static String esercizio2 = "/Kruskal.views/scena8.fxml";
		 public static Integer scena9_K = 10;
		 public static String domanda1 = "/Kruskal.views/scena9.fxml";
		 public static Integer scena10_K = 11;
		 public static String domanda2 = "/Kruskal.views/scena10.fxml";
		 public static Integer scena11_K = 12;
		 public static String verofalso = "/Kruskal.views/scena11.fxml";
		 public static Integer scena4b_K = 13;
		 public static String ripasso = "/Kruskal.views/scena4bis.fxml";
		 
	     public Stage stage;
	     
		@Override
		public void start(Stage primaryStage) throws Exception {
			
			 sceneController main = new sceneController();
			 main.loadScene(kruskal, kruscene);
			 main.loadScene(scena1_K, minalbero);
			 main.loadScene(scena2_K, intro_K);
			 main.loadScene(scena3_K, costo);
			 main.loadScene(scena4_K, costop2);
			 main.loadScene(scena5_K, parte23);
			 main.loadScene(scena6_K, pseudo);
			 main.loadScene(scena7_K, esercizio1);
			 main.loadScene(scena8_K, esercizio2);
			 main.loadScene(scena9_K, domanda1);
			 main.loadScene(scena10_K, domanda2);
			 main.loadScene(scena11_K, verofalso);
			 main.loadScene(scena4b_K, ripasso);
			 
			 main.setScene(SceneLoader_Kruskal.kruskal);
		        
		        Group root = new Group();
		        root.getChildren().add(main);
		        Scene scene = new Scene(root,1080,720);
		     
		        
		        primaryStage.setScene(scene);
		       // primaryStage.setResizable(false);
		        primaryStage.setFullScreen(false);
		        primaryStage.show();
		}
		

	}
