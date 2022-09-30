module com.calculadora {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.calculadora to javafx.fxml;
    exports com.calculadora;
}
