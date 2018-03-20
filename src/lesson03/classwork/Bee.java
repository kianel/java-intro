package lesson03.classwork;

public class Bee extends Insect {
    public Bee(int size,String color)
    {
        super(size,color);
    }

    public void move()
    {
        newFly("Fly");
    }

    private void newFly(String fly_high) {
        System.out.println(fly_high);
    }

//    public void attack(){
//        newFly("Fly");
//        super.attack();
//    }

    public static void main(String[] args) {
        Bee bee = new Bee(12,"yellow");
        bee.attack();
    }
}
