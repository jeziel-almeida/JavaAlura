public class Fluxo {

    public static void main(String[] args) {
        System.out.println();

		System.out.println("Ini do main");
		
        metodo1();
		
        System.out.println("Fim do main");

        System.out.println();
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		
        try {

			metodo2();

		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exceção. Motivo: " + msg);
            ex.printStackTrace();
		}

		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i=5; i>=0; i--) {
			double divisao = 2 / i;
			System.out.println(divisao);
		}
		System.out.println("Fim do metodo2");
	}

}
