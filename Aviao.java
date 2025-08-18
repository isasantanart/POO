import java.util.Scanner;
public class Aviao {
    private String tipo;
    private String cor;
    int velocidade;
    int qntdeAssento;

    //get e set
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){

        this.velocidade = velocidade;
    }
    public int getQntdeAssento(){
        return qntdeAssento;
    }
    public void setQntdeAssento (int qntdeAssento){
        this.qntdeAssento = qntdeAssento;
    }
}