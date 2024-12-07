package myjavapackage.service;

import com.github.manosbatsis.scrudbeans.service.AbstractJpaPersistableModelServiceImpl;
import java.lang.String;
import myjavapackage.model.Lecturer;
import myjavapackage.repository.LecturerRepository;
import org.springframework.stereotype.Service;

@Service("lecturerService")
public class LecturerServiceImpl extends AbstractJpaPersistableModelServiceImpl<Lecturer, String, LecturerRepository> implements LecturerService {
}
