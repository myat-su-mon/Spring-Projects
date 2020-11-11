package autowired.writer;

import autowired.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DbRecordsWriter implements RecordsWriter{
    @Override
    public void writeRecords(Collection<Record> records) {

    }
}
