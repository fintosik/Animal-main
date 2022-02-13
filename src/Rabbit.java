public class Rabbit extends Herbivore{
    public Rabbit(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void eat() {
        System.out.print("Rabbit named ");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.print("Rabbit named ");
        super.sleep();
    }

    @Override
    public void move() {
        System.out.print("Rabbit named ");
        super.move();
    }

    @Override
    public void voice() {
        System.out.print("Rabbit named ");
        super.voice();
    }
}
