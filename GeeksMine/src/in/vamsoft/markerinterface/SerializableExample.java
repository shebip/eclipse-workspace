package in.vamsoft.markerinterface;

import java.io.Serializable;

public class SerializableExample implements Serializable {

  int id;
  String name;
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  
}
