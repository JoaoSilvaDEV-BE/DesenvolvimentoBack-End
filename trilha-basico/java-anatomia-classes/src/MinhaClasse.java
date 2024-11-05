public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("Hello, world!");
        String primeiroNome = "João";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Nome " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
