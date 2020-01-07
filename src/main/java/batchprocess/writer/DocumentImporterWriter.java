package batchprocess.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import batchprocess.model.DigitizedDocument;

/**
 * DocumentImporterWriter
 */
public class DocumentImporterWriter implements ItemWriter<DigitizedDocument> {

    @Override
    public void write(List<? extends DigitizedDocument> items) throws Exception {
        for (DigitizedDocument digitizedDocument : items) {
            System.out.println(digitizedDocument.toString());
        }

    }
    
}