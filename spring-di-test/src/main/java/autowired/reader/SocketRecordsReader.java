package autowired.reader;

import autowired.ds.Record;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
@Order(1)
public class SocketRecordsReader implements RecordsReader{
    @Override
    public Collection<Record> readRecords() {
        return Collections.emptyList();
    }
}
