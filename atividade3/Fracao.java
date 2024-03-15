package atividade3;

public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
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
        this.denominador = denominador;
    }

    public void simplificar() {
        int mdc = mdc(numerador, denominador);
        numerador /= mdc;
        denominador /= mdc;
    }

    public Fracao somar(Fracao f) {
        int novoNumerador = numerador * f.denominador + f.numerador * denominador;
        int novoDenominador = denominador * f.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao f) {
        int novoNumerador = numerador * f.denominador - f.numerador * denominador;
        int novoDenominador = denominador * f.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao f) {
        int novoNumerador = numerador * f.numerador;
        int novoDenominador = denominador * f.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao f) {
        int novoNumerador = numerador * f.denominador;
        int novoDenominador = denominador * f.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    private int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }


    public static void main(String[] args) {
        Fracao f1 = new Fracao(2, 5);
        Fracao f2 = new Fracao(3, 7);
        Fracao soma = f1.somar(f2);
        System.out.println("Soma: " + soma.numerador + "/" + soma.denominador);

        Fracao f1a = new Fracao(4, 3);
        Fracao f2a = new Fracao(2, 7);
        Fracao suba = f1a.subtrair(f2a);
        System.out.println("Subtração: " + suba.numerador + "/" + suba.denominador);


        // // Subtrai as frações
        // Fracao subtracao = f1.subtrair(f2);
        // System.out.println("Subtração: " + subtracao);

        // // Multiplica as frações
        // Fracao multiplicacao = f1.multiplicar(f2);
        // System.out.println("Multiplicação: " + multiplicacao);

        // // Divide as frações
        // Fracao divisao = f1.dividir(f2);
        // System.out.println("Divisão: " + divisao);
    }
}