import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
        		
			//chamando o método contendo a lógica de contagem
            if (parametroDois > parametroUm) {
                contar(parametroUm, parametroDois);
            } else {
                System.out.println("O segundo parâmetro deve ser maior do que o primeiro");
            }
		}catch (Exception e) {
            System.out.println("Parametros invalidos");
		} finally {
            terminal.close();
        }
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
              
            System.out.println("imprimindo numero: "+ i);
        }
	}
}