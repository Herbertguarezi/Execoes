import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidator {
    public void validadeIdade(int idade) throws InvalidUserInputException{
        if (idade < 18 || idade > 120){
            throw new InvalidUserInputException("Idade inválida: " + idade);
        }
    }
    public void validadeEmail(String email) throws InvalidUserInputException{
        Pattern pattern = Pattern.compile("[\\w-.]+@[\\w-]+\\.[\\w.-]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Email válido");
        } else {
            throw new InvalidUserInputException("Email inválido: " + email);
        }
    }
    public void validadeCPF(String cpf) throws InvalidUserInputException{
        Pattern pattern = Pattern.compile("(?:\\d{3}[-.]?){3}\\d{2}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cpf);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("CPF válido");
        } else {
            throw new InvalidUserInputException("CPF inválido: " + cpf);
        }
    }
}
