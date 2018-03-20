package lesson03.classwork.composition;

public class Bee extends Insect implements Attack {
    private Attack attack;

    public Bee(int size, String color, Attack attack) {
        super(size,color);
        this.attack = attack;
    }


    public void move() {
       attack.move();
    }


    public void attack() {
    attack.attack();
    }

    public static void main(String[] args) {
        Bee bee = new Bee(1,"yellow",new AttackImpl("fly","save"));
        bee.move();
        bee.attack();
    }
}
