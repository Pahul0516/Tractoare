package org.example.tractoare.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.tractoare.Repository.Tractor;
import org.example.tractoare.Repository.Repository;

public class Controller extends Service{
    
    @FXML
    public TextField textFieldPret;
    @FXML
    public TextField textFieldNume;
    @FXML
    public Button btnAdd;
    @FXML
    public Button btnDel;
    public TableColumn<Tractor, String> idTableColumn;
    public TableColumn<Tractor, String> nameTableColumn;
    public TableColumn<Tractor, String> priceTableColumn;
    @FXML
    TableView<Tractor> tractoareTableView;

    public void initialize_view()
    {
        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        btnAdd.setOnAction(e -> {

            Integer pret = Integer.parseInt(textFieldPret.getText());
            String nume = textFieldNume.getText();
            Tractor t = new Tractor(999,nume,pret);
            repo.create(t);
            load_data();
        });

        btnDel.setOnAction(e -> {
            Tractor t = tractoareTableView.getSelectionModel().getSelectedItem();
            repo.delete(t);
            load_data();
        });
        load_data();
    }

    void load_data()
    {
        ObservableList<Tractor> data = FXCollections.observableArrayList(
                new Tractor(1, "Doe", 30),
                new Tractor(2, "Smith", 25),
                new Tractor(3, "Johnson", 40)
        );
        tractoareTableView.setItems(data);
    }
}