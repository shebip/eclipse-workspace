package in.vamsoft.training.corejava;

public class InvalidSalaryException extends Exception{
	
	
		
		enum SalLevelErrorCode{
			Max_Level,Min_Level
		}
SalLevelErrorCode errorCode;	
		

public InvalidSalaryException(String message,SalLevelErrorCode errorCode	) {
	
	super(message);
	this.errorCode=errorCode;
}
public 	SalLevelErrorCode getErrorCode() {
return errorCode;
		
	}

}
