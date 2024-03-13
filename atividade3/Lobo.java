package atividade3;

public class Lobo {
    private String cor;
    private String especie;
    private boolean is_filhote;

    public void setLobo (String cor, String especie, boolean is_filhote) {
        this.is_filhote = is_filhote;
        this.especie = especie;
        this.cor = cor;
    }

    public String getEspecie () {
        return especie;
    }

    public String getCor () {
        return cor;
    }

    public Boolean getIsFilhote () {
        return is_filhote;
    }

    public void comer () {
        System.out.println("O lobo comeu");
    }

    public void cacar () {
        System.out.println("o lobo caçou");
    }
    public void pularnaNeve () {
        System.out.println("o lobo pulou na neve");
    }

}
