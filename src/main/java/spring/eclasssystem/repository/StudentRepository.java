package spring.eclasssystem.repository;

import spring.eclasssystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query methods
    Optional<Student> findByName(String name);
    List<Student> findByClassName(String className);
    List<Student> findByMale(Boolean isMale);
}