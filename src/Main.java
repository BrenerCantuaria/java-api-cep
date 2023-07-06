import javax.xml.stream.events.EndElement;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();
        System.out.print("Digite um número de CEP para consulta:");
        var cep = leitor.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaArquivo(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");
        }



    }
}

