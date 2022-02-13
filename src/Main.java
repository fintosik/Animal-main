public class Main {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit("Rabbo", 5, 10, 10);
        rabbit.move();
        rabbit.sleep();
        rabbit.voice();
        rabbit.eat();
        System.out.println();

        Animal gazelle = new Gazelle("Gaz", 10, 50, 90);
        gazelle.move();
        gazelle.sleep();
        gazelle.voice();
        gazelle.eat();
        System.out.println();

        Animal fox = new Fox("Foxy", 20, 40, 50);
        fox.move();
        fox.sleep();
        fox.voice();
        fox.eat();
        System.out.println();

        Animal wolf = new Wolf("Wolfo", 30, 50, 60);
        wolf.move();
        wolf.sleep();
        wolf.voice();
        wolf.eat();
        System.out.println();

        Animal bear = new Bear("Misha", 40, 100, 70);
        bear.move();
        bear.sleep();
        bear.voice();
        bear.eat();
    }
}
