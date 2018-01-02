package in.vamsoft.jdk8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFnInterfaces {
	public static void main(String[] args) {
		Predicate<Integer> evenOrOdd =(x)-> x%2==0 ?true:false;
		System.out.println("is 10 odd or even"+(evenOrOdd.test(10)?"10 is even":"10 is odd"));
		
		Consumer<String> upperDisplay=str->System.out.println(str.toUpperCase());
		upperDisplay.accept("Hello Lambda");
		
		Function<String, Integer> findLength=(str)->str.length();
		System.out.println("Length of Shebi"+findLength.apply("Shebi"));
		
		//Supplier<String> getDayOfWeek=()-> LocalDate.now().getDayOfWeek().name();
		//System.out.println("Today is "+getDayOfWeek().get());
		
		
 	}

}
