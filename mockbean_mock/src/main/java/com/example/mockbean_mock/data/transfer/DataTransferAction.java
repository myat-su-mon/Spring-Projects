package com.example.mockbean_mock.data.transfer;

import com.example.mockbean_mock.data.layer.FtpDataLayer;
import com.example.mockbean_mock.data.layer.HttpDataLayer;
import com.example.mockbean_mock.ds.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataTransferAction {

    @Autowired
    public FtpDataLayer ftpDataLayer;

    @Autowired
    public HttpDataLayer httpDataLayer;

    public void transfer(){
        List<Person> personData = ftpDataLayer.getData();
        httpDataLayer.saveData(personData);
    }
}
