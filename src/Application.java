public class Application {
    public static void main(String args[]){
        UserInputValidator userInputValidator = new UserInputValidator();

        try{
            userInputValidator.validadeIdade(5);
        }catch (InvalidUserInputException e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            userInputValidator.validadeEmail("herbertguarezi@gmail.com");
        }catch (InvalidUserInputException e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            userInputValidator.validadeCPF("45788748852");
        }catch (InvalidUserInputException e){
            System.out.println("Exceção capturada: " + e);
        }

        DatabaseConnector databaseConnector = new DatabaseConnector();

        try {
            databaseConnector.connect("");
        }catch (DatabaseConnectionException e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
