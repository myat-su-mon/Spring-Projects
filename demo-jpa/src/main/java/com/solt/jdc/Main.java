package com.solt.jdc;

import com.solt.jdc.dao.StudentDao;
import com.solt.jdc.entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPU");
        EntityManager em = emf.createEntityManager();

        StudentDao obj = new StudentDao(em);
//        obj.createStudent(new Student("Thaw Thaw", 23, "Latha"));
//        obj.createStudent(new Student("Thu Thu", 23, "Lanmadaw"));
//        obj.createStudent(new Student("Tun Tun", 23, "Dagon"));
//        obj.deleteStudent(3);
//        obj.updateStudent(2, "Thu Thu Thaw");

        Student student = obj.findStudentById(2);
        System.out.println("Name: " + student.getName());

        em.close();
        emf.close();
    }
}
