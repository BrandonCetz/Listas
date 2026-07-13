public interface Cola<E> extends Iterable<E> {

    void encolar(E elemento);

    E desencolar();

    E consultarCima();

    boolean esVacia();

    int numElementos();

    void limpiar();
}