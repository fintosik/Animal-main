public class Wolf extends Predator{
    public Wolf(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void eat() {
        System.out.print("Wolf named ");
        super.eat();
    }

    @Override
    public void move() {
        System.out.print("Wolf named ");
        super.move();
    }

    @Override
    public void sleep() {
        System.out.print("Wolf named ");
        super.sleep();
    }

    @Override
    public void voice() {
        System.out.print("Wolf named ");
        super.voice();
    }
}
