package Exercicio;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Byte -> Min: " + Byte.MIN_VALUE + " | Max: " + Byte.MAX_VALUE);
        System.out.println("Short  -> Min: " + Short.MIN_VALUE + " | Max: " + Short.MAX_VALUE);
        System.out.println("Integer -> Min: " + Integer.MIN_VALUE + " | Max: " + Integer.MAX_VALUE);

        System.out.println("--- Somando 1 ao valor máximo ---");

        byte b = Byte.MAX_VALUE;
        System.out.println("Byte + 1: " + (byte) (b + 1));
        // Ocorre overflow: volta para o menor valor (-128)

        short s = Short.MAX_VALUE;
        System.out.println("Short + 1: " + (short) (s + 1));
        // Ocorre overflow: volta para o menor valor ( -32.768)

        Integer i = Integer.MAX_VALUE;
        System.out.println("Integer + 1: " + (int) (i + 1));
        // Ocorre overflow: volta para o menor valor (-2.147.483.648

        long l = Long.MAX_VALUE;
        System.out.println("Long + 1: " + (long) (l + 1));
        // Ocorre overflow: volta para o menor valor (-9223372036854775808)

        // Conversão explícita
        long numero = 300;
        byte convertido = (byte) numero;

        System.out.println("Long 300 convertido para byte: " + convertido);
        // O byte vai de -128 a 127.
        // 300 excede esse limite.
        // O valor real armazenado é 300 % 256 = 44
        // Porque byte tem 8 bits.
        // Portanto, o resultado final é 44.

    }

}
