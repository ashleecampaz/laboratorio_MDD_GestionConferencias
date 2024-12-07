package myjavapackage.controller;

import com.github.manosbatsis.scrudbeans.controller.AbstractPersistableModelController;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.lang.String;
import myjavapackage.model.Conference;
import myjavapackage.service.ConferenceService;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("conferenceController")
@Tag(
    name = "Conferences",
    description = "Search or manage Conference entries"
)
@RequestMapping("/api/rest/conferences")
@ExposesResourceFor(Conference.class)
public class ConferenceController extends AbstractPersistableModelController<Conference, String, ConferenceService> {
}
