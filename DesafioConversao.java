import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sal1,sal2,sal3;
        Double media;
        
        System.out.println("Digite o primeiro salário");
        sal1 = entrada.nextLine();
        System.out.println("Digite o segundo salário");
        sal2 = entrada.nextLine();
        System.out.println("Digite o terceiro salário");
        sal3 = entrada.nextLine();

        media = (Double.parseDouble(sal1.replace(',', '.')) + Double.parseDouble(sal2.replace(',', '.'))
                + Double.parseDouble(sal3.replace(',', '.'))) / 3.010;

        System.out.printf("A média dos salários é: %f\n", media);

    }
    
}
