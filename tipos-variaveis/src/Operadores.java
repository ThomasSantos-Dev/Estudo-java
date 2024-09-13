public class Operadores {

    public static void main(String[] args) {
    

            /*Atribuição
                Representado pelo símbolo de igualdade =.

                O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. 
                em Java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição.
                
                Exemplos abaixo:
            
                */
                //classe Operadores.java
                String nome = "GLEYSON";
                int idade = 22;
                double peso = 68.5;
                char sexo = 'M';
                boolean doadorOrgao = false; // false ou true
                //Date dataNascimento = new Date(); // criando um novo  objeto apartir de uma classe 

                            //classe Operadores.java
                    double soma = 10.5 + 15.7;
                    int subtração = 113 - 25;
                    int multiplicacao = 20 * 7;
                    int divisao = 15 / 3;
                    int modulo = 18 % 3; // resto da divisao
                    double resultado = (10 * 7) + (20/4); //mix de operadores

            // ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

            //classe Operadores.java
                String nomeCompleto = "LINGUAGEM" + "JAVA";
                        
               
               
                //qual o resultado das expressoes abaixo?
                String concatenacao ="?"; 
                 
            
                
                concatenacao = 1+1+1+"1"; 
            System.out.println(concatenacao);
                
                concatenacao = 1+"1"+1+1;    
            System.out.println(concatenacao);

                concatenacao = 1+"1"+1+"1";     
             System.out.println(concatenacao);
                
                concatenacao = "1"+1+1+1;  
            System.out.println(concatenacao);

                concatenacao = "1"+(1+1+1); 
            System.out.println(concatenacao);


            /*
             * Unários
                            Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

                            (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

                            (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

                            (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

                            (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

                            (!) Operador unário lógico de negação – nega o valor de uma expressão booleana;
             */

             //classe Operadores.java
                    int numero = 5;
                    
                            
                    //Imprimindo o numero negativo
                    System.out.println(- numero);

                    //incrementando numero em mais 1 numero, imprime 6
                    numero ++;
                    System.out.println(numero);

                    //incrementando numero em mais 1 numero, imprime 7
                    System.out.println(numero ++);// ops algo de errado não está certo

                    System.out.println(numero);// agora sim, numero virou 7

                    //ordem de precedencia conta aqui
                    System.out.println(++ numero);

                    boolean verdadeiro = true;

                    System.out.println("Inverteu " + !verdadeiro);




                    // TERNÁRIO 

                    // classe Operadores.java
                                int a, b;

                                a = 5;
                                b = 6;
                                

                                /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
                                if(a==b)
                                resultado = "verdadeiro";
                                else
                                resultado = "falso";
                                */

                                //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
                                String resultadoSoma = (a==b) ? "verdadeiro" : "false";

                                System.out.println(resultadoSoma);


                                //Decrementar e Incrementar

                                int idade1 = 10;
                                idade1++;
                                boolean varoi= false;
                                varoi= !varoi;

                                System.out.println( idade1 ++ ); // Regra se colocar pós voce precisa imprimir novamente a variavel 
                                System.out.println( idade1);
                                System.out.println( -- idade1); // Decrementar
                                System.out.println(!varoi);


}
   }
