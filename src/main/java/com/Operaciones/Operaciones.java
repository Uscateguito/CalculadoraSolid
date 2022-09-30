package com.Operaciones;

/* Por SOLID esto no está bien porque en caso de que yo haga un cambio inválido en el código hago que deje
 * de funcionar el resto, dado el principio de single responsabilities
  */
public class Operaciones {
    
    public int realizarSuma(int a, int b){
        return a + b;
    }

    public int realizarResta(int a, int b){
        return a - b;
    }

    public int realizarDivision(int a, int b){

        try {
            return a/b;
        } catch (Exception e) {
            System.out.println("no es posible dividir sobre 0");
        }
        return 0;
    }

    public int realizarMultiplicacion(int a, int b){
        return a*b;
    }

    public int realizarModulo(int a, int b){
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println("no es posible dividir sobre 0");
        }
        return 0;
    }
}
