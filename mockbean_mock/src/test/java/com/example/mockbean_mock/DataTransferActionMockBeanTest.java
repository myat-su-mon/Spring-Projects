package com.example.mockbean_mock;

import com.example.mockbean_mock.data.layer.FtpDataLayer;
import com.example.mockbean_mock.data.layer.HttpDataLayer;
import com.example.mockbean_mock.data.transfer.DataTransferAction;
import com.example.mockbean_mock.ds.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataTransferActionMockBeanTest {
    private static final List<Person> PERSON_LIST = List.of(
            new Person(97, "Test1"),
            new Person(98, "Test2")
    );
    @Autowired
    private DataTransferAction dataTransferAction;
    @MockBean
    private FtpDataLayer ftpDataLayer;
    @MockBean
    private HttpDataLayer httpDataLayer;

    @Test
    public void shouldTransferDataFromFtpToHttp(){
        Mockito.when(ftpDataLayer.getData()).thenReturn(PERSON_LIST);
        dataTransferAction.transfer();
        Mockito.verify(httpDataLayer).saveData(PERSON_LIST);
    }
}
