package micronaut.route.matching;

public class SimpleModel {

  private String id;

  public SimpleModel(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
