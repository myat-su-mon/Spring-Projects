package com.solt.jdc.filestore.network;

import com.solt.jdc.filestore.FileStore;

public class NetworkFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Network FileStore...........");
    }
}
