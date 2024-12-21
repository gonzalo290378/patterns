public class Main {

    //StrategyPatternDemo
    public static void main(String[] args) {

        System.out.println("Duck 1");
        Duck1 duck1 = new Duck1();
        duck1.fly();
        duck1.swim();
        duck1.cuak();

        System.out.println("---------------------");

        System.out.println("Duck 2");
        Duck2 duck2 = new Duck2();
        duck2.fly();
        duck2.swim();
        duck2.cuak();
    }
}
