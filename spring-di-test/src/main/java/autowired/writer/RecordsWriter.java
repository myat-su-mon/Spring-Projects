package autowired.writer;

import autowired.ds.Record;

import java.util.Collection;

public interface RecordsWriter {
    void writeRecords(Collection<Record> records);
}
