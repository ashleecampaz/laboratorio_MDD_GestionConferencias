package myjavapackage.specification;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.EntityPredicateFactory;
import com.github.manosbatsis.scrudbeans.specification.factory.AnyToOnePredicateFactory;
import java.lang.String;
import myjavapackage.model.Lecturer;

@EntityPredicateFactory(
    entityClass = "myjavapackage.model.Lecturer"
)
public class AnyToOneLecturerPredicateFactory extends AnyToOnePredicateFactory<Lecturer, String> {
}
