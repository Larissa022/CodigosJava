import java.util.Scanner;
public class soma4{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int nota1,nota2,nota3,nota4;
        float media;
        System.out.print("Digite a primeira nota: ");
        nota1=leia.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2=leia.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3=leia.nextInt();
        System.out.print("Digite a quarta nota: ");
        nota4=leia.nextInt();
        media=(nota1+nota2+nota3+nota4)/4;
        System.out.println("Sua média foi: "+media);
    }
}
    
//Somar 4 Notas e Tirar a Média