import java.util.Scanner;
public class ObjetoAviao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String tipo, cor;
        int velocidade, qntdeAssento;



        Aviao aviao1 = new Aviao();
        System.out.println("Informe o tipo do primeiro avião: ");
        aviao1.setTipo(ler.nextLine());
        System.out.println("Informe a cor do primeiro avião: ");
        aviao1.setCor(ler.nextLine());
        System.out.println("Informe a velocidade do primeiro avião: ");
        aviao1.setVelocidade(ler.nextInt());
        ler.nextLine();
        System.out.println("Informe a quantidade de assentos do primeiro  avião: ");
        aviao1.setQntdeAssento(ler.nextInt());

        ler.nextLine();

        Aviao aviao2 = new Aviao();
        System.out.println("Informe o tipo do segundo avião: ");
        aviao2.setTipo(ler.nextLine());
        System.out.println("Informe a cor do segundo  avião: ");
        aviao2.setCor(ler.nextLine());
        System.out.println("Informe a velocidade do segundo avião: ");
        aviao2.setVelocidade(ler.nextInt());
        ler.nextLine();
        System.out.println("Informe a quantidade de assentos do segundo avião: ");
        aviao2.setQntdeAssento(ler.nextInt());

        ler.nextLine();

        Aviao aviao3 = new Aviao();
        System.out.println("Informe o tipo do terceiro avião:");
        aviao3.setTipo(ler.nextLine());
        System.out.println("Informe a cor do terceiro avião: ");
        aviao3.setCor(ler.nextLine());
        System.out.println("Informe a velocidade do terceiro avião: ");
        aviao3.setVelocidade(ler.nextInt());
        ler.nextLine();
        System.out.println("Informe a quantidade de assentos do terceiro avião: ");
        aviao3.setQntdeAssento(ler.nextInt());



        System.out.println("DADOS");
        System.out.println("TIPO DO PRIMEIRO AVIÃO :" + aviao1.getTipo());
        System.out.println("COR DO PRIMEIRO AVIÃO:" + aviao1.getCor());
        System.out.println("VELOCIDADE DO PRIMEIRO AVIÃO: " + aviao1.getVelocidade());
        System.out.println("QUANTIDADE DE ASSENTO DO PRIMEIRO AVIÃO: " + aviao1.getQntdeAssento());

        System.out.println("TIPO DO SEGUNDO AVIÃO :" + aviao2.getTipo());
        System.out.println("COR DO SEGUNDO AVIÃO:" + aviao2.getCor());
        System.out.println("VELOCIDADE DO SEGUNDO AVIÃO : " + aviao2.getVelocidade());
        System.out.println("QUANTIDADE DE ASSENTO DO SEGUNDO AVIÃO: " + aviao2.getQntdeAssento());

        System.out.println("TIPO DO TERCEIRO AVIÃO:" + aviao3.getTipo());
        System.out.println("COR DO TERCEIRO AVIÃO:" + aviao3.getCor());
        System.out.println("VELOCIDADE DO TERCEIRO AVIÃO: " + aviao3.getVelocidade());
        System.out.println("QUANTIDADE DE ASSENTO DO TERCEIRO AVIÃO: " + aviao3.getQntdeAssento());



    }
}