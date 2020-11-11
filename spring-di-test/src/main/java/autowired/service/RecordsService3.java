package autowired.service;

import autowired.non.beans.RecordsHash;
import autowired.non.beans.RecordsUtil;
import autowired.non.beans.RecordsValidator;
import autowired.reader.DbRecordsReader;
import autowired.writer.DbRecordsWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
public class RecordsService3 {

    //@Autowired
    RecordsService3(DbRecordsReader dbRecordsReader, DbRecordsWriter dbRecordsWriter){
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + dbRecordsReader + "\n" +
                        getClass().getSimpleName() + " recordsWriter = " + dbRecordsWriter + "\n"
        );
    }

    @Autowired
    private RecordsService3(DbRecordsReader recordsReader, DbRecordsWriter recordsWriter, Optional<RecordsUtil> recordsUtil,
                            @Nullable RecordsHash recordsHash, @Autowired(required = false) RecordsValidator recordsValidator){
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                        getClass().getSimpleName() + " recordsWriter = " + recordsWriter + "\n" +
                        getClass().getSimpleName() + " recordsUtil = " + recordsUtil + "\n" +
                        getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n" +
                        getClass().getSimpleName() + " recordsValidator = " + recordsValidator + "\n"
        );
    }
}
