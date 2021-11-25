package market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer//делает из приложения сервер раздачи конфигураций
@SpringBootApplication
public class MarketServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(MarketServerApplication.class, args);
    }
}