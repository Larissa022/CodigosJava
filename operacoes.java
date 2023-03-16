import java.util.Scanner;
public class operacoes{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int valor1,valor2;
        int operacao;
        System.out.print("Digite o primeiro valor: ");
        valor1=leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2=leia.nextInt();
        System.out.print("Digite a operação que deseja como 1 para adição, 2 para subtração, 3 para multiplicação e 4 para divisão: ");
        operacao=leia.nextInt();
        switch(operacao) {
            case 1:
                System.out.println("Seu resultado é: " + (valor1+valor2));
            break;
            case 2:
                System.out.println("Seu resultado é: " + (valor1-valor2));
            break;
            case 3:
                System.out.println("Seu resultado é: " + (valor1*valor2));
            break;
            case 4:
                System.out.println("Seu resultado é: " + (valor1/valor2));
            break;
            default:
                System.out.println("Erro");
        }
    }
}