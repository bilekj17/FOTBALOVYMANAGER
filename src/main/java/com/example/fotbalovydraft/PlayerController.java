package com.example.fotbalovydraft;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PlayerController {
    private Hrac hrac = null;

    @FXML
    private TextField playerName;
    @FXML
    private ToggleButton brankar;
    @FXML
    private ToggleButton obrance;
    @FXML
    private ToggleButton zaloznik;
    @FXML
    private ToggleButton utocnik;
    @FXML
    private Spinner<Integer>  spinner;
    @FXML
    private Button ulozit;
    @FXML
    private Button zavrit;

    @FXML
    public void initialize() {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        spinner.setValueFactory(valueFactory);
    }

    public Hrac getHrac() {return hrac;}
    public void setHrac(Hrac hrac) {this.hrac = hrac;}

    @FXML
    public void load(){
        playerName.setText(playerName.getText());
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        spinner.setValueFactory(valueFactory);

        switch (hrac.getPozice()){
            case Brankar, Obrance, Zaloznik, Utocnik -> brankar.setSelected(true);
        }
    }

    @FXML
    public void save(){
        Pozice pozice = null;
        if (brankar.isSelected()){
            pozice = Pozice.Brankar;
        }
        if (obrance.isSelected()){
            pozice =  Pozice.Obrance;
        }
        if (zaloznik.isSelected()){
            pozice =  Pozice.Zaloznik;
        }
        if (utocnik.isSelected()){
            pozice =  Pozice.Utocnik;
        }

        if (hrac != null){
            hrac.setName(playerName.getText());
            hrac.setHodnoceni(spinner.getValue());
            if (brankar.isSelected()){
                hrac.setPozice(Pozice.Brankar);
            }
            if (obrance.isSelected()){
                hrac.setPozice(Pozice.Obrance);
            }
            if (zaloznik.isSelected()){
                hrac.setPozice(Pozice.Zaloznik);
            }
            if (utocnik.isSelected()){
                hrac.setPozice(Pozice.Utocnik);
            }
        } else {
            hrac = new Hrac(playerName.getText(), pozice, spinner.getValue());
        }
        close();
    }

    @FXML
    public void close(){
        playerName.getScene().getWindow().hide();
    }
}
