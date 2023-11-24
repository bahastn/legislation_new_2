package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.models.ProtocolBooks;
import krd.legislation.legislation2.services.ProtocolBooksServices;
import org.springframework.context.i18n.LocaleContextHolder;

import org.springframework.data.domain.Page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProtocolBooksController {

    private ProtocolBooksServices protocolBooksServices;


    public ProtocolBooksController(ProtocolBooksServices protocolBooksServices) {
        this.protocolBooksServices = protocolBooksServices;

    }
    @RequestMapping(value = "/protocols", method = RequestMethod.GET)
    public String getNormalLaw(@RequestParam int pageNumber, Model model) {
        String lang = LocaleContextHolder.getLocale().getLanguage();
        if (lang.equals("ku")) {
            Page<ProtocolBooks> list = protocolBooksServices.getProtocolBooks(pageNumber - 1);
            model.addAttribute("protocolBooksList", list);
        }
        return "protocols";
    }

}
