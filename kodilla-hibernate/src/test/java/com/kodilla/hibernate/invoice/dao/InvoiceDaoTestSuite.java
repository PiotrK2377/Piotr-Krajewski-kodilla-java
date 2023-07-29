package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product table = new Product("table");
        Product door = new Product("door");
        Product chair = new Product("chair");

        Invoice invoice = new Invoice("FV/29/07/2023");
        Item itemTable = new Item(table,new BigDecimal(350),2);
        Item itemDoor = new Item(door, new BigDecimal(90), 4);
        Item itemChair = new Item(chair, new BigDecimal(46), 6);

        itemTable.setInvoice(invoice);
        itemDoor.setInvoice(invoice);
        itemChair.setInvoice(invoice);

        invoice.getItems().add(itemTable);
        invoice.getItems().add(itemDoor);
        invoice.getItems().add(itemChair);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
