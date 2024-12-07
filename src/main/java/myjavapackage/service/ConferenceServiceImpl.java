package myjavapackage.service;

import com.github.manosbatsis.scrudbeans.service.AbstractJpaPersistableModelServiceImpl;
import java.lang.String;
import myjavapackage.model.Conference;
import myjavapackage.repository.ConferenceRepository;
import org.springframework.stereotype.Service;

@Service("conferenceService")
public class ConferenceServiceImpl extends AbstractJpaPersistableModelServiceImpl<Conference, String, ConferenceRepository> implements ConferenceService {
    
    @Override
	public Conference create(Conference resource) {
            String title = resource.getTitle();
            resource.setTitle(title.toUpperCase());
		return super.create(resource);
	}
}
