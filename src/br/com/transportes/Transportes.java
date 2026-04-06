package br.com.transportes;

public abstract class Transportes implements Manutenivel{

	private String modelo;
	private int capacidade;
	
	protected Transportes(String modelo, int capacidade) {
	  setModelo(modelo);
	  setCapacidade(capacidade);
	
	}
	
	public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio!");
        }
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade < 1) {
            throw new IllegalArgumentException("Capacidade deve ser maior ou igual a 1.");
        }
        this.capacidade = capacidade;
    }

    
    public abstract double calcularTarifa(double distancia);

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade: " + capacidade);
    }

	public boolean verificarManutencao() {
		// TODO Auto-generated method stub
		return false;
	}

	public void realizarManutencao() {
		// TODO Auto-generated method stub
		
	}
}
	
	


