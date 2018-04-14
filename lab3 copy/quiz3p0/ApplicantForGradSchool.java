package quiz3p0;

import java.time.LocalDate;

public final class ApplicantForGradSchool {
	private final String name;
	private LocalDate bachelorsGraduationDate;
	private final float gpa;
	private final int classRank;

	public ApplicantForGradSchool(String name, LocalDate gradDate, float gpa, int rank) {
		this.name = name;
		this.bachelorsGraduationDate = gradDate;
		this.gpa = gpa;
		this.classRank = rank;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBachelorsGraduationDate() {
		return bachelorsGraduationDate;
	}

	public float getGpa() {
		return gpa;
	}

	public int getClassRank() {
		return classRank;
	}

	public String toString() {
		return "(" + name + ": " + gpa + ", " + classRank + ", " + bachelorsGraduationDate + ")";
	}
}
