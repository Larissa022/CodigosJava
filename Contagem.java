import java.util.Scanner;
public class Contagem{
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args[]){
        int num;
        int opcao;
        System.out.print("Digite um número: ");
        num=leia.nextInt();
        System.out.print("Escolha 1 ou 2: ");
        opcao=leia.nextInt();
        switch(opcao){
            case 1:
                for(int x=0; x<=num; x+=1)
                {
                    System.out.println(x);
                }
                System.out.println("Acabou a contagem crescente!");
            break;
            case 2:
                for(int count=num; count>=1; count-=1)
                {
                    System.out.println(count);
                }
                System.out.println("Acabou a contagem decrescente!");
            break;
            default:
            System.out.println("DEU ERRO! /(°o°)/");
        }
    }
}