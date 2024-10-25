import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> listaProduto = new ArrayList<>();

        Produto produto1 = new Produto ("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);
        Produto produto3 = new Produto("amaciante", 15.59, 10);

        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);

        System.out.println(listaProduto.size());
        System.out.println("Produto na posição 0: " + listaProduto.get(0).getNome());
        System.out.println("Produto na posição 1: " + listaProduto.get(1).getNome());
        System.out.println("Produto na posição 2: " + listaProduto.get(2).getNome());


    }
}