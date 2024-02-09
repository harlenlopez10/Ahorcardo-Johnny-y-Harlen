
package ahorcados;

/**
 *
 * @author jomel
 */
public abstract class JuegoAhorcadoBase implements JuegoAhorcado{
        protected String palabraSecreta;
        protected String palabraActual;
        protected int intentos = 10;
        
        public abstract void actualizarPalabraActual(char letra);
        public abstract boolean verificarPalabra(char letra);
        public abstract boolean hasGanado();
}
