package main.java.iterator;

import java.util.Iterator;

public class Estoque {
    public static Integer contarVeiculosDisponiveisParaLocacao(Locadora locadora){
        int quantidade = 0;
        for(Carro carro : locadora){
            if(!carro.isAlugado()){
                quantidade++;
            }
        }

        return quantidade;
    }

    public static Integer contarTotalDeVeiculosDaLocadora(Locadora locadora){
        int quantidade = 0;
        for (Iterator a = locadora.iterator(); a.hasNext();){
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
