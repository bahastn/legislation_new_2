package krd.legislation.legislation2.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Dbint implements CommandLineRunner {


    @Override
    public void run(String... args) {
        GenerateJsonFile gson = new GenerateJsonFile();
        gson.generateJson();
    }

}
