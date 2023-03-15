import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class data {
    public static void main(String args[]){

        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o seu nome:");
            String nome = "";
            nome=leia.next();
            String saudacao = "";
            LocalDate hoje = LocalDate.now();
            Locale brasil = new Locale("pt","BR");
            System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
            LocalDateTime agora = LocalDateTime.now();

            if(agora.getHour() >=0 && agora.getHour() <12){
                saudacao= "Bom dia pessoa linda";
            }else if(agora.getHour() >=12 && agora.getHour() <18){
                saudacao= "Boa tarde pessoa linda";
            }else if(agora.getHour() >=18 && agora.getHour() <24){
                saudacao= "Boa noite pessoa linda";
            }else{

            }
            System.out.println("Olá "+ nome + ", " + saudacao + " ");
        }
    }
}
