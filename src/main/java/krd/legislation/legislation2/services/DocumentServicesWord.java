package krd.legislation.legislation2.services;


import krd.legislation.legislation2.models.DocumentWord;
import krd.legislation.legislation2.repositories.DocumentWordRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class DocumentServicesWord implements IDocumentServices {
    private DocumentWordRepositories documentRepositories;

    public DocumentServicesWord(DocumentWordRepositories documentRepositories) {
        this.documentRepositories = documentRepositories;
    }

    @Override
    public void saveImage(MultipartFile incomingFile, Long documentId) throws Exception {
        //  String folder = "/photos/";
        DocumentWord documentWord = documentRepositories.getOne(documentId);
        try {

            byte[] buffer = incomingFile.getBytes();
            documentWord.setAddedDate(Timestamp.valueOf(LocalDateTime.now()));
            documentWord.setFileName(incomingFile.getOriginalFilename()  + documentId);
            documentWord.setFileType(incomingFile.getContentType());
            documentWord.setFileSize((int) incomingFile.getSize());
            documentWord.setFile(buffer);
            documentRepositories.save(documentWord);
        } catch (IOException e) {

        }
    }


    public DocumentWord getFile(Long fileName) {
        return documentRepositories.findByFileId(fileName);
    }
}
