package org.example.tractoare.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.example.tractoare.Domain.Tractor;

public class Controller {
    
    @FXML
    public TextField textFieldPret;
    @FXML
    public TextField textFieldNume;
    @FXML
    public Button btnadd;
    @FXML
    public Button btnDel;
    @FXML
    TableView<Tractor> tractoareTableView;


}