package atividade3;
public class Caneta {
    private String marca;
    private String cor_tinta;
    private boolean tem_tampa;

    public void setCaneta (String marca, String cor, boolean tem_tampa) {
        this.marca = marca;
        this.cor_tinta = cor;
        this.tem_tampa = tem_tampa;
    }

    public String getCorTinta () {
        return cor_tinta;
    }

    public String getMarca () {
        return marca;
    }

    public boolean getTem_tampa () {
        return tem_tampa;
    }

    public void escrever() {
        System.out.println("escreveu");
    }

    public void abrir() {
        if (tem_tampa) {
            System.out.println("Tirou a tampa e abriu");
        } else {
            System.out.println("Já está aberta");
        }
    }

}
