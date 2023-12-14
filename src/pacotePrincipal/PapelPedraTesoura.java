package pacotePrincipal;

import java.util.Scanner;

public class PapelPedraTesoura {

	public static void main(String[] args) throws InterruptedException {

		while (true) {
			Scanner teclado = new Scanner(System.in);

			System.out.println("Escolha PAPEL(1), PEDRA(2) ou TESOURA(3):");
			int jogada1 = teclado.nextInt();

			if (jogada1 == 1)
				System.out.println("Você escolheu PAPEL.");
			else if (jogada1 == 2)
				System.out.println("Você escolheu PEDRA.");
			else
				System.out.println("Você escolheu TESOURA.");

			System.out.println("Agora é a vez da CPU jogar...");
			Thread.sleep(1000); // atrasa 1 segundo
			int jogada2 = (int) (Math.random() * 3) + 1; // gera um número decimal aleatório entre 1 e 3

			if (jogada2 == 1)
				System.out.println("A CPU escolheu PAPEL.");
			else if (jogada2 == 2)
				System.out.println("A CPU escolheu PEDRA.");
			else
				System.out.println("A CPU escolheu TESOURA.");

			System.out.println("Processando o vencedor...");
			Thread.sleep(1000);
			if (jogada1 == jogada2) {
				System.out.println("Empatou!");
//			} else if (jogada1 == 1 && jogada2 == 2) {
//				System.out.println("Papel enrola pedra, você venceu!");
//			} else if (jogada1 == 2 && jogada2 == 3) {
//				System.out.println("Pedra quebra tesoura, você venceu!");
//			} else if (jogada1 == 3 && jogada2 == 1) {
//				System.out.println("Tesoura corta papel, você venceu!");
//			} else {
//				System.out.println("Se deu mal, a CPU ganhou!");
//			}
			}else if((jogada1 == 1 && jogada2 == 2) || (jogada1 == 2 && jogada2 == 3) || (jogada1 == 3 && jogada2 == 1)){
				System.out.println("Uhuuuu, você venceu!");
				teclado.close();
				break;
			}else{
				System.out.println("Se deu mal, a CPU ganhou!");
				teclado.close();
				break;
			}

		}
	}

}
