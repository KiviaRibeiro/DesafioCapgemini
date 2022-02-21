import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SenhaSegura {

    public static boolean senhaValida(String senha) {

        String entradas = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(entradas);

        if(senha.length() < 6) {
            int sum = 6 - senha.length();
            System.out.print("A quantidade de caracteres digitados foi: "+sum+"\n\n");
        }
        Matcher m = p.matcher(senha);
        System.out.println("A senha digitada não atingiu os critérios de segurança. Digite uma senha que contenha: \n" +
                "No mínimo 6 caracteres.\n" +
                "No mínimo 1 digito.\n" +
                "No mínimo 1 letra em minúsculo.\n" +
                "No mínimo 1 letra em maiúsculo.\n" +
                "No mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+  ");
        return m.matches();
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite a senha: ");
        String senha = scanner.next();


        System.out.println(senhaValida(senha));

    }

}
