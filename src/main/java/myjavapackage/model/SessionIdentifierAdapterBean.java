package myjavapackage.model;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.IdentifierAdapterBean;
import com.github.manosbatsis.scrudbeans.api.mdd.model.IdentifierAdapter;
import java.lang.Override;
import java.lang.String;

@IdentifierAdapterBean(
    className = "myjavapackage.model.Session"
)
public class SessionIdentifierAdapterBean implements IdentifierAdapter<Session, String> {
  @Override
  public String getIdName(final Session resource) {
    return "id";
  }

  @Override
  public String readId(final Session resource) {
    return resource.getId();
  }
}
