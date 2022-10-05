public class MongoDatabase implements IDatabase{


    @Override
    public void add() {
        System.out.println("MongoDB adding..");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB deleting..");
    }

    @Override
    public void get() {
        System.out.println("MongoDB getting..");
    }

    @Override
    public void update() {
        System.out.println("MongoDB updating..");

    }
}
