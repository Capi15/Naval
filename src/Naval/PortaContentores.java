
package Naval;

/**
 *
 * @author bruno
 */
public class PortaContentores extends Navio{
    
    private int contentores;

    /**
     *
     * @param matricula
     */
    public PortaContentores(String matricula) {
        super(matricula);
    }

    /**
     * Get the value of contentores
     *
     * @return the value of contentores
     */
    public int getContentores() {
        return contentores;
    }

    /**
     * Set the value of contentores
     *
     * @param contentores new value of contentores
     */
    public void setContentores(int contentores) {
        this.contentores = contentores;
    }

}
