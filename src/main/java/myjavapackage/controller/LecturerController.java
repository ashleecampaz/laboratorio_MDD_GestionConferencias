package myjavapackage.controller;

import com.github.manosbatsis.scrudbeans.controller.AbstractPersistableModelController;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.lang.String;
import myjavapackage.model.Lecturer;
import myjavapackage.service.LecturerService;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lecturerController")
@Tag(
    name = "Lecturers",
    description = "Search or manage Lecturer entries"
)
@RequestMapping("/api/rest/lecturers")
@ExposesResourceFor(Lecturer.class)
public class LecturerController extends AbstractPersistableModelController<Lecturer, String, LecturerService> {
}
