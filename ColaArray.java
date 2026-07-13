import java.util.Iterator;
import java.util.NoSuchElementException;

public class ColaArray<E> implements Cola<E>{
    private final Lista<E> elementos;
    public ColaArray(){
        elementos = new ArrayList<E>();
    } 
    @Override
    public void encolar(E elemento){
        elementos.agregarInicio(elemento);
    }
    @Override
    public E desencolar(){
        if(!elementos.esVacia()){
            return elementos.eliminarElementoFinal();
        }else{
            throw new NoSuchElementException("No hay elementos en la cola");
        }
    }
    @Override
    public E consultarFrente(){
        return elementos.consultar(elementos.numElementos()-1);
    }
    @Override
    public boolean esVacia(){
        return elementos.esVacia();
    }
    @Override
    public int numElementos(){
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
