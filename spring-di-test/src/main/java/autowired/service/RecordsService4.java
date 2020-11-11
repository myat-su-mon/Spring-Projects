package autowired.service;

import autowired.non.beans.RecordsValidator;
import autowired.reader.DbRecordsReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

//@Service
public class RecordsService4 {

    @Autowired
    public void setRecordsReader(DbRecordsReader recordsReader){
        System.out.println(
                getClass().getSimpleName() + " setRecordsReader = " + recordsReader
        );
    }

    @Autowired
    public void setRecordsReaderAndRecordsValidator(DbRecordsReader recordsReader,@Nullable RecordsValidator recordsValidator){
        System.out.println(
                getClass().getSimpleName() + "setRecordsReaderAndRecordsValidator = \n" +
                        "\t recordsReader = " + recordsReader + "\n" +
                        "\t recordsValidator = " + recordsValidator + "\n"
        );
    }

}
