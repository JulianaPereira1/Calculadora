import java.util.Scanner;


public class Calc1 {
	public static void main (String [] args) {
		Scanner tec = new Scanner(System.in);
		int op;
		float n1,n2;
		
		do{
			System.out.println("Digite o primeiro numero");
			n1=tec.nextFloat();
			System.out.println("Digite o segundo numero");
			n2=tec.nextFloat();
	
			
			System.out.println("Digite a opera��o desejada");
			System.out.println("[1] Soma");
			System.out.println("[2] Subtra��o");
			System.out.println("[3] Multiplica��o");
			System.out.println("[4] Divis�o");
			System.out.println("[0] Sair");
			op=tec.nextInt();
			
			switch (op) {
				
			case 1: 
				float soma = n1+n2;
				System.out.println("Soma: "+soma);
				break;
				
			case 2: 
				float subtracao = n1-n2;
				System.out.println("Subtra��o: "+subtracao);
				break;
				
			case 3: 
				float multi = n1*n2;
				System.out.println("Multiplica��o: "+multi);
				break;
				
			case 4: 
				float div = n1/n2;
				System.out.println("Divis�o: "+div);
				break;
				
			default:
				System.out.println("Op��o Inv�lida");
			}
		}while(op!=0);
	tec.close();
	}

}
