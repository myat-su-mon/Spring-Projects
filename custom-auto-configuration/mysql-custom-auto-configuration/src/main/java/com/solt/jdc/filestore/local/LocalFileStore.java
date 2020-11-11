package com.solt.jdc.filestore.local;

import com.solt.jdc.filestore.FileStore;

public class LocalFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Local File Store..........");
    }
}
