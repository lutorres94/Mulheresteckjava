/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaesolar.java;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class MediaesolarJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1,n2,n3,n4, media;
        
        System.out.println("Digite a nota do 1º bimestre");
        n1 = sc.nextDouble();
                
        System.out.println("Digite a nota do 2º bimestre");
        n2 = sc.nextDouble();
                
        System.out.println("Digite a nota do 3º bimestre");
        n3 = sc.nextDouble();
                
        System.out.println("Digite a nota do 4º bimestre");
        n4 = sc.nextDouble();
        
        media = (n1+n2+n3+n4)/4;
        
        if(media>=6){
            System.out.println("Aluno aprovado - Média = media");
            }
        else{
            System.out.println("Aluno reprovado - Média = media");
          }
       
        if(media<3){
        System.out.println("Aluno Reprovado");
       }
       else if(media<5.9){
         System.out.println("Aluno de recuperação");
       }
      else{
      System.out.println("Aluno aprovado");

      }
    }
}

    
