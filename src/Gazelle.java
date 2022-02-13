public class Gazelle extends Herbivore{
    public Gazelle(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void eat() {
        System.out.print("Gazelle named ");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.print("Gazelle named ");
        super.sleep();
    }

    @Override
    public void move() {
        System.out.print("Gazelle named ");
        super.move();
    }

    @Override
    public void voice() {
        System.out.print("Gazelle named ");
        super.voice();
    }
}
