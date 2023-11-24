package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.models.ProtocolBooks;
import krd.legislation.legislation2.repositories.ProtocolsRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ProtocolBookDownloadController {
    private ProtocolsRepository protocolsRepository;

    public ProtocolBookDownloadController(ProtocolsRepository protocolsRepository) {
        this.protocolsRepository = protocolsRepository;
    }

    @GetMapping("/download-protocol-book")
    public void viewPdf(@Param("id") Long id, HttpServletResponse response) throws IOException {
        ProtocolBooks protocolBooks = protocolsRepository.getProtocol(id);
        String path = protocolBooks.getPath();


//        String pdfFilePath = "/path/to/your/file.pdf"; // Change this to the actual path of your PDF file
        Path pdfPath = Paths.get(path);
        if (Files.exists(pdfPath)) {
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "inline; filename=file.pdf");
            Files.copy(pdfPath, response.getOutputStream());
        }
    }
}
