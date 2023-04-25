package krd.legislation.legislation2.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class GenerateJsonFile {

    @Scheduled(cron="0 17 * * * ?")
    public void generateJson(){
        System.out.println("Run on Time ----------");
    }
}
