package com.Operaciones;

public class OperacionModulo implements OperacionBase {

    private int realizarModulo(int a, int b){
        return a % b;
    }

    @Override
    public int realizarOperacionAritmetica(int a, int b) {
        return realizarModulo(a, b);
    }
    
}
