class MathHelper {
    public static int NumSeguinte(int numero) {
        return numero + 1;
    }

    public static String JuntNome(String nome, String apelido) {
        return nome + " " + apelido;
    }

    public static int maior(int[] numeros) {
        int numaior = numeros[0];
        for (int num : numeros) {
            if (num > numaior) {
                numaior = num;
            }
        }
        return numaior;
    }

    public static int soma(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = num +num;
        }
        return soma;
    }

    public static double media(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma = num + num;
        }
        return soma / numeros.length; 
    }
}


