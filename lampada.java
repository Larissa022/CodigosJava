import java.util.Scanner;

//Código para acender ou apagar a lâmpada!

public class lampada {
    public static Scanner leia = new Scanner (System.in);
    public static void main(String Args[]){
        int lampada;

        System.out.println("Digite 1 ou 2 para acender ou apagar a lâmpada:");
        lampada=leia.nextInt();
        Acesa(lampada);
        Apagada(lampada);
    }

    public static void Acesa(int lampada){
        if(lampada == 1 ){
            System.out.print("A lâmpada está acesa");
        }
    }

    public static void Apagada(int lampada){
        if(lampada == 2 ){
            System.out.print("A lâmpada está apagada");
        } 
    }
}

