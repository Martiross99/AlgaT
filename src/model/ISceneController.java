package model;

import model.sceneController;

public interface ISceneController {
	
  //This method will allow the injection of the Parent ScreenPane
	    public void setSceneParent(sceneController sceneParent);
}
