package in.vamsoft.training.watch;

public abstract class Clock implements Ticking {
  public void tick() {
	System.out.println("Clock.tick()");
  }

}
