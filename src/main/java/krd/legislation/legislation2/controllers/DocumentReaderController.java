package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DocumentReaderController {

    @GetMapping("/document_reader")

    public String viewdocument()
    {
      return "document_reader";
    }
}
