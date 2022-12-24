package krd.legislation.legislation2.repositories;




import krd.legislation.legislation2.models.Legislation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LegislationRepository extends JpaRepository<Legislation, Long> {
//    /**
//     * @param lawType the parm accept string law type and return a list of Legislation
//     */
//    @Query("SELECT l FROM Legislation l WHERE l.approved = 1 AND  (l.lawType =?1 or l.lawType2 =?1)  AND l.language = ?2")
//    Page<Legislation> findLawByLawType(String lawType, String language, Pageable pageable);
//
//
//    /**
//     * @param lawCategory the parm accept string law Range  and return a list of Legislation
//     * @param pageable
//     * @return
//     */
    @Query("SELECT l FROM Legislation l WHERE l.approved = 1 AND  l.lawCategory =?1 AND l.language = ?2")
    Page<Legislation> findLawByLawRange(String lawCategory, String language, Pageable pageable);
//
//    Legislation findByLawId(Long lawId);
//    Legislation findByLawTitle(String lawTitle);
//
//
////    @Query("SELECT l.issueDate FROM Legislation l WHERE l.approved = 1 AND l.classification = ?1 GROUP BY  l.issueDate order by l.issueDate DESC ")
////    List<Integer> findByYear(String classification);
//
//
//    @Query("SELECT l FROM Legislation l where l.approved = 1  AND l.lawCategory ='2' AND  l.classification = ?1 and l.issueDate=?2 and l.language = ?3 order by l.issueDate DESC ")
//    List<Legislation> findBySelectedYearLaws(String classification, Integer year, String language);
//
//    @Query("SELECT l FROM Legislation l where l.approved = 1  AND l.lawCategory ='3' AND  l.classification = ?1 and l.issueDate=?2 and l.language = ?3 order by l.issueDate DESC ")
//    List<Legislation> findBySelectedYearOrders(String classification, Integer year, String language);
//
//    @Query("SELECT l FROM Legislation l where l.approved = 1 AND  l.classification = ?1 and l.language = ?2 and  l.issueDate between ?3 and ?4 ")
//    List<Legislation> findFederalLawBySelectedYear(String classification, String language, Integer yearStart, Integer yearEnd);
//
//
    @Query("SELECT l FROM Legislation l where  l.approved = 1 AND l.classification = ?1 and l.language = ?2 and  l.active = ?3 ")
    List<Legislation> findTerminatedLaw(String classification, String language, String active);
//
//    /**
//     * advanced search
//     *
//     * @param keyword
//     * @return
//     */
//    //advanced search native query with fulltext search
//
//
////    @Query(value = "SELECT * from public.legsilation WHERE to_tsvector(law_title)@@ to_tsquery(?1) and issue_date=?2 and law_number= ?3 and law_category =?4 and \n" +
////            "classification =?5 and active =?6 ", nativeQuery = true )
////    List<Legislation> findByLawTitleIsContaining(String keyword, Integer year, Integer lawNumber, String category, String classification
////    , String active);
////
////    @Query(value = "SELECT * from public.legsilation WHERE to_tsvector(aw_title) @@  to_tsquery(?1) and law_number= ?2 and law_category =?3 and \n" +
////            "classification =?4 and active =?5 ", nativeQuery = true )
////    List<Legislation> findByLawTitleIsContainingNoYear(String keyword,  Integer lawNumber, String category, String classification
////            , String active);
////
////    @Query(value = "SELECT * from public.legsilation WHERE to_tsvector(law_title) @@  to_tsquery(?1) and law_category =?2 and classification =?3 and active =?4 ", nativeQuery = true )
////    List<Legislation> findByLawTitleIsContainingNoYearNoLawNumber(String keyword,  String category, String classification
////            , String active);
////
////    @Query(value = "SELECT * from public.legsilation WHERE to_tsvector(law_title) @@ to_tsquery(?1) and issue_date=?2 and law_category =?3 and \n" +
////            "classification =?4 and active =?5 ", nativeQuery = true )
////    List<Legislation> findByLawTitleIsContainingNoLawNumber(String keyword, Integer year, String category, String classification
////            , String active);
////
//
//    /**
//     * this is edit legislation part
//     *
//     * @param year
//     * @param lawNumber
//     * @param language
//     * @return
//     */
//    @Query("select l from Legislation l where l.approved = 1 AND l.issueDate = ?1 AND l.lawNumber = ?2 AND l.language = ?3 AND l.lawCategory = ?4 ")
//    List<Legislation> searchForEditAllParameters(Integer year, Integer lawNumber, String language,String range);
//
//    @Query("select l from Legislation l where l.approved = 1 AND l.issueDate = ?1 AND l.lawNumber = ?2 AND l.language = ?3 ")
//    List<Legislation> searchForEditAllParam(Integer year, Integer lawNumber, String language);
//
//    /**
//     * @param year
//     * @param lawNumber
//     * @return
//     */
//    @Query("select leg from Legislation leg where leg.approved = 1 AND leg.issueDate = ?1 AND leg.lawNumber = ?2 ")
//    List<Legislation> searchForEditYearAndLawNumber(Integer year, Integer lawNumber);
//
//    /**
//     * @param year
//     * @return
//     */
//
//    @Query("select leg from Legislation leg where leg.approved = 1 AND leg.issueDate = ?1")
//    List<Legislation> searchForEditYear(Integer year);
//
//    @Query("select leg from Legislation leg where leg.approved = 1 AND leg.lawNumber = ?1  ")
//    List<Legislation> searchForEditLawNumber(Integer lawNumber);
//
////    @Query("select leg from Legislation leg where leg.issueDate = ?1 AND leg.lawNumber = ?2 AND leg.language =?3  ")
////   List<Legislation> findLawByYearAndLawNumber(Integer year, Integer orgLawNumber, Integer language);
//
//
//
//
////Approval filter section
//
//    @Query("SELECT l FROM Legislation l where l.approved = 0")
//    List<Legislation> approvalSearch();
//
//    @Query("SELECT l FROM Legislation l where l.addedBy =?1 and l.approved = -1")
//    List<Legislation> rejectedListOfLaws(User user);
//
////    @Query("SELECT l FROM Legislation l WHERE l.approved = 1 AND l.issueDate = ?1 AND  l.language = ?2")
////    Page<Legislation> findByYear( Integer year, String language, Pageable pageable);
//
//    @Query("SELECT l.lawId, l.lawTitle, l.wordDocument, l.pdfDocument FROM Legislation l")
//    List<Legislation> allData();
//
//

@Query(nativeQuery = true, value = "Select * from legsilation where search @@websearch_to_tsquery('english',?1);")
    List<Legislation> fullTextSearch(String keyword);

    /**
     *
     * @param language
     * @param lawCategory
     * @return law categorys number and project in About Us view
     */
    @Query("SELECT count(l) FROM Legislation l where  l.approved = 1  and l.language = ?1 AND l.lawCategory = ?2 ")
    Integer getTotalLawByCategory(String language, String lawCategory);
}


