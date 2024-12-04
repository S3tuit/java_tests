package packTest1;

public class GenClass <Thing>{

    Thing x;

    GenClass(Thing x){
        this.x = x;
    }

    public Thing getX() {
        return x;
    }
}
