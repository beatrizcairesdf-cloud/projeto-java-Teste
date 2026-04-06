package br.com.main;

import br.com.transportes.Bicicleta;
import br.com.transportes.Metro;
import br.com.transportes.Onibus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Onibus onibus = new Onibus("Mercedes B340R", 45, true);
		        Metro metro = new Metro("Linha Laranja", 300, 8);
		        Bicicleta bicicleta = new Bicicleta("Caloi", 1, false);

		        System.out.println("====== INFORMAÇÕES =======");
		       
		        onibus.exibirInformacoes();
		        System.out.println("Tarifa: R$ " + onibus.calcularTarifa(10));
		        
		        System.out.println(" +----------------+ ");


		        metro.exibirInformacoes();
		        System.out.println("Tarifa: R$ " + metro.calcularTarifa(10));
		        
		        System.out.println(" +----------------+ ");


		        bicicleta.exibirInformacoes();
		        System.out.println("Tarifa: R$ " + bicicleta.calcularTarifa(20));
		        
		        
		        System.out.println(" +----------------+");
		    }


	}


