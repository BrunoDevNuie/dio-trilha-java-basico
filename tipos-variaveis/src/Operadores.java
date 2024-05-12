public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Bruno" + "Vidal";

        System.out.println(nomeCompleto);

        int numero = 5;
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero = +numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);

        int a, b;
        a = 6;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condicoes sao verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condicoes é verdadeira");
        }

        System.out.println("fim");

    }
}
