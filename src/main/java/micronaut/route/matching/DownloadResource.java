package micronaut.route.matching;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/v1/input")
public class DownloadResource {

  @Get(uri = "/{id}.csv")
  @Produces("text/csv")
  public HttpResponse getEntityCsv(String id) {
    String contentDispositionHeader = "attachment; filename=\"input_output_file.csv\"";
    return HttpResponse.ok(id).header("Content-Disposition", contentDispositionHeader);
  }

  @Get(uri = "/{id}")
  @Produces("application/json")
  public SimpleModel getEntity(String id) {
    return new SimpleModel(id);
  }
}
