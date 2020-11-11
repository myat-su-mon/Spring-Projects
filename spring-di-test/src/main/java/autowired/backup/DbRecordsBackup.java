package autowired.backup;

import autowired.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DbRecordsBackup implements RecordBackup{
    @Override
    public void backupRecords(Collection<Record> records) {

    }
}
