package exercicio;

public class Pessoa {
	//Criei um m�todo que tem um retorno vazio e com visibilidade p�blica, ele ir� imprimir a express�o Andando
	public void andar() {
		System.out.println("Andando");
	}
	//Criei um m�todo que tem um retorno vazio e com visibilidade protegida, ele ir� imprimir a express�o Respirando

	protected void respirar() {
		System.out.println("Respirando");

	}
	//Criei um m�todo que tem um retorno vazio e com visibilidade privada, ele ir� imprimir a express�o Dormindo

	private void dormir() {
		System.out.println("Dormindo");

	}


	public static void main(String[] args) { //Cria��o do m�todo main
		Pessoa p = new Pessoa(); //Comando para instancia��o da classe Pessoa
		 p.andar(); //Chamar� a fun��o andar
		 p.respirar(); //Chamar� a fun��o respirar
		 p.dormir(); //Chamar� a fun��o dormir

		
	}

}
