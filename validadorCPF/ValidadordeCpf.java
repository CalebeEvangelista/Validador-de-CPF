package validadorCPF;
import java.util.Scanner;
public class ValidadordeCpf {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cpf;
		int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,parte1,parte2,parte3;
		
		System.out.println("Digite o CPF sem pontuação: ");
		cpf = sc.next();
		
		// Devemos primeiramente separar todos os 11 digitos do CPF
		String[] digitos = cpf.split("", 11);
		d1 = Integer.parseInt(digitos[0]);
		d2 = Integer.parseInt(digitos[1]);
		d3 = Integer.parseInt(digitos[2]);
		d4 = Integer.parseInt(digitos[3]);
		d5 = Integer.parseInt(digitos[4]);
		d6 = Integer.parseInt(digitos[5]);
		d7 = Integer.parseInt(digitos[6]);
		d8 = Integer.parseInt(digitos[7]);
		d9 = Integer.parseInt(digitos[8]);
		d10 = Integer.parseInt(digitos[9]);
		d11 = Integer.parseInt(digitos[10]);
		
		// Depois devemos fazer essa conta doida multiplicando de forma decrescente de 10 até 2 e juntando o resultado com a proxima multiplicação
		parte1 = d1*10+d2*9+d3*8+d4*7+d5*6+d6*5+d7*4+d8*3+d9*2;
		parte2 = parte1 * 10 % 11;
		
		// Por fim temos que verificar se o resto da divisão é igual ao 10º digito do cpf, caso o resto for '10' devemos considerar como um '0'
		if (parte2 == 10) {
			parte2 = 0;
			if (parte2 == d10) {
				System.out.println("Ta certo");
			}
			else {
				System.out.println("Deu errado");
			}	
		}
		
		else if (parte2 == d10) {
			System.out.println("Ta certo");
		}
			
		sc.close();
	}

}
