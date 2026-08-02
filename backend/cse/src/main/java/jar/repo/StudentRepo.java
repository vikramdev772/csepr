package jar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import jar.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
