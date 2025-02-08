module org.example.tractoare {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tractoare to javafx.fxml;
    exports org.example.tractoare;
}