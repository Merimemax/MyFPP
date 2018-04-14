package shallowCopy;

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
		//shallow copy not desirable here: Job in copy is same as Job in original
		return (Person) super.clone();
	}
}

