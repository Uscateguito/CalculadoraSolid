package com.Operaciones;

public class OperacionDivision implements OperacionBase{

    private int realizarDivision(int a, int b){
            return a / b;     
    }

    @Override
    public int realizarOperacionAritmetica(int a, int b) {
        return realizarDivision(a, b);
    }

    
    
}
