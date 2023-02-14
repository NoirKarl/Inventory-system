
package Excepciones;

public class CodeAlreadyExistsException extends Exception{
    public CodeAlreadyExistsException(String mensaje){
        super(mensaje);
    }
}
