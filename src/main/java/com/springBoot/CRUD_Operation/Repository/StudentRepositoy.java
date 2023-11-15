package com.springBoot.CRUD_Operation.Repository;

import com.springBoot.CRUD_Operation.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoy extends JpaRepository<Student,Integer> {
}
