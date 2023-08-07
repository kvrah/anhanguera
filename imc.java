package JavaTech;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura,peso,imc;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a altura: ");
		altura = leia.nextDouble();
		
		System.out.println("\nEntre com o peso: ");
		peso = leia.nextDouble();
		
		imc = peso / (altura*altura);
		
		System.out.printf("\nO seu imc é de: %.2f",imc);
		
		if(imc<18.5) {
			System.out.println("\nVocê está abaixo do peso!");
			
		}else if(imc>=18.5 && imc <=24.9) {
				System.out.println("\nVocê está no peso adequado!");
		}else if(imc >=25 && imc <=29.9) {
					System.out.println("\n Você está no sobrepeso!");
		}else if(imc>30 && imc <=34.9) {
						System.out.println("\nVocê está no grau de obesidade I!");
		}else if(imc >35 && imc <=39.9) {
							System.out.println("\nVocÊ está no grau de obesidade II");
							}
						else {
							System.out.println("\n Você está com obesidade extrema!");
						}
				
}
	
}