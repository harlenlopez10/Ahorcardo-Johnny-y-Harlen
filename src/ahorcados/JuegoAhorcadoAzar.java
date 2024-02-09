package ahorcados;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author jomel
 */
public class JuegoAhorcadoAzar extends JuegoAhorcadoBase{
    public String[] ideas = {"EXAMEN", "PROGRAMACION","DOS","CALVARIO", "PURGATORIO"};
    
    public JuegoAhorcadoAzar(ArrayList<String> otras){
        int random = new Random().nextInt(1);
        if(random == 0){
            int posicion = new Random().nextInt(4);
            palabraSecreta = ideas[posicion];
        }else{
            int posicion = new Random().nextInt(otras.size());
            palabraSecreta = otras.get(posicion);
        }
        
        palabraActual = inicializarPalabraSecreta();
    }
    public void jugar(){
        Juego juego = new Juego(this);
        juego.setLocationRelativeTo(null);
        juego.setVisible(true);
    }

    public String inicializarPalabraSecreta() {
        String palabra = "";
        for(int ciclo = 0; ciclo < palabraSecreta.length(); ciclo++){
            palabra += "_";
        }
        return palabra;
    }
    
    public void actualizarPalabraActual(char letra){
        String palabra = "";
        for(int ciclo = 0; ciclo < palabraSecreta.length(); ciclo++){
            if(palabraActual.charAt(ciclo) != '_'){
                palabra += String.valueOf(palabraActual.charAt(ciclo));
            }else if(palabraSecreta.charAt(ciclo) == letra){
                palabra += String.valueOf(letra);
            }
            else{
                palabra += "_";
            }
        }
        palabraActual = palabra;
    }
    
    public boolean verificarPalabra(char letra){
        return palabraSecreta.contains(String.valueOf(letra));
    }
    
    public boolean hasGanado(){
        return palabraSecreta.equals(palabraActual);
    }
}
