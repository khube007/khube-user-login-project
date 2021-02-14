package org.kk.spring.boot.repository;

import org.kk.spring.boot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> , CrudRepository<Student, Long>{

	@Query ("select s from Student s where s.age =?1")
	Student findByAge(int age);
}
