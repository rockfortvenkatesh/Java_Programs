package Practice;

 class A {
    int x = 10;
    int y = 20;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class B extends A{
    int x = 30;
    int y = 30;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}

public class exted{
    public static void main(String[] args) {
        A a = new B();
        //a.x= 30;
        //a.y = 30;
        System.out.println(a.x+" "+a.y+" "+a.getX()+" "+a.getY());
    }
}
