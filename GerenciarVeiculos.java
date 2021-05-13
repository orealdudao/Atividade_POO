package carManager;

import java.util.ArrayList;

public class GerenciarVeiculos {

	// Cria��o do ArrayList de Veiculos
	private ArrayList<Veiculo> automotores = new ArrayList<Veiculo>();

	// m�todos solicitados
	public void adicionar(Veiculo carro) {
		automotores.add(carro);
		System.out.println("\n" + "\t            ****");
		System.out.println("\t-- O ve�culo foi adicionado --\n");
	}
	
	public boolean remover(String placa) {

		// o status da remo��o come�a falso e apenas se altera se o veiculo for
		// encontrado
		boolean status = false;

		for (int i = 0; i < automotores.size(); i++) {
			Veiculo a = automotores.get(i);

			if (a.getPlaca().equals(placa)) {
				automotores.remove(automotores.get(i));
				status = true;
			}
		}
		return status;
	}
	
	public Veiculo buscarPorPlaca(String placa) {

		for (int i = 0; i < automotores.size(); i++) {
			Veiculo a = automotores.get(i);
			if (a.getPlaca().equals(placa)) {
				return automotores.get(i);
			}
		}
		return null;
	}
	
	public String listarVeiculos() {
		String dados = "";
		
		for (int i = 0; i < automotores.size(); i++) {
			Veiculo a = automotores.get(i);
			dados = dados +"\nVe�culo:" + (i+1) 
					+ "\n-------------------------\n" 
					+ "Modelo: " + a.getModelo() + "\n"
					+ "Marca: " + a.getMarca() + "\n"
					+ "Ano de Fabrica��o: " + a.getAnoFabricacao() + "\n"
					+ "Valor de Mercado: " + a.getValorMercado() + "\n"
					+ "Placa: " + a.getPlaca() + "\n"
					+ "Combustivel: " + a.getTipoCombustivel() + "\n"
					+ "-------------------------" + "\n" ;
		}
		
		return dados;
	}
	
	public double obterValorImposto(String placa) {
		double imposto = -1;
		
		for (int i = 0; i < automotores.size(); i++) {
			Veiculo a = automotores.get(i);
			if (a.getPlaca().equals(placa)) {
				imposto = a.calcularImposto();
				return imposto;
			}
		}
	return imposto;
	}
	
	public String listarVeiculoPorCombustivel(String combustivel) {
		String dados = "";
		
		for (int i = 0; i < automotores.size(); i++) {
			Veiculo a = automotores.get(i);
			if (a.getTipoCombustivel().equals(combustivel)) {
				dados = dados +"\nVe�culo:" + (i+1) 
						+ "\n-------------------------\n" 
						+ "Modelo: " + a.getModelo() + "\n"
						+ "Marca: " + a.getMarca() + "\n"
						+ "Ano de Fabrica��o: " + a.getAnoFabricacao() + "\n"
						+ "Valor de Mercado: R$" + a.getValorMercado() + "\n"
						+ "Placa: " + a.getPlaca() + "\n"
						+ "Combustivel: " + a.getTipoCombustivel() + "\n";				
			}
		}
		
		return dados;
		
	}
}