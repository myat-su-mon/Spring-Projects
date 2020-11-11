package autowired.bls;

import autowired.ds.Record;

import java.util.Collection;

public interface RecordsProcessor {
    Collection<Record> processRecords(Collection<Record> records);
}
