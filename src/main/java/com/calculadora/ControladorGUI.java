package com.calculadora;
import com.Operaciones.OperacionBase;
import com.Operaciones.OperacionDivision;
import com.Operaciones.OperacionModulo;
import com.Operaciones.OperacionMultiplicacion;
import com.Operaciones.OperacionResta;
import com.Operaciones.OperacionSuma;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ControladorGUI {

    private String PrimerNumero = "";
    private String NumeroActual = "";
    private String TipodeOperacion = "";

    @FXML
    private Text TextoSabioi;

    @FXML
    private TextField textoResultado;

    OperacionBase op;

    public void GestionDeOperacion(String Operacion) {
        TipodeOperacion = Operacion;
        PrimerNumero = NumeroActual;
        NumeroActual = "";
        textoResultado.setText(PrimerNumero);
    }

    // Agrega números en cadena

    public void AgregarNumero(String number){
        NumeroActual += number;
        updateTextField();
    }

    // Muestra en pantalla el resultado de las operaciones

    public void updateTextField(){
        textoResultado.setText(NumeroActual);
    }

    @FXML
    void Button0Clicked(ActionEvent event) {
        AgregarNumero("0"); 
    }

    @FXML
    void Button1Clicked(ActionEvent event) {
        AgregarNumero("1");
    }

    @FXML
    void Button2Clicked(ActionEvent event) {
        AgregarNumero("2");
    }

    @FXML
    void Button3Clicked(ActionEvent event) {
        AgregarNumero("3");
    }

    @FXML
    void Button4Clicked(ActionEvent event) {
        AgregarNumero("4");
    }

    @FXML
    void Button5Clicked(ActionEvent event) {
        AgregarNumero("5");
    }

    @FXML
    void Button6Clicked(ActionEvent event) {
        AgregarNumero("6");
    }

    @FXML
    void Button7Clicked(ActionEvent event) {
        AgregarNumero("7");
    }

    @FXML
    void Button8Clicked(ActionEvent event) {
        AgregarNumero("8");
    }

    @FXML
    void Button9Clicked(ActionEvent event) {
        AgregarNumero("9");
    }

    @FXML
    void RestaAction(ActionEvent event) {
        GestionDeOperacion("−");
    }

    @FXML
    void SumaAction(ActionEvent event) {
        GestionDeOperacion("+");
    }

    @FXML
    void ModuloAction(ActionEvent event) {
        GestionDeOperacion("%");
    }

    @FXML
    void multiplicacionAction(ActionEvent event) {
        GestionDeOperacion("×");
    }

    @FXML
    void divisionAction(ActionEvent event) {
        GestionDeOperacion("÷");
    }

    @FXML
    void Cbutton(ActionEvent event) {
        NumeroActual = "";
        textoResultado.setText("");
        TextoSabioi.setText("");
        TipodeOperacion = "";
    }

    @FXML
    void EqualsClicked(ActionEvent event) {

        try {
            Integer PrimerNumeroInt = Integer.parseInt(PrimerNumero);
            Integer secondtNumberInt = Integer.parseInt(NumeroActual);
            Integer calculatedNumber;

            switch (TipodeOperacion) {
            
                case "+":
                {
                        try {
                            op = new OperacionSuma();
                            calculatedNumber = op.realizarOperacionAritmetica(PrimerNumeroInt, secondtNumberInt);
                            TextoSabioi.setText(PrimerNumero + " + " + NumeroActual);
                            textoResultado.setText(String.valueOf(calculatedNumber));
                            NumeroActual = Integer.toString(calculatedNumber);
                        } catch (Exception e) {
                            TextoSabioi.setText("No es posible realizar esta operación");
                        }
                        
                    
                }               
                    break;
                
                case "−":
    
                        try {
                            op = new OperacionResta();
                            calculatedNumber = op.realizarOperacionAritmetica(PrimerNumeroInt, secondtNumberInt);
                            TextoSabioi.setText(PrimerNumero + " − " + NumeroActual);
                            textoResultado.setText(String.valueOf(calculatedNumber));
                            NumeroActual = Integer.toString(calculatedNumber);
                        } catch (Exception e) {
                            TextoSabioi.setText("No puede realizar esta operacion");
                        }
                    break;
                
                case "÷":
    
                        try {
                            op = new OperacionDivision();
                            calculatedNumber = op.realizarOperacionAritmetica(PrimerNumeroInt, secondtNumberInt);
                            TextoSabioi.setText(PrimerNumero + " ÷ " + NumeroActual);
                            textoResultado.setText(String.valueOf(calculatedNumber));
                            NumeroActual = Integer.toString(calculatedNumber);
                        } catch (Exception e) {
                            TextoSabioi.setText("No puede realizar esta operacion");
                        }
                    break;
    
                case "×":
    
                        try {
                            op = new OperacionMultiplicacion();
                            calculatedNumber = op.realizarOperacionAritmetica(PrimerNumeroInt, secondtNumberInt);
                            TextoSabioi.setText(PrimerNumero + " × " + NumeroActual);
                            textoResultado.setText(String.valueOf(calculatedNumber));
                            NumeroActual = Integer.toString(calculatedNumber);
                        } catch (Exception e) {
                            TextoSabioi.setText("No puede realizar esta operacion");
                        }
                    break;

                case "%":
    
                    try {
                        op = new OperacionModulo();
                        calculatedNumber = op.realizarOperacionAritmetica(PrimerNumeroInt, secondtNumberInt);
                        TextoSabioi.setText(PrimerNumero + " % " + NumeroActual);
                        textoResultado.setText(String.valueOf(calculatedNumber));
                        NumeroActual = Integer.toString(calculatedNumber);
                    } catch (Exception e) {
                        TextoSabioi.setText("No puede realizar esta operacion");
                    }
                break;
            }

        } catch (Exception e) {
            TextoSabioi.setText("No es posible realizar esta operación");
        }
    }

}