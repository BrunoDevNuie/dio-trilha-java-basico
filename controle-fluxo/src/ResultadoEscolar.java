public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
         * int nota = 10;
         * 
         * if (nota >= 7)
         * System.out.println("Aprovado");
         * 
         * else if (nota >= 5 && nota < 7)
         * System.out.println("Prova de Recuperação");
         * 
         * else
         * System.out.println("Reprovado");
         */

        int nota = 4;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Reecuperação" : "Reprovado";

        System.out.println(resultado);

    }
}
