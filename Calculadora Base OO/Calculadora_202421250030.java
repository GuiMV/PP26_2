/**
 * Biblioteca de operações matemáticas básicas.
 *
 * A classe fornece operações de soma, subtração, multiplicação e divisão
 * para valores inteiros e de ponto flutuante.
 *
 * A classe não pode ser instanciada, pois todas as suas operações são
 * métodos estáticos.
 *
 * @author José Guilherme Moizinho Viana
 * @version 1.0
*/
public final class Calculadora_202421250030{
    private Calculadora_202421250030(){
        // Não permito instâncias desse objeto.
    } 
    
    /**
        * Retorna a soma dos valores (int | double) fornecidos.
        * @param args valores a serem somados
        * @return soma dos valores; 0 caso nenhum valor seja fornecido
    */
    public static int somar(int... args){
        int resultado = 0;
        if (args != null) {
            for (int valor : args) {
                resultado += valor;
            }
        }
        return resultado;
    }
    public static double somar(double... args){
        double resultado = 0;
        if (args != null) {
            for (double valor : args) {
                resultado += valor;
            }
        }
        return resultado;
    }
    
    /**
        * Retorna a subtração dos valores (int | double) fornecidos.
        * @param args valores a serem decrementados
        * @return resultado da subtração dos valores; 0 caso nenhum valor seja fornecido
    */       
    public static int subtrair(int... args){
        if (args == null || args.length == 0) {
            return 0;
        }
        
        int resultado = args[0];
        for (int indice = 1; indice < args.length; indice++) {
            resultado -= args[indice];
        }
        return resultado;
    }
    public static double subtrair(double... args){
        if (args == null || args.length == 0) {
            return 0.0;
        }
        
        double resultado = args[0];
        for (int indice = 1; indice < args.length; indice++) {
            resultado -= args[indice];
        }
        return resultado;
    }
    
    /**
        * Retorna a multiplicação dos valores (int | double) fornecidos.
        * @param args valores a serem multiplicados
        * @return multiplicação dos valores; 0 caso nenhum valor seja fornecido
    */
    public static int multiplicar(int... args){
        if (args == null || args.length == 0) {
            return 0;
        }
        
        int resultado = 1;
        for (int valor : args) {
            resultado *= valor;
        }
        return resultado;
    }
    public static double multiplicar(double... args){
        if (args == null || args.length == 0) {
            return 0.0;
        }
        
        double resultado = 1;
        for (double valor : args) {
            resultado *= valor;
        }
        return resultado;
    }
    
     /**
        * Retorna a divisão dos valores double fornecidos.
        * @param args valores a serem divididos
        * @return divisão dos valores; 0 caso nenhum valor seja fornecido
        * @throws ArithmeticException caso algum divisor seja zero
    */
    public static double dividir(double... args){
        if (args == null || args.length == 0) {
            return 0.0;
        }
        
        double resultado = args[0];
        for (int indice = 1; indice < args.length; indice++) {
            if (args[indice] == 0) {
                throw new ArithmeticException("Divisão por zero.");
            }
            resultado /= args[indice];
        }
        return resultado;
    }
}