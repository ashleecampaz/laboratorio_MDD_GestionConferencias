package myjavapackage.specification;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.EntityPredicateFactory;
import com.github.manosbatsis.scrudbeans.specification.factory.AnyToOnePredicateFactory;
import java.lang.String;
import myjavapackage.model.Conference;

@EntityPredicateFactory(
    entityClass = "myjavapackage.model.Conference"
)
public class AnyToOneConferencePredicateFactory extends AnyToOnePredicateFactory<Conference, String> {
}
