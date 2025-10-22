public class VariaveisTipos {
    public static void main(String[] args) throws Exception {
        String meuNome = "Antônio";
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(meuNome);

        System.out.println(numeroCurto2);

        int numero = 5;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
