import javax.swing.*;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
         System.out.println("Digite o seu primeiro salario");
         String salario = valores.nextLine();
         System.out.println("Digite o segundo salario");
         String salario2 = valores.nextLine();
         System.out.println("Digite o terceiro valor");
         String salario3 = valores.nextLine();

         //Convertendo de String para  Numero
        double valorsalario = Double.parseDouble(salario);
        double valorsalario2 = Double.parseDouble(salario2);
        double valorsalario3 = Double.parseDouble(salario3);

        //realizando o calculo da média

        double resultado = valorsalario + valorsalario2 + valorsalario3 / 3;

        //Exibindo o resultado da conversão
        System.out.println("O resultado da media salarial dos 3 Ultimos Meses é igual a :" + resultado);


    }
}
