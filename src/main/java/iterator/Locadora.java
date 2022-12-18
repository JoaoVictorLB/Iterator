package main.java.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Locadora implements Iterable<Carro>{
    private List<Carro> carros = new ArrayList<Carro>();

    public Locadora(Carro... carros) {
        this.carros = Arrays.asList(carros);
    }

    @Override
    public Iterator<Carro> iterator() {
        return carros.iterator();
    }
}
