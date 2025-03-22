public class Application {
    public static void main(String args[]){
        UserInputValidator userInputValidator = new UserInputValidator();

        try{
            userInputValidator.validadeIdade(5);
        }catch (InvalidUserInputException e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        DatabaseConnector databaseConnector = new DatabaseConnector();

        try {
            databaseConnector.connect("");
        }catch (DatabaseConnectionException e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
