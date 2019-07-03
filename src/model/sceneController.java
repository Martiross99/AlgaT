package model;

import java.util.HashMap;
import java.util.Map.Entry;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class sceneController extends StackPane{

	HashMap<Integer,Node> map = new HashMap<>();
	
	public sceneController() {
		super();
	}
	
	public void addScene(Integer n, Node scene) {
		map.put(n, scene);
	}

    public Node getScene(Integer n) {
	  return(map.get(n));
    }
    
    public Integer getIndex (Node scene) {
    	 for (Entry<Integer, Node> entry : map.entrySet()) {
    	        if (scene.equals(entry.getValue())) {
    	            return entry.getKey();
    	        }
    	    }
    	    return null;
    }
    
    public HashMap<Integer,Node> getMap(sceneController sc) {
    	return(sc.map);
    }
	
    public boolean loadScene(Integer n, String resource) {
    	 try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
          //   AnchorPane ap = (AnchorPane) loader.load();
             Parent loadScene = (Parent) loader.load();
             ISceneController sceneController = ((ISceneController) loader.getController());
             sceneController.setSceneParent(this);
             
             addScene(n, loadScene);      //add this scene to the hashmap
             return true;
         } catch (Exception e) {
             System.out.println(e.getMessage());
             return false;
         }
    }

    public void addMap(sceneController sc) {
    	try {
    		HashMap<Integer,Node> mappa = getMap(sc);
    		for (Entry<Integer, Node> entry : mappa.entrySet()) {
    	        this.addScene(entry.getKey(), entry.getValue());
    	        System.out.println(entry.getKey());
    	        }
    	    } catch (Exception e) {
    	    	System.out.println(e.getMessage());
    	}
    }
    
    
//PROVA    
    
//    public AnchorPane radice(String resource) {
//    	try {
//    	FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
//        AnchorPane ap = (AnchorPane) loader.load();
//        return(ap);
//    	} catch (Exception e) {
//            System.out.println(e.getMessage());
//            return (null);
//        }
//    }
    
    public boolean setScene(final Integer n) {
    	if (map.get(n) != null) {   //se la scena è nella mappa

         if (!getChildren().isEmpty()) {    //if there is more than one sceen
  
                    getChildren().remove(0);                    //remove the displayed sceen
                    getChildren().add(0,map.get(n));     //add the sceen       
            }

        else {
            getChildren().add(map.get(n));       //no one else been displayed, then just show
        }
        return true;
    } else {
        System.out.println("Questa scena non è stata caricata\n");
        return false;
    }
   }
   
    public void goBack() {
       	try {
      		 Node actualScene =  getChildren().get(0);
      		 Integer x = (getIndex(actualScene));
      		 setScene(x - 1);
      	} catch (Exception e) {
              System.out.println(e.getMessage());             
          }
    }
    
    public void goNext() {
    	try {
   		 Node n =  getChildren().get(0);
   		 Integer x = (getIndex(n));
   		 setScene(x + 1);
   	} catch (Exception e) {
           System.out.println(e.getMessage());
          
       }
    }
    
    public void gotoMenu(ActionEvent event) {
       try{
           AnchorPane mPane = FXMLLoader.load(getClass().getResource("/progetto/greedy/menu.fxml"));
           Scene mScene = new Scene(mPane);
           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
           window.setScene(mScene);
           window.show();
       } catch(Exception e) {
          System.out.println(e.getMessage());
       }
    }
}
