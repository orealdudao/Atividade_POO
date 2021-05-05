package carManager;

public class Veiculo {

	private String modelo;
    private String marca;
    private int anoFabricacao;
    private double valorMercado;
    private String placa;
    private String tipoCombustivel;
    int length;

    public Veiculo(String modelo, String marca, int anoFabricacao, double valorMercado, String placa, String tipoCombustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularImposto() {
        double imposto = 0;
        if (this.anoFabricacao - 2021 > 20) {
            imposto = 0;
        }
        if ("gasolina".equals(this.tipoCombustivel) || "diesel".equals(this.tipoCombustivel) || "flex".equals(this.tipoCombustivel)) {
            imposto = (valorMercado / 100) * 4;
        } else {
            imposto = (valorMercado / 100) * 3;
        }
        return 0;
    }

    public void imprimir() {
        System.out.println("-------------------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Ano de Fabricação: " + this.getAnoFabricacao());
        System.out.println("Valor de Mercado: " + this.getValorMercado());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Combustivel: " + this.getTipoCombustivel());
    }

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