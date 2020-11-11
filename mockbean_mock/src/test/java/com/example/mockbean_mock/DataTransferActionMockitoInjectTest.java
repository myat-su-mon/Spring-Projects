package com.example.mockbean_mock;

import com.example.mockbean_mock.data.layer.FtpDataLayer;
import com.example.mockbean_mock.data.layer.HttpDataLayer;
import com.example.mockbean_mock.data.transfer.DataTransferAction;
import com.example.mockbean_mock.ds.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class DataTransferActionMockitoInjectTest {

    private static final List<Person> PERSON_LIST = List.of(
            new Person(97, "Test1"),
            new Person(98, "Test2")
    );

    @InjectMocks
    private DataTransferAction dataTransferAction;
    @Mock
    private FtpDataLayer ftpDataLayer;
    @Mock
    private HttpDataLayer httpDataLayer;

    @Test
    public void shouldTransferDataFromFtpToHttp(){
        Mockito.when(ftpDataLayer.getData()).thenReturn(PERSON_LIST);
        dataTransferAction.transfer();
        Mockito.verify(httpDataLayer).saveData(PERSON_LIST);
    }
}
