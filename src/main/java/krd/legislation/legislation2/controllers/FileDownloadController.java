package krd.legislation.legislation2.controllers;



import krd.legislation.legislation2.models.DocumentPDF;
import krd.legislation.legislation2.models.DocumentWord;
import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.DocumentPDFRepositories;
import krd.legislation.legislation2.repositories.DocumentWordRepositories;
import krd.legislation.legislation2.repositories.LegislationRepository;
import krd.legislation.legislation2.services.DocumentServices;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.util.Optional;

@RestController
public class FileDownloadController {
    private DocumentServices documentServicesPdf;
    private DocumentPDFRepositories documentPDFRepositories;
    private DocumentWordRepositories documentWordRepositories;
    private LegislationRepository legislationRepository;

    public FileDownloadController(DocumentServices documentServicesPdf, DocumentPDFRepositories documentPDFRepositories, DocumentWordRepositories documentWordRepositories, LegislationRepository legislationRepository) {
        this.documentServicesPdf = documentServicesPdf;
        this.documentPDFRepositories = documentPDFRepositories;
        this.documentWordRepositories = documentWordRepositories;
        this.legislationRepository = legislationRepository;

    }

    @GetMapping("download")
    public void downloadFromDB(@Param("id") Long id, HttpServletResponse response) throws Exception {

        Optional<DocumentPDF> document = documentPDFRepositories.findById(id);
        if (!document.isPresent()) {
            throw new Exception("file not found");

        }
        DocumentPDF pdf = document.get();
        response.setContentType("application/octet-stream");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=" + pdf.getFileName() + ".pdf";
        response.setHeader(headerKey, headerValue);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(pdf.getFile());
        outputStream.close();


    }

    @GetMapping("download-word")
    public void downloadFromWord(@Param("id") Long id, HttpServletResponse response) throws Exception {

        Optional<DocumentWord> document = documentWordRepositories.findById(id);
        if (!document.isPresent()) {
            throw new Exception("file not found");

        }
        DocumentWord word = document.get();
        response.setContentType("application/octet-stream");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=" + word.getFileName() + ".doc";
        response.setHeader(headerKey, headerValue);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(word.getFile());
        outputStream.close();


    }

    @GetMapping("download-protocol")
    public ResponseEntity<Object> downloadProtocols(@Param("id") Long id, HttpServletResponse response) throws Exception {

        Legislation legislation = legislationRepository.findByLawId(id);
        String path = legislation.getProtocols().getPath();
        File file = new File(path);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format(file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        ResponseEntity<Object> responseEntity = ResponseEntity
                .ok().headers(headers).
                contentLength(file.length()).
                contentType(MediaType.parseMediaType("application/PDF")).
                body(resource);

        return responseEntity;
    }


}





