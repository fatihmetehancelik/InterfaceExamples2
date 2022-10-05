class  DatabaseManager{

    public void addDatabase(IDatabase database){
        database.add();
    }
    public void updateDatabase(IDatabase database){
        database.update();
    }
    public void deleteDatabase(IDatabase database){
        database.delete();
    }
    public void getDatabase(IDatabase database){
        database.get();
    }

}


public class Main {
    public static void main(String[] args) {

        DatabaseManager manager = new DatabaseManager();

       // manager.addDatabase(new MongoDatabase());
        manager.getDatabase(new OracleDB());

    }
}

