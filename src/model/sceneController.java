package model;

import java.util.Map.Entry;
import java.util.TreeMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;


public class sceneController extends StackPane{

	TreeMap<Integer,Node> map = new TreeMap<>();
	
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
	
    public boolean loadScene(Integer n, String resource) {
    	 try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
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

    
    public boolean setScene(final Integer n) {
    	if (map.get(n) != null) {   //sceen loaded

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
    
}
