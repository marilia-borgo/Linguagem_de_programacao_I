package atividade3;

public class Passaros {
    private String cor;
    private String especie;
    private boolean is_adulto;

    public void setPassaros(String cor, String especie, boolean is_adulto) {
        this.cor = cor;
        this.especie = especie;
        this.is_adulto = is_adulto;
    }

    public String getCor () {
        return cor;
    }

    public String getEspecie () {
        return especie;
    }

    public Boolean getIsAdulto () {
        return is_adulto;
    }

    public void voar() {
        System.out.println("O pássaro está voando.");
    }

    public void aninhar() {
        if (is_adulto) {
            System.out.println("O pássaro está aninhando.");
        } else {
            System.out.println("O pássaro ainda não é adulto para aninhar.");
        }
    }

    public void acasalar(Passaros parceiro) {
        if (is_adulto && parceiro.is_adulto) {
            System.out.println("Os pássaros estão acasalando.");
        } else {
            System.out.println("Um ou ambos os pássaros não são adultos para acasalar.");
        }
    }
}
