package com.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.model.Customer;
import com.model.TransactionHistory;
import com.repo.CustomerRepo;
import com.repo.TransactionHistoryRepo;

@Service
public class AdminReportsImpl implements AdminReportsService{

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	TransactionHistoryRepo transactionHistoryRepo;
	

	@Override
	public ByteArrayInputStream generateTransactionReport() {
		// TODO Auto-generated method stub
		List<TransactionHistory> transactions = transactionHistoryRepo.findAll();
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();

        PdfWriter writer = new PdfWriter(out);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        document.add(new Paragraph("Transaction Report").setBold().setFontSize(18));

        float[] columnWidths = {2, 1, 2, 2, 2};
        Table table = new Table(columnWidths);

        table.addHeaderCell(new Cell().add(new Paragraph("Date")));
        table.addHeaderCell(new Cell().add(new Paragraph("Amount")));
        table.addHeaderCell(new Cell().add(new Paragraph("Recipient")));
        table.addHeaderCell(new Cell().add(new Paragraph("Transaction Type")));
        table.addHeaderCell(new Cell().add(new Paragraph("upi id")));

        for (TransactionHistory t : transactions) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            table.addCell(new Paragraph(t.getLocalDateTime().format(formatter)));
            table.addCell(new Paragraph(String.valueOf(t.getAmount())));
            table.addCell(new Paragraph(t.getName() != null ? t.getName() : ""));
            table.addCell(new Paragraph(t.getTransaction_type() != null ? t.getTransaction_type() : " "));
            table.addCell(new Paragraph(t.getUpiId() != null ? t.getUpiId() : ""));
        }

        document.add(table);
        document.close();

        return new ByteArrayInputStream(out.toByteArray());
	}


	@Override
	public ByteArrayInputStream generateCustomerReport() {
		// TODO Auto-generated method stub
		List<Customer> customers = customerRepo.findAll();
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();

        PdfWriter writer = new PdfWriter(out);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        document.add(new Paragraph("Customers Report").setBold().setFontSize(18));

        float[] columnWidths = {2, 1, 2, 2, 2}; 
        Table table = new Table(columnWidths);

        table.addHeaderCell(new Cell().add(new Paragraph("AccountNumber")));
        table.addHeaderCell(new Cell().add(new Paragraph("First Name")));
        table.addHeaderCell(new Cell().add(new Paragraph("Last Name")));
        table.addHeaderCell(new Cell().add(new Paragraph("Email")));
        table.addHeaderCell(new Cell().add(new Paragraph("Address")));
        table.addHeaderCell(new Cell().add(new Paragraph("Contact No")));

        for (Customer c : customers) {
            table.addCell(new Paragraph(String.valueOf(c.getAccountNumber())));
            table.addCell(new Paragraph(c.getCustomerAccountDetails().getFirstname() != null ?  c.getCustomerAccountDetails().getFirstname() : " "));
            table.addCell(new Paragraph(c.getCustomerAccountDetails().getLastname() != null ? c.getCustomerAccountDetails().getLastname() : " "));
            table.addCell(new Paragraph(c.getCustomerAccountDetails().getAddress() != null ? c.getCustomerAccountDetails().getAddress() :" "));
            table.addCell(new Paragraph(String.valueOf(c.getCustomerAccountDetails().getContactNo())));
        }

        document.add(table);
        document.close();

        return new ByteArrayInputStream(out.toByteArray());
	}
	

}
