
//Context
public class Duck2 implements FlyStrategy, CuakStrategy, SwimStrategy {

    private FlyStrategy flyStrategy = new FlyCortasDistancias();

    @Override
    public void cuak() {
        System.out.println("Cuak Normal");
    }

    @Override
    public void fly() {
        flyStrategy.fly();
    }

    @Override
    public void swim() {
        System.out.println("Nado Normal");
    }
}
