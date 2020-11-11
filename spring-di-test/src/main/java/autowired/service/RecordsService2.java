package autowired.service;

import autowired.backup.DbRecordsBackup;
import autowired.bls.DbRecordsProcessor;
import autowired.reader.DbRecordsReader;
import autowired.writer.DbRecordsWriter;
import org.springframework.stereotype.Service;

//@Service
public class RecordsService2 {
    public RecordsService2(DbRecordsReader dbRecordsReader, DbRecordsBackup dbRecordsBackup, DbRecordsProcessor dbRecordsProcessor, DbRecordsWriter dbRecordsWriter){
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + dbRecordsReader + "\n"+
                        getClass().getSimpleName() + " recordsBackup = " + dbRecordsBackup + "\n" +
                        getClass().getSimpleName() + " dbRecordsProcessor = " + dbRecordsProcessor + "\n" +
                        getClass().getSimpleName() + " recordsWriter = " + dbRecordsWriter + "\n"
        );
    }
}
