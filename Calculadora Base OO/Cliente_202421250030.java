public class Cliente_202421250030 {
    public static void main(String[] args) {
        System.out.println("=== TESTE DA CALCULADORA ===");

        // Soma
        System.out.println("\nSOMA:");
        System.out.println("Inteiros: " +
            Calculadora_202421250030.somar(10, 20, 30));

        System.out.println("Decimais: " +
            Calculadora_202421250030.somar(10.5, 2.5, 7.0));


        // Subtração
        System.out.println("\nSUBTRAÇÃO:");
        System.out.println("Inteiros: " +
            Calculadora_202421250030.subtrair(100, 20, 10));

        System.out.println("Decimais: " +
            Calculadora_202421250030.subtrair(100.5, 20.5, 10.0));


        // Multiplicação
        System.out.println("\nMULTIPLICAÇÃO:");
        System.out.println("Inteiros: " +
            Calculadora_202421250030.multiplicar(2, 3, 4));

        System.out.println("Decimais: " +
            Calculadora_202421250030.multiplicar(2.5, 2.0, 4.0));


        // Divisão
        System.out.println("\nDIVISÃO:");
        System.out.println("Decimais: " +
            Calculadora_202421250030.dividir(100.0, 2.0, 5.0));


        // Divisão por zero
        System.out.println("\nDIVISÃO POR ZERO:");

        try {
            System.out.println(
                Calculadora_202421250030.dividir(10.0, 0.0)
            );
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}