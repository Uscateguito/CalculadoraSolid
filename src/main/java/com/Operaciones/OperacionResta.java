package com.Operaciones;

public class OperacionResta implements OperacionBase{
    
    private int realizarResta(int a, int b){
        return a - b;
    }

    @Override
    public int realizarOperacionAritmetica(int a, int b) {
        return realizarResta(a, b);
    } 
}
