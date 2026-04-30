import Model.Cliente;
import Model.Aluguel;
import Model.Filme;


public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "(55) +35 99888-2684");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getContato());


        Filme filme = new Filme ("Smurfs", 10.0,"Infantil");
        System.out.println(filme.getValoraluguel());
        System.out.println(filme.getGenero());
        System.out.println(filme.getTitulo());

        Aluguel aluguel = new Aluguel(cliente, filme, 4);
        System.out.println(aluguel.getResumo());
        System.out.println(cliente.apresentar());
    }
}
