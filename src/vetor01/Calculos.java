/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Scanner;

/**
 *
 * @author Fabinhu
 */
public class Calculos {
    
       @SuppressWarnings("PackageVisibleField")
       
       
       int contadorsalvo = 0;
       int contadorPar=0 ;
       int cont, contFor ;
       
       // vetores criados com 10
     
       public void criaVetor(){
       String nomeProduto[] = new String[3];
       int codigoProduto [] = new int[3];
       double precoProduto[] = new double[3];
       int contador = 0;
       
       Scanner lerTeclado = new Scanner(System.in);
        
       do{
        
           System.out.println("Digite o nome do produto: ");
           nomeProduto[contador] = lerTeclado.next();
           
           System.out.println("Digite o c[odigo do produto: ");
           codigoProduto[contador] = lerTeclado.nextInt();
           
           
           System.out.println("Digite o Valor do Produto: ");
           precoProduto[contador]=lerTeclado.nextDouble();
           
           //criei um vetor somente com valores maiores que 1000,00
           
           // int pegarValor = Arrays.asList(precoProduto).indexOf(caça indice);
         
           
           if(contador > 0 && contador % 2 == 0){
               double novopreco = 0;
               novopreco = ((precoProduto[contador])*0.015)+precoProduto[contador];
               System.out.println("Reajuste Realizado: Códtigo "+codigoProduto[contador]+"\nValor passa de R$"
                       + " "+precoProduto[contador]+" para R$ "+novopreco+" - Acrescido 15% ");
           }else if(precoProduto[contador] > 1000){
               double novopreco1 = 0;
               novopreco1 = ((precoProduto[contador])*0.020)+precoProduto[contador];
               System.out.println("Reajuste Realizado: Códtigo "+codigoProduto[contador]+"\nValor passa de R$"
                       + " "+precoProduto[contador]+" para R$ "+novopreco1+" - Acrescido 20% ");
               
           }else if(contador % 2 == 0 && precoProduto[contador] > 1000){
          double novopreco2 = 0;
               novopreco2 = ((precoProduto[contador])*0.020)+precoProduto[contador];
               System.out.println("Reajuste Realizado: Códtigo "+codigoProduto[contador]+"\nValor passa de R$ "
                       + " "+precoProduto[contador]+ " para R$ "+novopreco2+" - Acrescido 10% ");
       }else{
               System.out.println("O Valor não sofrerá Reajuste!");
           }
               
           contador++;
       }while (contador < 3);
       }
       
    
}
