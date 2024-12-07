package myjavapackage.controller;

import com.github.manosbatsis.scrudbeans.controller.AbstractPersistableModelController;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.lang.String;
import myjavapackage.model.Session;
import myjavapackage.service.SessionService;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sessionController")
@Tag(
    name = "Sessions",
    description = "Search or manage Session entries"
)
@RequestMapping("/api/rest/sessions")
@ExposesResourceFor(Session.class)
public class SessionController extends AbstractPersistableModelController<Session, String, SessionService> {
}
