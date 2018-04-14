package shallowCopy;

//changes in the copy changes the original object
public class TheProblem {
	public static void main(String[] args) {
		Job joesjob = new Job(40, "Carpenter");
		Person joe = new Person("Joe", joesjob);
		System.out.println(joe);
		try {
			Person joecopy = (Person) joe.clone();
			System.out.println(joecopy);
			// modifies original object!
			joecopy.job.typeOfJob = "Painter";	
			System.out.println(joe);
		} catch (CloneNotSupportedException e) {
			//handle
		}
	}

}
