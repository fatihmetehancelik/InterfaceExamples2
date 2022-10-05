public class MySqlDatabase implements IDatabase{


    @Override
    public void add() {
        System.out.println("Mysql adding...");
    }

    @Override
    public void delete() {
        System.out.println("mysql deleting...");
    }

    @Override
    public void get() {
        System.out.println("mysql getting...");
    }

    @Override
    public void update() {
        System.out.println("mysql updating...");
    }
}
