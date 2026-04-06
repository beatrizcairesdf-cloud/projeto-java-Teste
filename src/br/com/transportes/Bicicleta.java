package br.com.transportes;

public class Bicicleta extends Transportes {
	    private boolean eletrica;
	    private boolean precisaManutencao;

	    public Bicicleta(String modelo, int capacidade, boolean eletrica) {
	        super(modelo, capacidade);
	        this.eletrica = eletrica;
	        this.precisaManutencao = false;
	    }

	    @Override
	    public double calcularTarifa(double minutosUso) {
	        double custoPorMinuto = eletrica ? 0.30 : 0.10;
	        return minutosUso * custoPorMinuto;
	    }

	    @Override
	    public boolean verificarManutencao() {
	        return precisaManutencao;
	    }

	    @Override
	    public void realizarManutencao() {
	        System.out.println("Bicicleta revisada.");
	        precisaManutencao = false;
	    }

	    @Override
	    public void exibirInformacoes() {
	        super.exibirInformacoes();
	        System.out.println("É elétrica: " + eletrica);
	    }

		@Override
		public boolean verfificarManutencao() {
			// TODO Auto-generated method stub
			return false;
		}
	}



