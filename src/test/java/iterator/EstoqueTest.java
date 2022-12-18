package test.java.iterator;

import main.java.iterator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
    @Test
    void deveContarCarrosDisponiveisNaLocadora() {
        Locadora locadora = new Locadora(
                new Carro("Onix Joy 2019", true),
                new Carro("Mobi 2019", true),
                new Carro("Kwid 2022", false),
                new Carro("Gol G15", true)
        );
        assertEquals(1, Estoque.contarVeiculosDisponiveisParaLocacao(locadora));
    }

    @Test
    void deveContarTotalDeCarrosDaLocadora() {
        Locadora locadora = new Locadora(
                new Carro("Onix Joy 2019", true),
                new Carro("Mobi 2019", true),
                new Carro("Kwid 2022", false),
                new Carro("Gol G15", true)
        );
        assertEquals(4, Estoque.contarTotalDeVeiculosDaLocadora(locadora));
    }
}
