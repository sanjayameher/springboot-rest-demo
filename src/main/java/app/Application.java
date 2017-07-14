package app;

/**
 * Created by kalyani.cherukuri on 6/13/2017.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Object[] { Application.class }, args);
    }
}