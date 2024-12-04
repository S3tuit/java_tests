package packTest2;
import packTest1.Thing;

public class GlassOfWater extends Thing {

    private String color;
    private boolean isStill;
    private boolean isEmpty;

    Thing thing = new Thing(7);

    public GlassOfWater(String color, boolean isStill, boolean isEmpty) {
        super(6);

        this.color = color;
        this.isStill = isStill;
        this.isEmpty = isEmpty;
    }

    @Override
    public void what() {
        System.out.println("This is a glass of water");
    }
}
