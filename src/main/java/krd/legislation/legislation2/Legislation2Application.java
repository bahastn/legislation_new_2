package krd.legislation.legislation2;

import krd.legislation.legislation2.models.LawTypes;
import krd.legislation.legislation2.repositories.LawTypeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Legislation2Application {
    private LawTypeRepository lawTypeRepository;

    public Legislation2Application(LawTypeRepository lawTypeRepository) {
        this.lawTypeRepository = lawTypeRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(Legislation2Application.class, args);


    }

}
