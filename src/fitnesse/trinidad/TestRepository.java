/** this class is adapted from the trinidad project (http://fitnesse.info/trinidad) */

package fitnesse.trinidad;

import java.io.IOException;
import java.util.List;

public interface TestRepository {
  public void setUri(String uri) throws IOException;

  public Test getTest(String name) throws IOException;

  public List<Test> getSuite(String name) throws IOException;

  public void prepareResultRepository(TestResultRepository resultRepository)
      throws IOException;
}
