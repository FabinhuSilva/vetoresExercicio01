/*
Faça um programa que
-> preencha três vetores com dez posições cada
um: o primeiro vetor, com os nomes de dez produtos;
dois: vetor com os códigos dos dez produtos;
trÊs:  com os preços dos produtos. 

Mostre um relatório 
-> apenas com o nome, o código, o preço e o novo preço dos produtos que sofrerão
aumento.

Sabe-se que osprodutos que sofrerão aumento código par ou preço superior 
a R$ 1.000,00. 

-> para os produtos que satisfizerem às duas condições anteriores, 
código e preço,
       *** o aumento será de 20%; 

-> para aqueles que satisfizerem apenas à condição do código, 
       *** aumento será de 15%; 
-> para aqueles que satisfizerem apenas à condição de preço,
       *** o aumento será de 10%.

 */
package vetor01;

import java.util.Scanner;

/**
 *
 * @author Fabiano F Silva
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String nomeProduto[] = new String[10];
       int codigoProduto [] = new int[10];;
       double precoProduto[] = new double[10];;
       
       int contador = 0, contadorFor;
       // vetores criados com 10
     
        Scanner lerTeclado = new Scanner(System.in);
        
       do{
        
           System.out.println("Digite o nome do produto: ");
           nomeProduto[contador] = lerTeclado.next();
           
           System.out.println("Digite o c[odigo do produto: ");
           codigoProduto[contador] = lerTeclado.nextInt();
           
           System.out.println("Digite o Valor do Produto: ");
           precoProduto[contador]=lerTeclado.nextDouble();
                   
           contador++;
       }while (contador < 3);
/*
produtos  superior a R$ 1.000,00. 

       -> código par e preço superior a 1 mil reais,
       *** o aumento será de 20%; 

       ->  código produto sendo par, 
       *** aumento será de 15%; 

       -> preço superior a 1 mil reais,
       *** o aumento será de 10%.
       */

       //Criando valores acréscimos
       
       
       // Montando Relatorio
       for(contadorFor=0; contadorFor < 3; contadorFor++){

        for(int  : codigoProduto) {
            
            double novoValorPreçoItem = precoProduto[contadorFor];
            novoValorPreçoItem = novoValorPreçoItem+((novoValorPreçoItem/100)*15);
            
        System.out.println("Nome do Produto: "+nomeProduto[contadorFor]+
                " Seu codigo é "+codigoProduto[contadorFor]+ " e seu valor de R$ "+
                precoProduto[contadorFor]+ "Com Acrescimo de 20% ficara em R$ "+novoValorPreçoItem);
        }
        
    }
    
}
}