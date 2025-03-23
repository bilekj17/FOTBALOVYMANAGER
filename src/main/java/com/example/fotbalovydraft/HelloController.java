package com.example.fotbalovydraft;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private ListView<Hrac> listView;
    @FXML
    private Label informace;

    @FXML
    public void initialize() {
        listView.getItems().add(new Hrac("Lionel Messi ", Pozice.Utocnik, 93));
        listView.getItems().add(new Hrac("Kevin De Bruyne ", Pozice.Zaloznik, 91));
        listView.getItems().add(new Hrac("Thibaut Courtois ",Pozice.Brankar, 89));
    }

    @FXML
    public void deletePlayer(){
        listView.getItems().remove(listView.getSelectionModel().getSelectedItem());
    }

    @FXML
    protected void addPlayer() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Player.fxml"));
        VBox form = loader.load();

        PlayerController controller = loader.getController();

        Stage stage = new Stage();
        stage.setTitle("Přidání hráče do seznamu");
        stage.setScene(new Scene(form));
        stage.showAndWait();

        Hrac hrac = controller.getHrac();

        listView.getItems().add(hrac);
    }

    @FXML
    protected void editPlayer() throws IOException {
        if (listView.getSelectionModel().getSelectedItem() != null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Player.fxml"));
            VBox form = loader.load();

            PlayerController controller = loader.getController();

            controller.setHrac(listView.getSelectionModel().getSelectedItem());
            controller.load();

            Stage stage = new Stage();
            stage.setTitle("Upravení hráče v seznamu");
            stage.setScene(new Scene(form));
            stage.showAndWait();
        } else {
            showAlert("Vyber Hráče");
        }

    }

    @FXML
    public void showAlert(String error){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(error);
        alert.setContentText(error);
        alert.showAndWait();
    }

    @FXML
    public void showPlayer(){
        Hrac hrac = listView.getSelectionModel().getSelectedItem();
        String output = "Jmeno: "+hrac.getName()+", ";
        output += " Pozice:  "+hrac.getPozice()+", ";
        output += " Hodnocení: "+hrac.getHodnoceni()+", ";
        informace.setText(output);
    }


}