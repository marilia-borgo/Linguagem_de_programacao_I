package atividade3;
public class Prato {
    private String formato;
    private String cor;
    private boolean is_raso;

    public void setPrato (String formato, String cor, boolean is_raso) {
        this.formato = formato;
        this.cor = cor;
        this.is_raso = is_raso;
    }

    public String getFormato () {
        return formato;
    }

    public String getCor () {
        return cor;
    }

    public boolean getIsRaso () {
        return is_raso;
    }

    public void colocar_comida () {
        System.out.println("Colocou comida na prato");
    }

    public void lavar () {
        System.out.println("Lavado e pronto pra uso");
    }

    public void tirarComida() {
        System.out.println("Prato vazio");
    }
}
