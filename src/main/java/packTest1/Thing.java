package packTest1;

public class Thing implements BasicInterface{
    int weight;

    public Thing(int weight) {
        this.weight = weight;
    }

    @Override
    public void what() {
        System.out.println("This is a thing");
    }
}
