/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediaesolar.java;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class imc {
    
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

String nome;
int idade;
Double peso;
Double altura;
    int i;

for (i=1;i<=3;i++){

System.out.println("Digite o nome");
    nome = sc.next();

System.out.println("Digite a idade");
    idade = sc.nextInt();

System.out.println("Digite o seu peso");
    peso = sc.nextDouble();

System.out.println("Digite sua altura");
    altura = sc.nextDouble();
    
    double imc = (peso/(altura*altura));

    
    System.out.println("nome = " +nome+ "" + "idade" + idade);
    System.out.println("peso = " +peso+ "" +"altura" + altura);
    System.out.println("Seu imc é = "+imc);
    
            
    
    
    

      if(imc<=18.5){
        System.out.println(" abaixo do peso ");
    }else if(imc<=24.9){
        System.out.println(" Peso normal ");
        }else if (imc<=29.9){
        System.out.println(" Excesso de Peso ");
        }else if(imc<=34.9){
            System.out.println(" Obesidade classe1 ");
        }else if (imc<=39.9) {
            System.out.println(" Obesidade classe2 ");
        }else if (imc>40.0) {
            System.out.println(" Obesidade classe3 ");
        }
            
}   
    

}
}
