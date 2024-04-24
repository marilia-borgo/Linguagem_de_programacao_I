package atividade3.fracao;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
    }



    public Fracao somar(Fracao outra) {
        int novoDenominador = denominador * outra.denominador;
        int novoNumerador = (numerador * outra.denominador) + (outra.numerador * denominador);
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        return resultado;
    }

    public Fracao subtrair(Fracao outra) {
        int novoDenominador = denominador * outra.denominador;
        int novoNumerador = (numerador * outra.denominador) - (outra.numerador * denominador);
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        return resultado;
    }

    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = numerador * outra.numerador;
        int novoDenominador = denominador * outra.denominador;
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        return resultado;
    }

    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        int novoNumerador = numerador * outra.denominador;
        int novoDenominador = denominador * outra.numerador;
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        return resultado;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(2, 5);
        Fracao fracao2 = new Fracao(3, 7);

        Fracao resultado = fracao1.somar(fracao2);

        System.out.println("Resultado da soma: " + resultado);
    }
}