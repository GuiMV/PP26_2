public class Adapter extends Calculadora_202321250008  implements Alvo {

    @Override
    public int somar(int... args){
        double[] new_args = new double[args.length];
        for (int i = 0; i < args.length; i++) new_args[i] = args[i];

        return (int) super.somar(new_args);
    }
    @Override
    public double somar(double... args){
        return super.somar(args);
    }

    @Override
    public int subtrair(int... args){
        double aux = args[0];
        for (int i = 1; i < args.length; i++) aux = super.subtrair(aux, args[i]);

        return (int) aux;
    }
    @Override
    public double subtrair(double... args){
        double aux = args[0];
        for (int i = 1; i < args.length; i++) aux = super.subtrair(aux, args[i]);

        return aux;
    }

    @Override
    public int multiplicar(int... args){
        double[] new_args = new double[args.length];
        for (int i = 0; i < args.length; i++) new_args[i] = args[i];

        return (int) super.multiplicar(new_args);
    }
    @Override
    public double multiplicar(double... args){
        return super.multiplicar(args);
    }

    @Override
    public double dividir(double... args){
        double aux = args[0];
        for (int i = 1; i < args.length; i++) aux = super.dividir(aux, args[i]);

        return aux;
    }
}