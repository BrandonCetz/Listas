import java.util.Iterator;
import java.util.NoSuchElementException;

public class ColaArray<E> implements Cola<E>{
    private final Lista<E> elementos;
    public ColaArray(){
        elementos = new ArrayList<E>();
    } 

    public void encolar(E elemento){
        elementos.agregarInicio(elemento);
    }

    public E desencolar(){
        if(!elementos.esVacia()){
            return elementos.eliminarElementoFinal();
        }else{
            throw new NoSuchElementException("No hay elementos en la cola");
        }
    }

    public E consultarFrente(){
        return elementos.consultar(elementos.numElementos()-1);
    }

    public boolean esVacia(){
        return elementos.esVacia();
    }

    public int numElementos(){
        return elementos.numElementos();
    }

    public void limpiar(){
        elementos.limpiarLista();
    }
    @Override
    public Iterator<E> iterator() {
        return elementos.iterator();
    }
}
