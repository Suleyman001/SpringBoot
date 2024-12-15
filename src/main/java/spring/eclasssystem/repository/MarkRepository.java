package spring.eclasssystem.repository;

import spring.eclasssystem.entity.Mark;
import spring.eclasssystem.entity.Student;
import spring.eclasssystem.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {
    // Custom query methods
    List<Mark> findByStudent(Student student);
    List<Mark> findBySubject(Subject subject);
    List<Mark> findByMarkDateBetween(LocalDate startDate, LocalDate endDate);
    List<Mark> findByMarkType(String markType);
}