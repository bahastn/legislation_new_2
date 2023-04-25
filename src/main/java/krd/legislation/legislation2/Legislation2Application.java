package krd.legislation.legislation2;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class Legislation2Application {

    public static void main(String[] args) {

        SpringApplication.run(Legislation2Application.class, args);
        Gson gson = new Gson();

        try {
            gson.toJson(123.45, new FileWriter("data"));
            System.out.println("Json done !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
