package autowired.service;

import autowired.backup.DbRecordsBackup;
import autowired.bls.DbRecordsProcessor;
import autowired.non.beans.RecordsHash;
import autowired.non.beans.RecordsUtil;
import autowired.non.beans.RecordsValidator;
import autowired.reader.DbRecordsReader;
import autowired.writer.DbRecordsWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

//@Service
public class RecordsService1 {

    @Autowired
    public DbRecordsReader recordsReader;
    @Autowired
    protected DbRecordsBackup recordsBackup;
    @Autowired
    private DbRecordsProcessor recordsProcessor;
    @Autowired
    DbRecordsWriter recordsWriter;
    @Autowired
    private Optional<RecordsHash> recordsHash;
    @Autowired
    @Nullable
    private RecordsUtil recordsUtil;
    @Autowired(required = false)
    private RecordsValidator recordsValidator;

    public RecordsService1(){
        System.out.println(
                getClass().getSimpleName() + " recordsReader = "+ recordsReader + "\n"+
                        getClass().getSimpleName() + " recordsBackup = "+ recordsBackup + "\n"+
                        getClass().getSimpleName() + " recordsProcessor = "+ recordsProcessor + "\n"+
                        getClass().getSimpleName() + " recordsWriter = "+ recordsWriter + "\n"+
                        getClass().getSimpleName() + " recordsHash = "+ recordsHash + "\n"+
                        getClass().getSimpleName() + " recordsUtil = "+ recordsUtil + "\n"+
                        getClass().getSimpleName() + " recordsValidator = "+ recordsValidator + "\n"
        );
    }

    @PostConstruct
    public void init(){
        System.out.println(
                getClass().getSimpleName() + " recordsReader = "+ recordsReader + "\n"+
                        getClass().getSimpleName() + " recordsBackup = "+ recordsBackup + "\n"+
                        getClass().getSimpleName() + " recordsProcessor = "+ recordsProcessor + "\n"+
                        getClass().getSimpleName() + " recordsWriter = "+ recordsWriter + "\n"+
                        getClass().getSimpleName() + " recordsHash = "+ recordsHash + "\n"+
                        getClass().getSimpleName() + " recordsUtil = "+ recordsUtil + "\n"+
                        getClass().getSimpleName() + " recordsValidator = "+ recordsValidator + "\n");
    }
}
