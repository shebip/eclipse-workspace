package in.vamsoft.training.corejava;

public enum SalEnum {
	
  
      MIN_SAL(1),
      MAX_SAL(2);

      private final int value;

      SalEnum(final int newValue) {
          value = newValue;
      }

      public int getValue() { 
      	return value; }
  }