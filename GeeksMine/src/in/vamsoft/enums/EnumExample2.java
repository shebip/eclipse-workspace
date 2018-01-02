package in.vamsoft.enums;
enum TrafficSignal{
  RED("STOP"),GREEN("GO"),ORANGE("SLOW DOWN");
  private String action;
  public String getAction(){
    return this.action;
  }
  private TrafficSignal(String action) {
    this.action=action;
  }
}

public class EnumExample2 {

  public static void main(String[] args) {
    TrafficSignal[] signal=TrafficSignal.values();
    for (TrafficSignal signals:signal) {
      System.out.println("name : " + signals.name() +
          " action: " + signals.getAction() +"Index:" + signals.ordinal());
      
    }
    

  }

}
