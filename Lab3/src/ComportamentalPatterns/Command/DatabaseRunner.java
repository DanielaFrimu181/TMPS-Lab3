package ComportamentalPatterns.Command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Repository repository = new Repository(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );
        repository.insertRecord();
        repository.deleteRecord();
        repository.selectRecord();
        repository.updateRecord();
    }
}
