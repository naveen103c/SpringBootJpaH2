package com.springBoot.Repo;

import org.springframework.data.repository.CrudRepository;
import com.springBoot.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
