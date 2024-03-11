package Lista;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class ListaTeste {

    @Test
    public void testFiltrarGenero() {

        Lista lista = new Lista();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Roberto", 25, "Masculino"));
        pessoas.add(new Pessoa("Julia", 19, "Feminino"));
        pessoas.add(new Pessoa("Marta", 37, "Feminino"));
        pessoas.add(new Pessoa("Davi", 40, "Masculino"));
        pessoas.add(new Pessoa("Ricardo", 22, "Masculino"));
        pessoas.add(new Pessoa("Carla", 20, "Feminino"));

        List<Pessoa> mulheres = lista.filtrarGenero(pessoas, "Feminino");

        assertEquals(3, mulheres.size());

        assertEquals("Julia", mulheres.get(0).getNome());
        assertEquals(19, mulheres.get(0).getIdade());
        assertEquals("Marta", mulheres.get(1).getNome());
        assertEquals(37, mulheres.get(1).getIdade());
        assertEquals("Carla", mulheres.get(2).getNome());
        assertEquals(20, mulheres.get(2).getIdade());
    }
}