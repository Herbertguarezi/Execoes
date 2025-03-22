public class DatabaseConnector {
    public void connect(String stringconexao){
        if(stringconexao == null || stringconexao.isEmpty()){
            throw new DatabaseConnectionException("String de conexão inválida");
        }
        // lógica de conexão com o banco de dados
    }
}
