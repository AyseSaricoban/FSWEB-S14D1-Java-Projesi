package Pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int setWidth(int width) {
        if(width<0){
            width=0;
        }else{
            this.width =width;
        }
        return width;
    }

    public int setLength(int length) {
        if(length<0){
            length=0;
        }else{
            this.length=length;
        }
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getArea() {
        return this.width * this.length;
    }
}
