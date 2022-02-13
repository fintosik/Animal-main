public class Fox extends Predator{
    public Fox(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void eat() {
        System.out.print("Fox named ");
        super.eat();
    }

    @Override
    public void move() {
        System.out.print("Fox named ");
        super.move();
    }

    @Override
    public void sleep() {
        System.out.print("Fox named ");
        super.sleep();
    }

    @Override
    public void voice() {
        System.out.print("Fox named ");
        super.voice();
    }
}
