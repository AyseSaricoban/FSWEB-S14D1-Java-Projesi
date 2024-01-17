package Pool;

public class Cuboid extends Rectangle{

    int height;
    public Cuboid(int width, int length, int height) {
        super(width, length);
        this.height=Math.max(height, 0);

    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return super.getArea() * this.height;
    }
}
