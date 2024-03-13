package atividade3;
public class Inseto {
    private String nome;
    private String cor;
    private boolean tem_asas;

    public void setInseto (String cor, String especie, boolean tem_asas) {
        this.cor = cor;
        this.nome = especie;
        this.tem_asas = tem_asas;
    }

    public String getCor () {
        return cor;
    }

    public String getNome () {
        return nome;
    }

    public boolean getTem_asas () {
        return tem_asas;
    }

    public void voar() {
        System.out.println("O inseto está voando.");
    }

    public void comer() {
        System.out.println("O inseto está nhoc-nhoc");
    }

    public void andar() {
        System.out.println("O inseto está andadno");
    }
}
