package exercicio;

public class Pessoa {
	//Criei um método que tem um retorno vazio e com visibilidade pública, ele irá imprimir a expressão Andando
	public void andar() {
		System.out.println("Andando");
	}
	//Criei um método que tem um retorno vazio e com visibilidade protegida, ele irá imprimir a expressão Respirando

	protected void respirar() {
		System.out.println("Respirando");

	}
	//Criei um método que tem um retorno vazio e com visibilidade privada, ele irá imprimir a expressão Dormindo

	private void dormir() {
		System.out.println("Dormindo");

	}


	public static void main(String[] args) { //Criação do método main
		Pessoa p = new Pessoa(); //Comando para instanciação da classe Pessoa
		 p.andar(); //Chamará a função andar
		 p.respirar(); //Chamará a função respirar
		 p.dormir(); //Chamará a função dormir

		
	}

}
