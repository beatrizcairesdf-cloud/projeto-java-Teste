package br.com.transportes;

public class Metro extends Transportes {
	   
	    private int numeroDeVagoes;
	    private boolean precisaManutencao;

	    public Metro(String modelo, int capacidade, int numeroDeVagoes) {
	        super(modelo, capacidade);
	        this.numeroDeVagoes = numeroDeVagoes;
	        this.precisaManutencao = false;
	    }

	    @Override
	    public double calcularTarifa(double distancia) {
	        	        return 5.00;
	    }

	    @Override
	    public boolean verificarManutencao() {
	        return precisaManutencao;
	    }

	    @Override
	    public void realizarManutencao() {
	        System.out.println("Metrô em manutenção...");
	        precisaManutencao = false;
	    }

	    @Override
	    public void exibirInformacoes() {
	        super.exibirInformacoes();
	        System.out.println("Número de vagões: " + numeroDeVagoes);
	    }

		@Override
		public boolean verfificarManutencao() {
			// TODO Auto-generated method stub
			return false;
		}
	}



