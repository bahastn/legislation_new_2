package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class DocumentReaderController {

    @RequestMapping(value = "document_reader", method = RequestMethod.GET)
    public String viewDocument(@RequestParam String fileName, Model model){
        System.out.println(fileName);
        String filePath = "../documents/" + fileName;
        System.out.println(filePath);
        model.addAttribute("path", filePath);
      return "document_reader";
    }
}
