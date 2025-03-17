package com.example.fotbalovydraft;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class HelloController {
    @FXML
    private ListView<Hrac> listView;
    @FXML
    public void initialize() {
        listView.getItems().add(new Hrac("Lionel Messi", Pozice.Utocnik, 93));
        listView.getItems().add(new Hrac("Kevin De Bruyne", Pozice.Zaloznik, 91));
        listView.getItems().add(new Hrac("Thibaut Courtois",Pozice.Brankar, 89));
    }

    @FXML
    public void deletePlayer(){
        listView.getItems().remove(listView.getSelectionModel().getSelectedItem());
    }

    @FXML
    protected void addPlayer(){

    }



}