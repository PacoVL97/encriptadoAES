package encriptadoaes;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
 
public class encriptadorAES {
    public static void main(String[] args) {
        try {
            final String claveEncriptacion = "secreto!";            
            String datosOriginales = "Hola este es el mensaje a encriptar :D";            
             
            encriptadoAES encriptador = new encriptadoAES();
             
            String encriptado = encriptador.encriptar(datosOriginales, claveEncriptacion);
            String desencriptado = encriptador.desencriptar(encriptado, claveEncriptacion);
             
            System.out.println("Cadena Original: " + datosOriginales);
            System.out.println("Escriptado     : " + encriptado);
            System.out.println("Desencriptado  : " + desencriptado);            
             
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | 
        		IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(encriptadoAES.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
