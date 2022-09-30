package com.Operaciones;

public class OperacionMultiplicacion implements OperacionBase {

    private int realizarMultiplicacion(int a, int b){
        return a * b;
    }

    @Override
    public int realizarOperacionAritmetica(int a, int b) {
        return realizarMultiplicacion(a, b);
    }
        
}
