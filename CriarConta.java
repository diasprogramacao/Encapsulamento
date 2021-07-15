package contaBancariaEncapsulamento;

public class CriarConta {

	public static void main(String[]agrs){
		
		//ADICIONANDO REFERENCIA DO OBJETO CONTA NA VARIAVEL CONTA1		
		Conta conta1 = new Conta();
		//ADICIONANDO REFERENCIA DO OBJETO CLIENTE NA VARIAVEL CLIENTE1
		Cliente cliente1 = new Cliente();
		
// INSERINDO A REFERENCIA DO OBJETO CLIENTE NO ATRIBUTO TITULAR ATRAVÉS DO MÉTODO SET TITULAR
		conta1.setTitular (cliente1);
		
//UTILZIANDO A FUNÇÃO GETTITULAR PARA IMPRIMIR O VALOR DO TITULAR, POR QUE ELE É PRIVADO.		
		System.out.println(conta1.getTitular());
		
// INSERINDO UM NOME NO ATRIBUTO DO OBJETO CLIENTE.O TITULAR DO OBJETO CONTA E O NOME OBJETO CLIENTE.
//SAO PRIVADOS, POR CONTA DISSO O CÓDIGO FICOU NESSE MANEIRA.		
		conta1.getTitular().setNome("Alan teste");
		System.out.println(conta1.getTitular().getNome());
		
		
	}
	
}
