package carManager;

import java.util.Scanner;

public class AppVeiculo {

	public static void menu() {
		System.out.println("*************************************");
		System.out.println("\t Gerenciador de carros");
		System.out.println("1. Adicionar Veículo");
		System.out.println("2. Remover Veículo");
		System.out.println("3. Busca por placa");
		System.out.println("4. Buscar todos");
		System.out.println("5. Consulta taxa de imposto");
		System.out.println("6. Busca por combustivel");
		System.out.println("7. Finaliza\n");
		System.out.print("--> Opcao: ");
	}

	public static void main(String[] args) {

		// atributos de entrada
		String modelo;
		String marca;
		int anoFabricacao;
		double valorMercado;
		String placa;
		String tipoCombustivel = "";
		double imposto;

		// atributos de manutenção
		int opcao;
		int aux;
		boolean acao;

		// instanciação dos Scanners de Strings, numeros e instanciação de veiculo
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Veiculo carro;
		GerenciarVeiculos gerenciador = new GerenciarVeiculos();

		// Execução do Menu
		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {

			// adicionar
			case 1:
				// Captura e construção do veiculo
				System.out.println("\n1. Para adicionar o veiculo, a seguir insira os dados referentes ao mesmo.\n");
				System.out.print("--> Insira o Modelo: ");
				modelo = entrada.next();
				System.out.print("--> Insira a Marca: ");
				marca = entrada.next();
				System.out.print("--> Insira o Ano de Fabricacao: ");
				anoFabricacao = entrada2.nextInt();
				System.out.print("--> Insira o Valor de Mercado: R$");
				valorMercado = entrada2.nextDouble();
				System.out.print("--> Insira a Placa: ");
				placa = entrada.next();
				System.out.println(" _____________________________________________________________");
				System.out.println("|            |              |          |         |            |");
				System.out.println("| 1 - Alcool | 2 - Gasolina | 3 - Flex | 4 - GNV | 5 - Diesel |");
				System.out.println("|____________|______________|__________|_________|____________|");
				System.out.print("\n--> Insira o número do Tipo de Combustivel: ");
				aux = entrada.nextInt();
				do {
					switch (aux) {
					case 1:
						tipoCombustivel = "Alcool";
						break;
					case 2:
						tipoCombustivel = "Gasolina";
						break;
					case 3:
						tipoCombustivel = "Flex";
						break;
					case 4:
						tipoCombustivel = "GNV";
						break;
					case 5:
						tipoCombustivel = "Diesel";
						break;
					default:
						System.out.println("--> Opção Inválida.\n");
						aux = -1;
						break;
					}
				} while (aux == -1 );

				carro = new Veiculo(modelo, marca, anoFabricacao, valorMercado, placa, tipoCombustivel);

				// adiciona o veiculo ao ArrayList
				gerenciador.adicionar(carro);
				break;

			// remover
			case 2:
				// Captura a placa e remove
				System.out.println("\n2. Para remover um veiculo, a seguir insira a plca do mesmo. \n");
				System.out.print("--> Placa do Veículo a ser removido: ");
				placa = entrada.next();
				acao = gerenciador.remover(placa);

				if (acao) {System.out.println("\n" + "\t            ****");
				System.out.println("\t-- O veículo foi removido --\n");
				} else {
					System.out.println("\n" + "\t                  ****");
					System.out.println("\t-- Veículo não consta em nosso sistema! --\n");
				}
				break;

			// Busca por placa
			case 3:
				// Captura a placa e busca
				System.out.println("\n3. Insira a pala do veiculo para realizar a busca. \n");
				System.out.print("--> Insira a placa do Veiculo: ");
				placa = entrada.next();
				carro = gerenciador.buscarPorPlaca(placa);

				if (carro == null) {
					System.out.println("\n" + "\t                  ****");
					System.out.println("\t-- Veículo não consta em nosso sistema! --\n");
				} else {
					System.out.print("\n" + "_____________________________ ");
					System.out.print("\n" + "Dados do Veículo solicitado: \n");
					carro.imprimir();
				}
				break;

			// Listar Veiculos
			case 4:
				System.out.print("\n" + "_____________________________ ");
				System.out.println(gerenciador.listarVeiculos() + "\n");
				break;
			
			// Consulta taxa de imposto
			case 5:
				System.out.print("\n5. Você optou por consultar a taxa de imposto de um veículo \n");
				System.out.print("\n--> Insira a placa do Veiculo: ");
				placa = entrada.next();
				
				imposto = gerenciador.obterValorImposto(placa);
				
				if(imposto == -1) {
					System.out.println("\n" + "\t                  ****");
					System.out.println("\t-- Veículo não consta em nosso sistema! --\n");
				}else {
					System.out.print("\n" + "----------------------------- \n");
					System.out.printf("Valor do imposto: R$" + "%.2f", imposto);
					System.out.print("\n" + "----------------------------- \n");
				}
				
				break;

			// Listar por Combustivel
			case 6:
				System.out.println("\n" + " _____________________________________________________________");
				System.out.println("|            |              |          |         |            |");
				System.out.println("| 1 - Alcool | 2 - Gasolina | 3 - Flex | 4 - GNV | 5 - Diesel |");
				System.out.println("|____________|______________|__________|_________|____________|");
				System.out.print("\n6. Para listar os veículo pelo combustivel insira o número do Tipo: ");
				aux = entrada.nextInt();
				do {
					switch (aux) {
					case 1:
						tipoCombustivel = "Alcool";
						break;
					case 2:
						tipoCombustivel = "Gasolina";
						break;
					case 3:
						tipoCombustivel = "Flex";
						break;
					case 4:
						tipoCombustivel = "GNV";
						break;
					case 5:
						tipoCombustivel = "Diesel";
						break;
					default:
						aux = -1;
						System.out.println("--> Opção Inválida.\n");
						break;
					}
				} while ( aux == -1);
				
				String aux1 = gerenciador.listarVeiculoPorCombustivel(tipoCombustivel);
				
				if(aux1 == "") {
					System.out.println("\n" + "\t                  ****");
					System.out.println("\t-- Veículo não consta em nosso sistema! --\n");
				}else {
					System.out.print("\n" + "_____________________________ ");
					System.out.printf(aux1);
					System.out.println("----------------------------- \n");
				}
				//System.out.println(gerenciador.listarVeiculoPorCombustivel(tipoCombustivel));

				break;
			case 7:
				opcao = -1;
				System.out.println("\nObrigado por usar o nosso Gerenciador, volte sempre!");				
				break;
			default:
				System.out.println("--> Opção inválida.\n");
			}
		} while (opcao != -1);
		entrada.close();
		entrada2.close();

	}
}