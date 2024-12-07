package myjavapackage.repository;

import com.github.manosbatsis.scrudbeans.repository.ModelRepository;
import java.lang.String;
import myjavapackage.model.Lecturer;
import org.springframework.stereotype.Repository;

@Repository
public interface LecturerRepository extends ModelRepository<Lecturer, String> {
}
