package kdg.be.student.repo;

import kdg.be.student.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School, Integer> {
}
