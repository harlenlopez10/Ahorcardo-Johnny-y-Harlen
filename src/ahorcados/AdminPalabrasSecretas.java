package ahorcados;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author jomel
 */
public class AdminPalabrasSecretas {
    ArrayList<String> fijos = new ArrayList();
    public ArrayList<String> azar = new ArrayList();
    
    public void agregarFijo(String palabra){
        fijos.add(palabra.toUpperCase());
    }
    
    public String azarFijo(){
        int posicion = new Random().nextInt(fijos.size());
        return fijos.get(posicion);
    }
    
    public void agregarAzar(String palabra){
        azar.add(palabra.toUpperCase());
    }
    
    public String azarAzar(){
        int posicion = new Random().nextInt(azar.size());
        return azar.get(posicion);
    }
}
