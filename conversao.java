import java.util.Scanner;
public class conversao{
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args[]){
        float celsius, fahrenheit;
        System.out.print("Digite a temperatura em Celsius: ");
        celsius=leia.nextFloat();
        fahrenheit = (celsius * 1.8f) + 32;
        System.out.println(" A conversão foi:" + fahrenheit);
    }
}

//converter Celsius para Fahrenheit.