package calculadora;

import exceptions.DivisionByZeroException;

public class Calculadora {
    public static double soma(double x, double y){
        return x + y;
    }

    public static double subtracao(double x, double y){
        return x - y;
    }

    public static double multiplicacao(double x, double y){
        return x * y;
    }

    public static double divisao(double x, double y){
        if(y == 0) throw new DivisionByZeroException("Não é possível dividir um número por zero!");
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println(Calculadora.soma(2, 5));
        System.out.println(Calculadora.subtracao(7, 11));
        System.out.println(Calculadora.divisao(2, 10));
        System.out.println(Calculadora.divisao(16, 4));
        try{System.out.println(Calculadora.divisao(3, 0));}
        catch(DivisionByZeroException ex){
            System.out.println(ex.getMessage());
        }
    }
}
