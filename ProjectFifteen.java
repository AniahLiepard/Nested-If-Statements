public class ProjectFifteen {
	public static void main(String args[]){
		int age = 18;
		
		if (age <= 1){
			System.out.println("You are either a newborn or a young baby.");
		}else{
			System.out.println("You are between a toddler and a senior.");
			if (age <= 11){
				System.out.println("You are a child.");
			}else{
				System.out.println("You are a tween.");
			}
		}
	}
}
