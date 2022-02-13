public class Animal implements Eat{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public void move() {
        System.out.println(name + " moves");
    }

    public void voice() {
        System.out.println(name + " talks");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
