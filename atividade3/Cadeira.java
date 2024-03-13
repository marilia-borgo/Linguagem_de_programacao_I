package atividade3;
public class Cadeira {
    private String cor;
    private String material;
    private boolean tem_rodinhas;

    public void setCadeira (String cor, String material, boolean tem_rodinhas) {
        this.cor = cor;
        this.material = material;
        this.tem_rodinhas = tem_rodinhas;
    }

    public String getCor () {
        return cor;
    }

    public String getMaterial () {
        return material;
    }

    public boolean getTem_rodinhas () {
        return tem_rodinhas;
    }

    public void moverDireita() {
        System.out.println("a cadeira foi pra direita");
    }

    public void moverEsquerda() {
        System.out.println("a cadeira foi pra esquerda.");
    }

}
