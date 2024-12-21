//Shape
public abstract class ElaborarPasta {
    // Referencia al Implementador
    IElaborar implementador;

    String nombre;

    // --------------------------

    public IElaborar getImplementador() {
        return this.implementador;
    }

    // --------------------------

    public void setImplementador(IElaborar implementador) {
        this.implementador = implementador;
    }

    // --------------------------

    // Método a implementar por las clases que hereden
    public abstract void obtener();
}
