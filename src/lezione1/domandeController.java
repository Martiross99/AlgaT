package lezione1;

import java.io.BufferedReader;
import java.io.FileReader;

//import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.ResourceBundle;

//import com.sun.xml.internal.bind.XmlAccessorFactory;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.sceneController;

public class domandeController implements model.ISceneController {

    private AnchorPane root;
    private Scene scene;
    sceneController sc;

    @FXML
    Label domanda;
    @FXML
    Button menu;

    @FXML
    Button risposta1;
    @FXML
    Button risposta2;
    @FXML
    Button risposta3;

    @FXML
    TextArea rispostaaperta;

    @FXML
    Button prossimadomanda;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    BufferedReader f;
    String s;

    String[] domande;
    int indicedomande = 0;
    String dom;
    String[] opzioni;
    String corretta;


    void resetComps(){
        domanda.setVisible(false);

        risposta1.setVisible(false);
        risposta1.setDisable(false);
        risposta1.setStyle("-fx-background-color: transparent");

        risposta2.setVisible(false);
        risposta2.setDisable(false);
        risposta2.setStyle("-fx-background-color: transparent");

        risposta3.setVisible(false);
        risposta3.setDisable(false);
        risposta3.setStyle("-fx-background-color: transparent");

        rispostaaperta.setVisible(false);
        prossimadomanda.setVisible(false);
    }

    void parseDomanda(){
        try{
            s = f.readLine();
        } catch(Exception e){
            System.out.println(e);
        }

        //System.out.println(s);
        resetComps();
        String[] tmp = s.split("\\|");
        dom = tmp[0];
        opzioni = tmp[1].split(":");
        corretta = tmp[2];

        domanda.setText(dom);
        domanda.setVisible(true);
        //System.out.println(tmp[0]);

        if(opzioni.length == 1){
            rispostaaperta.setVisible(true);
        }

        if(opzioni.length >= 2) {


            risposta1.setText(opzioni[0]);
            risposta1.setVisible(true);
            risposta2.setText(opzioni[1]);
            risposta2.setVisible(true);
        }

        if(opzioni.length >= 3){
            risposta3.setText(opzioni[2]);
            risposta3.setVisible(true);
        }
    }

    @FXML
    void onClickProssimaDomanda(){
        parseDomanda();
    }

    @FXML
    void onClickRisposta(Event e){
        Button btn = (Button)e.getSource();
        if(btn.getText().equals(corretta)){
            btn.setStyle("-fx-background-color: green");
            prossimadomanda.setVisible(true);
        }
        else{
            btn.setStyle("-fx-background-color: red");
            btn.setDisable(true);
        }
    }

    @FXML
    void onChangeCheckRisposta(Event e){
        TextArea tmp = (TextArea)e.getSource();
        //System.out.println(tmp.getText());
        //System.out.println(corretta);
        if(tmp.getText().equals(corretta)){
            menu.setVisible(true);
            menu.setDisable(false);
        }
    }

    @FXML
    void initialize() {
        menu.setDisable(true);
        menu.setVisible(false);
        try {

            f = Files.newBufferedReader((Paths.get("src/lezione1/domande.txt")));
        } catch (Exception e){
            System.out.println(e);
        }
         parseDomanda();
    }

    @Override
    public void setSceneParent(sceneController sceneParent) {
        sc = sceneParent;
    }

    @FXML
    void gotoMenu(ActionEvent event) throws IOException {

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        sc.getProgetto().gotoMenu(window);

    }
}
