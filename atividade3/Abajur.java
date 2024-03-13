package atividade3;

public class Abajur {
    private String temperatura_luz;
    private String cor;
    private boolean tem_apoio;

    public void setAbajur (String cor, String temperatura_luz, boolean tem_apoio) {
        this.tem_apoio = tem_apoio;
        this.temperatura_luz = temperatura_luz;
        this.cor = cor;
    }

    public String getTemperaturaLuz () {
        return temperatura_luz;
    }

    public String getCor () {
        return cor;
    }

    public Boolean getTemApoio () {
        return tem_apoio;
    }

    public void acende () {
        System.out.println("acende");
    }

    public void apaga () {
        System.out.println("apaga");
    }

}
