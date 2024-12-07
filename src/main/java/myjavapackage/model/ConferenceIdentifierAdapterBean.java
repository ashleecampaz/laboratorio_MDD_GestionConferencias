package myjavapackage.model;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.IdentifierAdapterBean;
import com.github.manosbatsis.scrudbeans.api.mdd.model.IdentifierAdapter;
import java.lang.Override;
import java.lang.String;

@IdentifierAdapterBean(
    className = "myjavapackage.model.Conference"
)
public class ConferenceIdentifierAdapterBean implements IdentifierAdapter<Conference, String> {
  @Override
  public String getIdName(final Conference resource) {
    return "id";
  }

  @Override
  public String readId(final Conference resource) {
    return resource.getId();
  }
}
