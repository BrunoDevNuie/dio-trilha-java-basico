public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T":
                System.out.println("5G de Youtube");
            case "M":
                System.out.println("Whatsapp e Instagram Grátis");
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Plano Inexistente");

        }
    }
}
/* ESTUDAR OS CONCEITOS DE CONTINUE BREAK E DEFAULT */