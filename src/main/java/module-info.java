module org.example.tractoare {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tractoare to javafx.fxml;
    exports org.example.tractoare;
    exports org.example.tractoare.Controller;
    opens org.example.tractoare.Controller to javafx.fxml;
}