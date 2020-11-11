package com.example.mysqlapplication;

import com.solt.jdc.filestore.FileStore;
import com.solt.jdc.java.JavaEnvInfo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

	private final EmployeeService employeeService;
	private final JavaEnvInfo javaEnvInfo;
	private final FileStore fileStore;

	public MysqlApplication(EmployeeService employeeService, JavaEnvInfo javaEnvInfo, FileStore fileStore) {
		this.employeeService = employeeService;
		this.javaEnvInfo = javaEnvInfo;
		this.fileStore = fileStore;
	}

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		javaEnvInfo.printJvmEnvInfo();
		fileStore.printFileStoreInfo();
		employeeService.printEmails();
	}
}
