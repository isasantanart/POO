import java.util.Scanner;
public class Exemplo1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, c;
        a = 10;
        System.out.println("Informe um número: ");
        b = leia.nextInt();
        try {
            c = a / b;
            System.out.println("Valor de C:" + c);
        } catch (ArithmeticException erro) {
            System.out.println("Não existe divisão por zero");
        }
    }
}