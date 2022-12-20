package krd.legislation.legislation2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface IDocumentServices {
    public void saveImage(MultipartFile incomingFile, Long documentId) throws Exception;


}
