package myjavapackage.repository;

import com.github.manosbatsis.scrudbeans.repository.ModelRepository;
import java.lang.String;
import myjavapackage.model.Conference;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends ModelRepository<Conference, String> {
}
