package myjavapackage.service;

import com.github.manosbatsis.scrudbeans.service.AbstractJpaPersistableModelServiceImpl;
import java.lang.String;
import myjavapackage.model.Session;
import myjavapackage.repository.SessionRepository;
import org.springframework.stereotype.Service;

@Service("sessionService")
public class SessionServiceImpl extends AbstractJpaPersistableModelServiceImpl<Session, String, SessionRepository> implements SessionService {
}
