
//Context
public class Duck1 implements FlyStrategy, CuakStrategy, SwimStrategy {
    @Override
    public void cuak() {
        System.out.println("Cuak Normal");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo Normal");

    }

    @Override
    public void swim() {
        System.out.println("Nado Normal");

    }
}
