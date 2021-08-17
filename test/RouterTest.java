import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RouterTest {
    @Test
    void deveRetornarConexoes(){
        Router router = new Router();
        router.routerRegister("127.0.0.1", "4F:33:9E:00:1C", "Vero"
                , "2.43.12.87", "Brasil");
        router.routerRegister("180.132.0.12", "55:3A:D2:21:D5", "Vero"
                , "2.55.15.66", "Brasil");
        router.routerRegister("192.168.2.12", "9A:10:B4:55:0A", "Powerline"
                , "8.8.8.8", "Brasil");
        router.routerRegister("123.11.14.55", "55:3A:D2:21:D5", "Vero"
                , "2.55.15.66", "Brasil");

        String sure = "[IP: 127.0.0.1, MAC:4F:33:9E:00:1C\n" +
                "Vero Brasil\n" +
                "DNS: 2.43.12.87\n" +
                ", IP: 180.132.0.12, MAC:55:3A:D2:21:D5\n" +
                "Vero Brasil\n" +
                "DNS: 2.55.15.66\n" +
                ", IP: 192.168.2.12, MAC:9A:10:B4:55:0A\n" +
                "Powerline Brasil\n" +
                "DNS: 8.8.8.8\n" +
                ", IP: 123.11.14.55, MAC:55:3A:D2:21:D5\n" +
                "Vero Brasil\n" +
                "DNS: 2.55.15.66\n" +
                "]";

        Assertions.assertEquals(sure, router.getAddresses().toString());
    }
}
