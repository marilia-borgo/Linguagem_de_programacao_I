package forms;
public class Inseto {
    private String nome;
    private String cor;
    private String tem_asas;

    public void setInseto (String cor, String especie, String tem_asas) {
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

    public String getTem_asas () {
        return tem_asas;
    }


    public String voar () {
        System.out.println("O inseto está voando");
        String mensagem = "O inseto está voando da cor   ";
        return mensagem + this.cor ;
    }

    public void comer() {
        System.out.println("O inseto está nhoc-nhoc");
    }

    public void andar() {
        System.out.println("O inseto está andadno");
    }
}
