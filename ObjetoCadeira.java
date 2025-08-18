import java.util.Scanner;
public class ObjetoCadeira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String cor, modelo;
        int tempoUso, preco;
        Cadeira cadeira1 = new Cadeira();
        System.out.println("Informe o modelo da primeira cadeira");
        cadeira1.setCor(ler.nextLine());
        System.out.println("Informe a cor da primeira cadeira: ");
        cadeira1.setModelo(ler.nextLine());
        System.out.println("Informea marca da primeira cadeira: ");
        cadeira1.setMarca(ler.nextLine());
        System.out.println("Informe o preso da primeira cadeira: ");
        cadeira1.setPeso(ler.nextDouble());

        ler.nextLine();

        Cadeira cadeira2 = new Cadeira();
        System.out.println("Informe o modelo da segunda cadeira");
        cadeira2.setCor(ler.nextLine());
        System.out.println("Informe a cor da segunda cadeira: ");
        cadeira2.setModelo(ler.nextLine());
        System.out.println("Informe a marca de uso da segunda cadeira: ");
        cadeira2.setMarca(ler.nextLine());
        System.out.println("Informe o peso da segunda cadeira: ");
        cadeira2.setPeso(ler.nextInt());

        ler.nextLine();

        Cadeira cadeira3 = new Cadeira();
        System.out.println("Informe o modelo da terceira cadeira");
        cadeira3.setCor(ler.nextLine());
        System.out.println("Informea cor da terceira cadeira: ");
        cadeira3.setModelo(ler.nextLine());
        System.out.println("Informe a marca de uso da terceira cadeira: ");
        cadeira3.setMarca(ler.nextLine());
        System.out.println("Informe o peso da terceira cadeira: ");
        cadeira3.setPeso(ler.nextInt());


        System.out.println("DADOS");
        System.out.println("MODELO DA PRIMEIRA CADEIRA :" + cadeira1.getCor());
        System.out.println("COR DA PRIMEIRA CADEIRA :" + cadeira1.getModelo());
        System.out.println("MARCA DA PRIMEIRA CADEIRA: " + cadeira1.getMarca());
        System.out.println("PESO DA PRIMEIRA CADEIRA: " + cadeira1.getPeso());

        System.out.println("DADOS");
        System.out.println("MODELO DA SEGUNDA CADEIRA :" + cadeira2.getCor());
        System.out.println("COR DA SEGUNDA CADEIRA :" + cadeira2.getModelo());
        System.out.println("MARCA DA SEGUNDA CADEIRA: " + cadeira2.getMarca());
        System.out.println("PESO DA PRIMEIRA CADEIRA: " + cadeira2.getPeso());

        System.out.println("DADOS");
        System.out.println("MODELO DA TERCEIRA CADEIRA :" + cadeira3.getCor());
        System.out.println("COR DA TERCEIRA CADEIRA :" + cadeira3.getModelo());
        System.out.println("MARCA DA TERCEIRA CADEIRA: " + cadeira3.getMarca());
        System.out.println("PESO DA PRIMEIRA CADEIRA: " + cadeira3.getPeso());


    }
}