public class Bear extends Omnivorous{
    public Bear(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void eat() {
        System.out.print("Bear named ");
        super.eat();
    }

    @Override
    public void move() {
        System.out.print("Bear named ");
        super.move();
    }

    @Override
    public void sleep() {
        System.out.print("Bear named ");
        super.sleep();
    }

    @Override
    public void voice() {
        System.out.print("Bear named ");
        super.voice();
    }
}
