package autowired.reader;

import autowired.ds.Record;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class FileRecordsReader implements RecordsReader, Ordered {
    @Override
    public Collection<Record> readRecords() {
        return Collections.emptyList();
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
