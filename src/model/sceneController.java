package model;

import java.util.HashMap;
import java.util.Map.Entry;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import progetto.greedy.progettoController;


public class sceneController extends StackPane {

	protected HashMap<Integer,Node> mappa = new HashMap<>();
	protected progettoController mainProject;
	
	public sceneController() {
		super();
	}
	
	
	public void addScene(Integer n, Node scene) {
		mappa.put(n, scene);
	}

    public Node getScene(Integer n) {
	  return(mappa.get(n));
    }
    
    
    public Integer getIndex (Node scene) {
    	 for (Entry<Integer, Node> entry : mappa.entrySet()) {
    	        if (scene.equals(entry.getValue())) {
    	            return entry.getKey();
    	        }
    	    }
    	    return null;
    }
    
    public HashMap<Integer,Node> getMap(sceneController sc) {
    	return(sc.mappa);
    }
	    
    
  public void loadScene(Integer n, String resource) {
    	 try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
             AnchorPane ap = (AnchorPane) loader.load();
             //Parent loadScene = (Parent) loader.load();
             ISceneController sceneController = ((ISceneController) loader.getController());
             sceneController.setSceneParent(this);             
             addScene(n, ap);           //add this scene to the hashmap
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
    }

//    public void addMap(sceneController sc) {
//    	try {
//    		HashMap<Integer,Node> mappa = getMap(sc);
//    		for (Entry<Integer, Node> entry : mappa.entrySet()) {
//    	        this.addScene(entry.getKey(), entry.getValue());
//    	        System.out.println(entry.getKey());
//    	        }
//    	    } catch (Exception e) {
//    	    	System.out.println(e.getMessage());
//    	}
//    }    
    
    
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
    
    public void setScene(Integer n) {     //final?
    	
    	if (mappa.get(n) != null) {   //la scena deve essere stata caricata nella mappa

         if (!getChildren().isEmpty()) {    // se è presente più di una scena nella mappa
  
                    getChildren().remove(0);                    //viene rimosso il figlio attualmente in posizione zero
                    getChildren().add(0,mappa.get(n));     //viene aggiunta la scena corrente in posizione zero      
            }

        else {
            getChildren().add(mappa.get(n));       //se c'è solo una scena da mostrare viene aggiunta e mostrata
        }
      } else {
        System.out.println("Questa scena non è stata caricata\n");
    }
    	
   }
   
    public void goBack() {
       	try {
      		 Node actualScene =  getChildren().get(0);    //prende il nodo attualmente visibile
      		 Integer x = (getIndex(actualScene));         //recupera il suo indice, ovvero il valore associato nell'HashMap
      		 setScene(x - 1);                              //setta la scena precedente
      	} catch (Exception e) {
              System.out.println(e.getMessage());             
          }
    }
    
    public void goNext() {
    	try {
   		 Node n =  getChildren().get(0);
   		 Integer x = (getIndex(n));
   		 setScene(x + 1); 								//setta la scena successiva
   	} catch (Exception e) {
           System.out.println(e.getMessage());
          
       }
    }
    
    
    
    public void setProgetto(progettoController progetto) {       //questa funzione comunica al sceneController qual è il progetto (progettoController)
    	mainProject = progetto;                                   //al quale deve fare riferimento
    }
    
    public progettoController getProgetto() {                   //ritorna il progetto al quale il sceneController è associato
    	return(mainProject);
    }
    
//    public void gotoMenu(ActionEvent event) {
//       try{
//           AnchorPane mPane = FXMLLoader.load(getClass().getResource("/progetto/greedy/menu.fxml"));
//           Scene mScene = new Scene(mPane);
//           Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//           window.setScene(mScene);
//           window.show();
//       } catch(Exception e) {
//          System.out.println(e.getMessage());
//       }
//    }
}
