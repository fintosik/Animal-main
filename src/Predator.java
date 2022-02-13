public class Predator extends Animal{
    private int weight;
    private int height;

    public Predator(String name, int age, int weight, int height) {
        super(name, age);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats meat");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
