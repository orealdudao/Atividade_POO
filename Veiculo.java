package carManager;

public class Veiculo {

	//atributos de veiculo
	private String modelo;
    private String marca;
    private int anoFabricacao;
    private double valorMercado;
    private String placa;
    private String tipoCombustivel;

    //construtor de veiculo
    public Veiculo(String modelo, String marca, int anoFabricacao, double valorMercado, String placa, String tipoCombustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
    }

    //metodos de veiculo
    public double calcularImposto() {
        double imposto = 0;
        if (2021 - this.anoFabricacao > 20) {
            imposto = 0;
        }
        else if ("Gasolina".equals(this.tipoCombustivel) || "Diesel".equals(this.tipoCombustivel) || "Flex".equals(this.tipoCombustivel)) {
            imposto = (valorMercado / 100) * 4;
        } else {
            imposto = (valorMercado / 100) * 3;
        }
        return imposto;
    }
    public void imprimir() {
        System.out.println("-------------------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Ano de Fabricação: " + this.getAnoFabricacao());
        System.out.println("Valor de Mercado: R$" + this.getValorMercado());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Combustivel: " + this.getTipoCombustivel());
        System.out.println("-------------------------");
        System.out.println(" ");
    }

    //getter e setters
    public String getModelo() {
        return modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public double getValorMercado() {
        return valorMercado;
    }
    
    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

}