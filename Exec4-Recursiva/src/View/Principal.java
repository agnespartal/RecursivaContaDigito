package View;

import Controller.ContaController;

public class Principal {

	public static void main(String[] args) {
		ContaController contar = new ContaController();
		
		int num1 = 13251;
		int num2 = 1;
		
		int resultado = contar.quantosNum(num1, num2);
		System.out.println(resultado);
	
	}

}
