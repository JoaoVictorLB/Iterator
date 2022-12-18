package main.java.iterator;

public class Carro {
    private String modelo;
    private boolean alugado;

    public Carro(String modelo, boolean alugado){
        this.modelo = modelo;
        this.alugado = alugado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}
