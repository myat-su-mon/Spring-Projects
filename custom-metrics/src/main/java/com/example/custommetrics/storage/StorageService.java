package com.example.custommetrics.storage;

import java.util.Optional;

public interface StorageService {
    int store(String content);
    Optional<String> fetch(int id);
}
