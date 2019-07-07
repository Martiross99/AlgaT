package lezione1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.sceneController;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class esempioController implements model.ISceneController{

    sceneController sc;
    private AnchorPane root;
    private Scene scene;
    int[] values = new int[]{1,5,10,20,50,100,500};
    int[] labelCounters = new int[]{0,0,0,0,0,0,0};
    int[] correctCounters = new int[]{0,0,0,0,0,0,0};

    @FXML
    Button continua;

    @FXML
    Label count1;
    @FXML
    Label count5;
    @FXML
    Label count10;
    @FXML
    Label count20;
    @FXML
    Label count50;
    @FXML
    Label count100;
    @FXML
    Label count500;
    @FXML
    Label imp;

    @FXML
    private Pane money1;
    @FXML
    private Pane money5;
    @FXML
    private Pane money10;
    @FXML
    private Pane money20;
    @FXML
    private Pane money50;
    @FXML
    private Pane money100;
    @FXML
    private Pane money500;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    int importo;

    void startGame(){
        disablePanes();

        for(int i=0; i<7; i++){
            labelCounters[i] = 0;
            correctCounters[i] = 0;
        }

        continua.setVisible(false);

        Random r = new Random();
        importo = r.nextInt((5000 - 1000) + 1) + 1000;

        int i = 6;
        int tempImporto = importo;

        while(tempImporto > 0){
            if(tempImporto >= values[i]) {
                tempImporto -= values[i];
                correctCounters[6 - i]++;
            } else {
                i--;
            }
        }

        imp.setText(Integer.toString(importo));
        updateLabels();

    }

    @FXML
    void initialize() {
        startGame();
    }

    @FXML
    void clickMoney(MouseEvent event){
        String name = event.getSource().toString();
        if(name.contains("money100")) {
            moneyClicked(100);
        } else if(name.contains("money500")) {
            moneyClicked(500);
        } else if(name.contains("money10")) {
            moneyClicked(10);
        } else if(name.contains("money20")) {
            moneyClicked(20);
        } else if(name.contains("money50")) {
            moneyClicked(50);
        } else if(name.contains("money1")) {
            moneyClicked(1);
        } else if(name.contains("money5")) {
            moneyClicked(5);
        }
    }

    void updateLabels(){
        count1.setText(Integer.toString(labelCounters[0]));
        count5.setText(Integer.toString(labelCounters[1]));
        count10.setText(Integer.toString(labelCounters[2]));
        count20.setText(Integer.toString(labelCounters[3]));
        count50.setText(Integer.toString(labelCounters[4]));
        count100.setText(Integer.toString(labelCounters[5]));
        count500.setText(Integer.toString(labelCounters[6]));
    }

    void moneyCount(int value){
        switch(value){
            case 1: {
                labelCounters[6]++;
                count1.setText(Integer.toString(labelCounters[6]));
                break;
            }
            case 5: {
                labelCounters[5]++;
                count5.setText(Integer.toString(labelCounters[5]));
                break;
            }
            case 10: {
                labelCounters[4]++;
                count10.setText(Integer.toString(labelCounters[4]));
                break;
            }
            case 20: {
                labelCounters[3]++;
                count20.setText(Integer.toString(labelCounters[3]));
                break;
            }
            case 50: {
                labelCounters[2]++;
                count50.setText(Integer.toString(labelCounters[2]));
                break;
            }
            case 100: {
                labelCounters[1]++;
                count100.setText(Integer.toString(labelCounters[1]));
                break;
            }
            case 500: {
                labelCounters[0]++;
                count500.setText(Integer.toString(labelCounters[0]));
                break;
            }
        }
    }

    void checkCorrect(){
        boolean wrong = false;
        for(int i=0; i<7; i++){
            if(labelCounters[i] != correctCounters[i]){
                wrong = true;
                break;
            }
        }

        if(wrong){
        } else{
            continua.setVisible(true);
        }

    }

    void moneyClicked(int value) {
        moneyCount(value);
        importo -= value;
        imp.setText(Integer.toString((importo)));
        if(importo <= 0){
            checkCorrect();
        }
    }
    @FXML
    void openMenu(ActionEvent event) {
        try{
            AnchorPane mPane = FXMLLoader.load(getClass().getResource("../progetto/greedy/menu.fxml"));
            Scene mScene = new Scene(mPane);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(mScene);
            window.show();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void nextPage(ActionEvent event){
        sc.goNext();
    }


    void disablePanes(){
        money1.setDisable(true);
        money5.setDisable(true);
        money10.setDisable(true);
        money20.setDisable(true);
        money50.setDisable(true);
        money100.setDisable(true);
        money500.setDisable(true);
    }

    @Override
    public void setSceneParent(sceneController sceneParent) {
        sc = sceneParent;
    }
}
