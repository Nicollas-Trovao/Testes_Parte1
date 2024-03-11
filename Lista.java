package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Roberto", 25, "Masculino"));
        pessoas.add(new Pessoa("Julia", 19, "Feminino"));
        pessoas.add(new Pessoa("Marta", 37, "Feminino"));
        pessoas.add(new Pessoa("Davi", 40, "Masculino"));
        pessoas.add(new Pessoa("Ricardo", 22, "Masculino"));
        pessoas.add(new Pessoa("Carla", 20, "Feminino"));

        List<Pessoa> generoMasculino = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .collect(Collectors.toList());

        System.out.println("As Mulheres são:");
        for (Pessoa pessoa : generoMasculino) {
            System.out.println(pessoa.getNome() + ", " + pessoa.getIdade() + " anos");
        }
    }

    public List<Pessoa> filtrarGenero(List<Pessoa> pessoas, String generoFiltrado) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals(generoFiltrado))
                .collect(Collectors.toList());
    }
}