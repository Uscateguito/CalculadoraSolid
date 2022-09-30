package com.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
            Scene scene = new Scene(root);

            // Le indicamos uno de los estilos que vamos a utilizar en el front-end
            primaryStage.sizeToScene();
            primaryStage.setTitle("Calculadora");
            primaryStage.setScene(scene);
            primaryStage.show(); 
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }

    public static void main(String[] args) {
        launch(args);
    }
}