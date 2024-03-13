package atividade3;
public class TestaClasse {
 public static void main(String[] args) {
    Abajur meuAbajur = new Abajur();
        
    meuAbajur.setAbajur("Branco", "Fria", true);
    System.out.println("Cor do abajur: " + meuAbajur.getCor());
    System.out.println("Temperatura da luz: " + meuAbajur.getTemperaturaLuz());
    System.out.println("Tem apoio? " + meuAbajur.getTemApoio());
    meuAbajur.acende();
    meuAbajur.apaga();

    BolaDeGude minhaBola = new BolaDeGude();
    minhaBola.setBolaDeGude("Vermelha", "Pequena", false);
    
    System.out.println("\nCor da bola de gude: " + minhaBola.getCor());
    System.out.println("Tamanho da bola de gude: " + minhaBola.getTamanho());
    System.out.println("Está manchada? " + minhaBola.getIsManchada());
    minhaBola.jogar();
    minhaBola.rolar();

    Cadeira minhaCadeira = new Cadeira();
    minhaCadeira.setCadeira("Preto", "Madeira", true);
    
    System.out.println("\nCor da cadeira: " + minhaCadeira.getCor());
    System.out.println("Material da cadeira: " + minhaCadeira.getMaterial());
    System.out.println("Tem rodinhas? " + minhaCadeira.getTem_rodinhas());
    minhaCadeira.moverDireita();
    minhaCadeira.moverEsquerda();

    Caneta minhaCaneta = new Caneta();
    minhaCaneta.setCaneta("BIC", "Azul", true);
    
    System.out.println("\nMarca da caneta: " + minhaCaneta.getMarca());
    System.out.println("Cor da tinta: " + minhaCaneta.getCorTinta());
    System.out.println("Tem tampa? " + minhaCaneta.getTem_tampa());
    minhaCaneta.abrir();
    minhaCaneta.escrever();

    Chave minhaChave = new Chave();
    minhaChave.setChave("Metal", "Pequeno", "Prateado");
    
    System.out.println("\nMaterial da chave: " + minhaChave.getMaterial());
    System.out.println("Tamanho da chave: " + minhaChave.getTamanho());
    System.out.println("Cor da chave: " + minhaChave.getCor());
    minhaChave.abrirFechadura();
    minhaChave.fecharFechadura();
    minhaChave.pendurar();


    Inseto meuInseto = new Inseto();
    meuInseto.setInseto("Verde", "Besouro", true);
    
    System.out.println("\nNome do inseto: " + meuInseto.getNome());
    System.out.println("Cor do inseto: " + meuInseto.getCor());
    System.out.println("Tem asas? " + meuInseto.getTem_asas());
    meuInseto.voar();
    meuInseto.comer();
    meuInseto.andar();

    Livro meuLivro = new Livro();
    meuLivro.setLivro("Java: Como Programar", "Deitel & Deitel", 1000);
    
    System.out.println("\nTítulo do livro: " + meuLivro.getTitulo());
    System.out.println("Autor do livro: " + meuLivro.getAutor());
    System.out.println("Número de páginas do livro: " + meuLivro.getQuantPaginas());
    meuLivro.abrir();
    meuLivro.fechar();
    meuLivro.virarPagina();

    Lobo meuLobo = new Lobo();
    meuLobo.setLobo("Cinza", "Lobo Cinzento", false);
    
    System.out.println("\nEspécie do lobo: " + meuLobo.getEspecie());
    System.out.println("Cor do lobo: " + meuLobo.getCor());
    System.out.println("É filhote? " + meuLobo.getIsFilhote());
    meuLobo.comer();
    meuLobo.cacar();
    meuLobo.pularnaNeve();

    Passaros meuPassaro = new Passaros();
    meuPassaro.setPassaros("Azul", "Canário", false);
    
    System.out.println("\nEspecie do pássaro: " + meuPassaro.getEspecie());
    System.out.println("Cor do pássaro: " + meuPassaro.getCor());
    System.out.println("É adulto? " + meuPassaro.getIsAdulto());
    meuPassaro.voar();
    meuPassaro.aninhar();
    meuPassaro.acasalar(meuPassaro);

    Prato meuPrato = new Prato();
    meuPrato.setPrato("Redondo", "Branco", true);
    
    System.out.println("\nFormato do prato: " + meuPrato.getFormato());
    System.out.println("Cor do prato: " + meuPrato.getCor());
    System.out.println("É raso? " + meuPrato.getIsRaso());
    meuPrato.colocar_comida();
    meuPrato.lavar();
    meuPrato.tirarComida();
    
    }
}