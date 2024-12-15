package spring.eclasssystem.repository;
import spring.eclasssystem.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    // Custom query methods
    Optional<Subject> findByName(String name);
    List<Subject> findByCategory(String category);
}