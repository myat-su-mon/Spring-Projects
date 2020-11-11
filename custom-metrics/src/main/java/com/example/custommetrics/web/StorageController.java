package com.example.custommetrics.web;

import com.example.custommetrics.storage.DbStorageService;
import com.example.custommetrics.storage.FileStorageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StorageController {

    private final FileStorageService fileStorageService;
    private final DbStorageService dbStorageService;

    public StorageController(FileStorageService fileStorageService, DbStorageService dbStorageService) {
        this.fileStorageService = fileStorageService;
        this.dbStorageService = dbStorageService;
    }

    @PutMapping("db/storage")
    public int storeInDb(@RequestBody String content){
        return dbStorageService.store(content);
    }

    @GetMapping("db/storage/{id}")
    public ResponseEntity<String> fetchFromDb(@PathVariable int id){
        return dbStorageService.fetch(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("file/storage")
    public int storeInFile(@RequestBody String content){
        return fileStorageService.store(content);
    }

    @GetMapping("file/storage/{id}")
    public ResponseEntity<String> fetchFromFile(@PathVariable int id){
        return fileStorageService.fetch(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
