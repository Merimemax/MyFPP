package deepCopy;

public class Person implements Cloneable {
	String name;
	Job job;

	public Person(String name, Job j) {
		this.name = name;
		job = j;
	}

	public String toString() {
		return "name: " + name + ", job: [" + job + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// creates a deep copy
		Person pcopy = (Person) super.clone();
		pcopy.job = (Job) job.clone();
		return pcopy;
	}
}
