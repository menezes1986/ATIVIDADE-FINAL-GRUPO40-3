public class Calculadora {

    //Método para somar os dois números:
    
       public int somar(int a, int b) {
           return a + b;
       }
    
    //Método para subtrair os dois números:
    
       public int subtrair(int a, int b) {
           return a - b;
       }
    
       public static void main(String[] args) {
    
    //Exemplo de uso da classe:
    
           Calculadora calculadora = new Calculadora();
    
           int resultadoSoma = calculadora.somar(5, 3);
           System.out.println("Resultado da soma: " + resultadoSoma);
    
           int resultadoSubtracao = calculadora.subtrair(10, 4);
           System.out.println("Resultado da subtração: " + resultadoSubtracao);
    
       }
    }