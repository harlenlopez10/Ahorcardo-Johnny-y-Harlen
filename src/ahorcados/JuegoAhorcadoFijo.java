
package ahorcados;

/**
 *
 * @author jomel
 */
public class JuegoAhorcadoFijo extends JuegoAhorcadoBase{
    public JuegoAhorcadoFijo(String secreto){
        palabraSecreta = secreto;
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
