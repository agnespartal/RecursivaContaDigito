package Controller;

public class ContaController {

	public ContaController() {
		super();
	}

	public int quantosNum (int num1, int num2) {
		int cont = 0;
		//condição de parada quando o valor inicial chegar a 0 
		if ( num1 == 0) {
			return 0;
		} else {
			int div = num1 % 10;
			num1 = num1/10;
			if (div == num2) {
				cont++;
			}
			return cont + quantosNum(num1, num2);
			//armazenar o resto da divisão, e dividir, o valor inicial por 10, e contar somente o resto da divisão que for igual ao digito desejado
		}
		
	}
}
