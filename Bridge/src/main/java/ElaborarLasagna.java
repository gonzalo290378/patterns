//Circle
public class ElaborarLasagna extends ElaborarPasta {
    public ElaborarLasagna(IElaborar implementador) {
        this.setImplementador(implementador);
    }

    // ------------------------

    @Override
    public void obtener() {
        System.out.println("Preparando lasagna...");

        this.getImplementador().procesar();
    }
}
