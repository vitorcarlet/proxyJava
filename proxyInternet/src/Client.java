import impl.ProxyInternet;
import service.Internet;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("example.com"); // Permitido
            internet.connectTo("tiktok.com"); // Bloqueado
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        internet.connectTo("example.com"); // Permitido
        internet.connectTo("tiktok.com"); // Bloqueado
    }
}