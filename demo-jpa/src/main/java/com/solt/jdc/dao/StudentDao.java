package com.solt.jdc.dao;

import com.solt.jdc.entities.Student;

import javax.persistence.EntityManager;

public class StudentDao {

    private EntityManager em;

    public StudentDao(EntityManager em){
        this.em = em;
    }

    public void createStudent(Student student){
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    public void updateStudent(int id, String name){
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        student.setName(name);
        em.getTransaction().commit();
    }

    public void deleteStudent(int id){
        em.getTransaction().begin();
        em.remove(em.find(Student.class, id));
        em.getTransaction().commit();
    }

    public Student findStudentById(int id){
        return em.find(Student.class, id);
    }
}
