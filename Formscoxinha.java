import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Formscoxinha extends Application {

    @Override 
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulário de Coxinha");

        // Entender melhor essa parte
        Image imagem = null;
        try {
            imagem = new Image(new FileInputStream("Tarefa4/imagens/coxinha.jpeg")); 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Criando o ImageView para a imagem
        ImageView imageView = new ImageView(imagem);

        // Caixa para receita
        Label receitaLabel = new Label("Qual a receita da Massa:");
        // Texto para receita
        TextField receitaText = new TextField();

        // Caixa para tamanhos
        Label tamanhoLabel = new Label("Qual o tamanho:");
        // Texto para tamanhos
        TextField tamanhoText = new TextField();

        // Caixa para recheio
        Label recheioLabel = new Label("Qual o recheio:");
        // Texto para recheio
        TextField recheioText = new TextField();

        // Botão para submeter o formulário
        Button enviarButton = new Button("Enviar");

        // Criando a interface
        GridPane gridPane = new GridPane();

        // Ajustando o tamanho
        gridPane.setMinSize(500, 300);

        // Ajustando o espaçamento
        gridPane.setPadding(new Insets(10));

        // Distancia entre as caixas
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        // Alinhando a posição
        gridPane.setAlignment(Pos.CENTER);

        // Adicionando a imagem ao layout
        gridPane.add(imageView, 0, 4, 3, 1); 

        // Colocando tudo
        gridPane.add(receitaLabel, 0, 0);
        gridPane.add(receitaText, 1, 0);

        gridPane.add(tamanhoLabel, 0, 1);
        gridPane.add(tamanhoText, 1, 1);

        gridPane.add(recheioLabel, 0, 2);
        gridPane.add(recheioText, 1, 2);

        // Colocando o botão em uma posição adequada
        gridPane.add(enviarButton, 1, 5);

        // Configurando o plano de fundo
        gridPane.setStyle("-fx-background-color:WHITE;");

        // Criando a cena
        Scene scene = new Scene(gridPane);

        // Funcionalidade do Botão
        enviarButton.setOnAction(event -> {
            String receita = receitaText.getText();
            String tamanhos = tamanhoText.getText();
            String recheio = recheioText.getText();
        
            Rcoxinha.exibirResultado(receita, tamanhos, recheio);
        });

        // Adicionando a cena
        primaryStage.setScene(scene);

        // Mostrando a janela
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

