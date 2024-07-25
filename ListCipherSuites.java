import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ListCipherSuites {
    public static void main(String[] args) throws Exception {
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) factory.createSocket();
        
        System.out.println("Supported Cipher Suites:");
        for (String suite : socket.getSupportedCipherSuites()) {
            System.out.println(suite);
        }
        
        System.out.println("\nEnabled Cipher Suites:");
        for (String suite : socket.getEnabledCipherSuites()) {
            System.out.println(suite);
        }
    }
}
