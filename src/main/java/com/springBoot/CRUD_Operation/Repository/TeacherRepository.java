package com.springBoot.CRUD_Operation.Repository;

import com.springBoot.CRUD_Operation.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

}
