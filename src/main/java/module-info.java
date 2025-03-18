module com.proyecto.proyectopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.proyecto.proyectopoo to javafx.fxml;
    exports com.proyecto.proyectopoo;
    exports com.proyecto.proyectopoo.controllers;
    opens com.proyecto.proyectopoo.controllers to javafx.fxml;
}