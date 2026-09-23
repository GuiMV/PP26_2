public class Usuario_202421250030 {

    public static String teste(String Esp, String Res){
        if (Esp.equals(Res)) return "\u001B[32m  [OK] Esp: "+ Esp + " | Ret: "+ Res + "\u001B[0m";
        return "\u001B[31m  [ERRO]] Esp: "+ Esp + " | Ret: "+ Res + "\u001B[0m";
    }

    public static void main(String[] args) {
        Alvo alvo = new Adapter();
        System.out.println("=== TESTE DA CALCULADORA ===");
 
        // Soma
        System.out.println("\n\tSOMAR:");

        System.out.println("T1.: (10, 20, 30)\n" + teste("60", String.valueOf(alvo.somar(10, 20, 30))));
        System.out.println("T2.: (10.5, 3.5, -2.2)\n" + teste("11.8", String.valueOf(alvo.somar(10.5, 3.5, -2.2))));

        // Subtração
        System.out.println("\n\tSUBTRAIR:");

        System.out.println("T1.: (100, 20, 10)\n" + teste("70", String.valueOf(alvo.subtrair(100, 20, 10))));
        System.out.println("T2.: (100.5, -20.5, 10.0)\n" + teste("111.0", String.valueOf(alvo.subtrair(100.5, -20.5, 10.0))));

        // Multiplicação
        System.out.println("\n\tMULTIPLICAR:");

        System.out.println("T1.: (2, 3, 4)\n" + teste("24", String.valueOf(alvo.multiplicar(2, 3, 4))));
        System.out.println("T2.: (2.0, 3.0, 4.0)\n" + teste("24.0", String.valueOf(alvo.multiplicar(2.0, 3.0, 4.0))));

        // Divisão
        System.out.println("\n\tDIVIDIR:");

        System.out.println("T1.: (100.0, 2.0, 5.0)\n" + teste("10.0", String.valueOf(alvo.dividir(100.0, 2.0, 5.0))));
        System.out.println("T2.: (10.0, 0.0)");
        try {
            System.out.print("\u001B[31m  [ERRO] Esp: Erro: <msg> | Ret: ");
            System.out.println(
                alvo.dividir(10.0, 0.0)
            );
        } catch (ArithmeticException e) {
            System.out.println("\u001B[32m  [OK] Erro: <msg> | Ret: " + e);
        }
    }
}