package krd.legislation.legislation2.services;


import krd.legislation.legislation2.models.Legislation;
import org.springframework.data.domain.Page;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.services
 * @date 8/10/2021
 * @Time 3:29 PM
 */
public interface AdvancedSearchInt {
    Page<Legislation> singleFieldSearch(String language, String keyWord, int pageNumber);

}
