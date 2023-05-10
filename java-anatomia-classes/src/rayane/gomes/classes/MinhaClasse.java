package rayane.gomes.classes;

public class MinhaClasse {
    public static void main (String [] args) { 
        
        String primeiroNome = "Rayane";
        String segundoNome = "Gomes";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.print(nomeCompleto);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
