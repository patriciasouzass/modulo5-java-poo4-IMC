package javaoop;

public class Pessoa {
    String nome, id;
    int idade;
    double peso, altura, imc;

    public Pessoa(){

    }

    public Pessoa(String nome, Integer idade, String id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        imc = peso * (Math.pow(altura, 2));
        if (imc < 20){
            return - 1d;
        } else if (imc >= 20 && imc <= 25){
            return 0d;
        } else {
            return 1d;
        }
    }

    public boolean eMaiorDeIdade(){
        if (idade >= 18){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc=" + imc +
                '}';
    }
}
