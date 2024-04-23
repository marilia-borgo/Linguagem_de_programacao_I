package forms;


public class Prato {
    private String formato;
    private String cor;
    private String is_raso;

    public void setPrato (String formato, String cor, String is_raso) {
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

    public String getIsRaso () {
        return is_raso;
    }

    public String colocar_comida () {
        System.out.println("Colocou comida");
        String mensagem = "Colocou comida no prato cor ";
        return mensagem + this.cor ;
    }

    public void lavar () {
        System.out.println("Lavado e pronto pra uso");
    }

    public void tirarComida() {
        System.out.println("Prato vazio");
    }
}
