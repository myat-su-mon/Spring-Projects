package autowired.backup;

import autowired.ds.Record;

import java.util.Collection;

public interface RecordBackup {
    void backupRecords(Collection<Record> records);
}
