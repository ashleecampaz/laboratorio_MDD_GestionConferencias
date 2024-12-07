package myjavapackage.model;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.IdentifierAdapterBean;
import com.github.manosbatsis.scrudbeans.api.mdd.model.IdentifierAdapter;
import java.lang.Override;
import java.lang.String;

@IdentifierAdapterBean(
    className = "myjavapackage.model.Lecturer"
)
public class LecturerIdentifierAdapterBean implements IdentifierAdapter<Lecturer, String> {
  @Override
  public String getIdName(final Lecturer resource) {
    return "id";
  }

  @Override
  public String readId(final Lecturer resource) {
    return resource.getId();
  }
}
