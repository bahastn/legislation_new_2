package krd.legislation.legislation2.services;



import krd.legislation.legislation2.models.DocumentPDF;
import krd.legislation.legislation2.repositories.DocumentPDFRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class DocumentServices implements IDocumentServices {
    private DocumentPDFRepositories documentPDFRepositories;

    public DocumentServices(DocumentPDFRepositories documentPDFRepositories) {
        this.documentPDFRepositories = documentPDFRepositories;
    }

    @Override
    public void saveImage(MultipartFile incomingFile, Long documentId) throws Exception {
        //  String folder = "/photos/";
        DocumentPDF documentPDF = documentPDFRepositories.getOne(documentId);
        try {
            byte[] buffer = incomingFile.getBytes();
            documentPDF.setAddedDate(Timestamp.valueOf(LocalDateTime.now()));

            //file name in the database
            documentPDF.setFileName(incomingFile.getOriginalFilename()  + documentId);
            documentPDF.setFileSize((int) incomingFile.getSize());



            documentPDF.setFileType(incomingFile.getContentType());
            documentPDF.setFile(buffer);
            documentPDFRepositories.save(documentPDF);
        } catch (IOException e) {

        }
    }

    public DocumentPDF getFile(Long fileName) {
        return documentPDFRepositories.findByFileId(fileName);
    }
}
