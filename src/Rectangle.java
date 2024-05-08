public class Rectangle {
    private int a;
    private int b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void getArea(int b, int a){
        System.out.println("Area rectangle equals: "+b*a);
    }
}
