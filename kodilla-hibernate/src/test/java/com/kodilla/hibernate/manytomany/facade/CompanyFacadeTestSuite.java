package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Test
    void testFindCompaniesNameByFragment() {
        //Given
        Company cis = new Company("Cisco Systems");
        companyDao.save(cis);

        //When
        int sizeFragment = companyFacade.getCompaniesByFragmentName("yste").size();

        //Then
        assertEquals(1,sizeFragment);


        //CleanUp
        companyDao.deleteById(cis.getId());

    }
}