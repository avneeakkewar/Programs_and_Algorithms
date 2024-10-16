abstract class AbstractClass {
    abstract void print();

    public void display() {
        System.out.println("This is display mode");
    }

}

 class abstractDemo extends AbstractClass{
    void print(){
        System.out.println("This is print mode");  // must override or else you'll get an error
    }

    public static void main(String[] args) {
        abstractDemo obj = new abstractDemo();
        obj.display();
        obj.print();

    }

 }

