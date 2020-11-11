package autowired.reader;

import autowired.ds.Record;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import java.util.Collection;
import java.util.Collections;

@Component
@Priority(2)
public class WebServiceRecordsReader implements RecordsReader{
    @Override
    public Collection<Record> readRecords() {
        return Collections.emptyList();
    }
}
