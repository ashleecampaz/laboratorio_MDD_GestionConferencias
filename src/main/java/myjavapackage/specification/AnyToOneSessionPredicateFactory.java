package myjavapackage.specification;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.EntityPredicateFactory;
import com.github.manosbatsis.scrudbeans.specification.factory.AnyToOnePredicateFactory;
import java.lang.String;
import myjavapackage.model.Session;

@EntityPredicateFactory(
    entityClass = "myjavapackage.model.Session"
)
public class AnyToOneSessionPredicateFactory extends AnyToOnePredicateFactory<Session, String> {
}
