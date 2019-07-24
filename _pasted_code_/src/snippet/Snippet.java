package snippet;

public class Snippet {
	@Before("execution(* com.gftraining.Performance.perform(..))")
		public void silencePhones() {
			System.out.println("Silence Phones");
		}
}

