package atividade3;

public class BolaDeGude {
    private String cor;
    private String tamanho;
    private boolean is_manchada;

    public void setBolaDeGude (String cor, String tamanho, boolean is_manchada) {
        this.is_manchada = is_manchada;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho () {
        return tamanho;
    }

    public String getCor () {
        return cor;
    }

    public Boolean getIsManchada () {
        return is_manchada;
    }

    public void jogar () {
        System.out.println("jogar a bolinha");
    }

    public void rolar () {
        System.out.println("rolar a bolinha");
    }

}
