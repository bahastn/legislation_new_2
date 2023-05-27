package krd.legislation.legislation2.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import krd.legislation.legislation2.models.LegJson;
import krd.legislation.legislation2.models.Legislation;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GenerateJsonFile {

    @Scheduled(cron = "0 17 * * * ?")
    public void generateJson() {
//        System.out.println("Start time");
//        List<LegJson> list = new ArrayList<>();
//        Gson gson = new Gson();
//        for (int i = 0; i < 100000; i++) {
//            LegJson leg = new LegJson();
//            leg.setLawId(57852L);
//            leg.setLawTitle(" یاسای ژماره\u200C (5)ی ساڵی 2022 یاساى هەمواری پیادەكردنی یاسای چاودێری نەوجەوانان ژمارە (76)ی ساڵی 1983ی هەمواركراو لە هەرێمی كوردستان ـ عێراق القانون رقم (3) لسنة 2022 قانون التعديل الأول لقانون وزارة الكهرباء في إقليم كوردستان ـ العراق رقم (6) لسنة n");
//
//            list.add(leg);
//        }
//        String s = gson.toJson(list);
//        String filePath = "src/main/resources/data.json";
//        try (FileWriter writer = new FileWriter(filePath)) {
//            writer.write(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("finish time");
    }
}
