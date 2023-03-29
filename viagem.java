import java.util.Scanner;

//Calcular o gasto de combustível em uma viagem. O sistema deverá solicitar à distância(Km),consumo(Km/L) e o valor do litro do combustível. O sistema deve mostrar o valor gasto com combustível na viagem.  

public class viagem {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int distancia;
        double consumo,valor,gasto;
        System.out.print("Digite a distância percorrida: ");
        distancia=leia.nextInt();
        System.out.print("Digite o consumo: ");
        consumo=leia.nextDouble();
        System.out.print("Digite o valor do litro: ");
        valor=leia.nextDouble();
        
        gasto=distancia/consumo;
        System.out.print("Seu gasto é: "+(gasto*valor));
    }
}
