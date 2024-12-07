package myjavapackage.repository;

import com.github.manosbatsis.scrudbeans.repository.ModelRepository;
import java.lang.String;
import myjavapackage.model.Session;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends ModelRepository<Session, String> {
}
