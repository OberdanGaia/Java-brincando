package br.oberdan.brincando.recursivo;

public class FibonacciRecursivo {

	public static void main(String[] args) {
		
		//Sequencia fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		
		System.out.println(fibonacci(7));
	}
	
	static int fibonacci(int numero){
		
		if(numero < 2){
			return 1;
		}
		
		return fibonacci(numero - 1) + fibonacci(numero - 2);
		
	}

}
