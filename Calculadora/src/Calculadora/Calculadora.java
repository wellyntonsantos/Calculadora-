package Calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			double num1, num2;
			char operacao;

			System.out.println("Digite o primeiro número:");
			num1 = scanner.nextDouble();

			System.out.println("Digite a operação (+, -, *, /):");
			operacao = scanner.next().charAt(0);

			System.out.println("Digite o segundo número:");
			num2 = scanner.nextDouble();

			double resultado = 0;

			switch (operacao) {
			    case '+':
			        resultado = num1 + num2;
			        break;
			    case '-':
			        resultado = num1 - num2;
			        break;
			    case '*':
			        resultado = num1 * num2;
			        break;
			    case '/':
			        if (num2 != 0) {
			            resultado = num1 / num2;
			        } else {
			            System.out.println("Erro: Divisão por zero não permitida.");
			            return;
			        }
			        break;
			    default:
			        System.out.println("Operação inválida.");
			        return;
			}

			System.out.println("Resultado: " + resultado);
		}
    }
}

