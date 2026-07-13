import java.util.Iterator;
import java.util.NoSuchElementException;

public class PilaLinked<E> implements Pila<E> {
    private final Lista<E> elementos;

    public PilaLinked(){
        elementos = new LinkedList<E>();
    }
    @Override
    public void apilar(E elemento){
        elementos.agregarFinal(elemento);
    }
    @Override
    public E desapilar(){
        if(!this.esVacia()){
            return elementos.eliminarElementoFinal();
        }else{
            throw new NoSuchElementException(
                "La pila esta vacia :(((");
        }
    }
    @Override
    public E consultarCima(){
        if(!this.esVacia()){
            return elementos.consultar(elementos.numElementos()-1);
        }else{
            throw new NoSuchElementException(
                "La pila esta vacia :(((");
        }
    }
    @Override
    public boolean esVacia(){
        return elementos.esVacia();
    }
    @Override
    public int numElementos(){
        if (!this.esVacia()) {
            throw new NoSuchElementException("No hay elementos");
        }
        return elementos.numElementos();
    }
    @Override
    public void limpiar(){
        elementos.limpiarLista();
    }
    @Override
    public Iterator<E> iterator() {
        return elementos.iterator();
    }
    
}
