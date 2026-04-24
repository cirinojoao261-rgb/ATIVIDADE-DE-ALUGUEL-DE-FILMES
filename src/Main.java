import Model.Cliente;
import Model.Aluguel;
import Model.Filme;


public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Vinicius", "(55) +35 9894-2122");

        Filme filme = new Filme ("Smurfs", 10.0,"Infantil");
        filme.aplicardesconto(5);

        Aluguel aluguel = new Aluguel(cliente, filme, 4);

        System.out.println(filme.exibirdetalhes());
        System.out.println(aluguel.getResumo());
        System.out.println(cliente.apresentar());
    }
}
