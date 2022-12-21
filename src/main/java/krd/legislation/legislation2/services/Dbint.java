package krd.legislation.legislation2.services;


import krd.legislation.legislation2.models.LawTypes;
import krd.legislation.legislation2.repositories.LawTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Dbint implements CommandLineRunner {
    @Autowired
   private LawTypeRepository lawTypeRepository;


    @Override
    public void run(String... args) {
//        LawTypes lawTypes = new LawTypes();
//        lawTypes.setLawTypeNumber(1);
//        lawTypes.setLawType("Kurdistan");
//       lawTypeRepository.save(lawTypes);

    }

}
