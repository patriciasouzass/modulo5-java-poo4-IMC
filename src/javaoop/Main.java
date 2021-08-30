package javaoop;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Patricia", 28, "1");
        Pessoa pessoa3 = new Pessoa("Vanessa", 34, "2", 68.0, 1.70);
        Pessoa pessoa4 = new Pessoa("Carlos", 32, "3", 82.0, 1.70);

        double imc1 = pessoa3.calcularIMC();
        double imc2 = pessoa4.calcularIMC();

        if (imc2 == -1){
            System.out.println("Baixo peso");
        } else if (imc2 == 0){
            System.out.println("Peso saudável");
        } else {
            System.out.println("Sobrepeso");
        }

        boolean maiorDeIdade1 = pessoa3.eMaiorDeIdade();
        boolean maioDeIdade2 = pessoa4.eMaiorDeIdade();

        if (maiorDeIdade1){
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }

        String mostrarDados = pessoa4.toString();
        System.out.println(mostrarDados);


    }
}
