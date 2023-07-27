package Variaveis;

public class Operadores {

	public static void main(String[] args) {
		//Operador Unário 01 ++ e --.
		
		int preco = 10;
		System.out.println(preco); // 10
		System.out.println(preco++); // 10 + 1 = 11
		System.out.println(++preco); // 11 + 1 = 12
		System.out.println(preco--);
		System.out.println(--preco);
//      -------------------------------------------
		//Operador Unário 02 (operações).
		
		int valor01 = 10;
		int valor02 = 10;
		
		//System.out.println(valor01++ + ++valor01);
		//System.out.println(valor02++ + valor02++);
		System.out.println(valor02++ + ++valor01);
	}

}
