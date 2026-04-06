package br.com.transportes;

public class Onibus extends Transportes {
	    private boolean possuiArCondicionado;
	    private boolean precisaManutencao;

	    public Onibus(String modelo, int capacidade, boolean possuiArCondicionado) {
	        super(modelo, capacidade);
	        this.possuiArCondicionado = possuiArCondicionado;
	        this.precisaManutencao = false;
	    }

	    @Override
	    public double calcularTarifa(double distancia) {
	        double tarifaBase = 4.50;
	        double adicionalPorKm = 0.30 * distancia;
	        if (possuiArCondicionado) {
	            tarifaBase += 1.00; 	        }
	        return tarifaBase + adicionalPorKm;
	    }

	    @Override
	    public boolean verificarManutencao() {
	        return precisaManutencao;
	    }

	    @Override
	    public void realizarManutencao() {
	        System.out.println("Ônibus em manutenção...");
	        precisaManutencao = false;
	    }

	    @Override
	    public void exibirInformacoes() {
	        super.exibirInformacoes();
	        System.out.println("Possui ar-condicionado: " + possuiArCondicionado);
	        
	        
	    }
	   
		@Override
		public boolean verfificarManutencao() {
			// TODO Auto-generated method stub
			return false;
		}
	}



