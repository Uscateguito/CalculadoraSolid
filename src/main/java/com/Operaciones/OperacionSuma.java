package com.Operaciones;

// Overwrite sobreescribo algo de la clase padre, overload es utilizar el mismo nombre con diferentes parámetros

public class OperacionSuma implements OperacionBase {

    private int realizarSuma(int a, int b){
        return a + b;
    }

    @Override
    public int realizarOperacionAritmetica(int a, int b) {
        return realizarSuma(a, b);
    }    
}
