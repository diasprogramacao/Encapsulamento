package contaBancariaEncapsulamento;

public class Conta {
	
	  private String agencia;
    private Cliente titular;
    
    public void setTitular(Cliente valorSet) {
    	
    	this.titular = valorSet;
    }

    public Cliente getTitular () {
    	
    	return this.titular;
    }
}
