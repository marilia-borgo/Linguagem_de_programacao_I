package atividade3;

public class Chave {
    private String material;
    private String tamanho;
    private String cor;

    public void setChave (String material, String tamanho, String cor) {
        this.material = material;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getMaterial () {
        return material;
    }

    public String getTamanho () {
        return tamanho;
    }

    public String getCor () {
        return cor;
    }

    public void abrirFechadura () {
        System.out.println("abriu a fechadura");
    }

    public void fecharFechadura () {
        System.out.println("fechou a fechadura");
    }

    public void pendurar() {
        System.out.println("pendurou a chave");
    }
}
