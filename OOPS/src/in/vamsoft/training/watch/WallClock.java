package in.vamsoft.training.watch;

public class WallClock extends Clock {
  public void minuteElapsed() {
	System.out.println("WallClock.minuteElapsed()");
  }

  public void hourElapsed() {
	System.out.println("WallClock.hourElapsed()");
  }

}
