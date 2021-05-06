package carManager;

public class GerenciarVeiculos {

	//private ArrayList<Veiculo> carroA = new ArrayList<>();
    private Veiculo[] automotores;
    private int tamanho = 0;

    protected void aumentaCapacidade() {
        if (this.tamanho == this.automotores.length) {
            Veiculo[] autoMotoresNovos = new Veiculo[this.automotores.length * 2];
            for (int i = 0; i < this.automotores.length; i++) {
                autoMotoresNovos[i] = this.automotores[i];
            }
            this.automotores = autoMotoresNovos;
        }
    }

    public boolean adiciona(Veiculo automotor) {
        this.aumentaCapacidade();
        if (this.tamanho < this.automotores.length) {
            this.automotores[this.tamanho] = automotor;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public double obterValorImposto(String placa){
        for (int i = 0; i < this.tamanho; i++) {
            if (this.automotores[i].getPlaca().equals(placa)) {
                return i;
            }
        }
        return -1;
    }

    public Veiculo buscarPorPlaca(String placa) {

        for (int i = 0; i < this.tamanho; i++) {
            if (this.automotores[i].getPlaca().equals(placa)) {
                return automotores[i];
            }
        }
        return null;
    }

    public String listarVeiculos() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.automotores[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.automotores[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public boolean remover(String placa) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.automotores[i].getPlaca().equals(placa)) {
                automotores.remove(i);
                return true;
            }
        }
        return false;
    }

    
    
    
    /*
	public void remover(String placa) {
        for (int i = 0; i < automotores.size(); i++) {
            Veiculo automotores = automotores.get(i);
            if (automotores.getPlaca().equalsIgnoreCase(placa)) {
                automotores.remove(aluno);
                System.out.println("Veiculo removido com sucesso");
                return true;
            }
        }
        System.out.println("Veiculo nao encontrado");
        return false;
    }
     */
}
