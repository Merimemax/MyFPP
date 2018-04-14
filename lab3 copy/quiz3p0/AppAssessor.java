package quiz3p0;

import java.time.LocalDate;

public final class AppAssessor {
	private ApplicantForGradSchool[] applicants;
	private ApplicantForGradSchool[] accepted;
	private ApplicantForGradSchool[] rejected;

	public AppAssessor(ApplicantForGradSchool[] applicants) {
		this.applicants = applicants;
		evaluateApplicants();
	}

	private void evaluateApplicants() {
		ApplicantForGradSchool[] acceptedTemp = new ApplicantForGradSchool[applicants.length];
		ApplicantForGradSchool[] rejectedTemp = new ApplicantForGradSchool[applicants.length];
		int acceptedLength = 0;
		int rejectedLength = 0;
		for (int i = 0; i < applicants.length; ++i) {
			ApplicantForGradSchool a = applicants[i];
			LocalDate graduationDate = a.getBachelorsGraduationDate();
			float gpa = a.getGpa();
			int rank = a.getClassRank();
			if (graduationDate.getYear() > AppConstantss.YEAR && gpa > AppConstantss.GPA
					&& AppConstantss.MIN_RANK < rank && rank < AppConstantss.MAX_RANK) {
				acceptedTemp[acceptedLength++] = a;
			} else {
				rejectedTemp[rejectedLength++] = a;
			}
		}
		accepted = new ApplicantForGradSchool[acceptedLength];
		rejected = new ApplicantForGradSchool[rejectedLength];
		System.arraycopy(acceptedTemp, 0, accepted, 0, acceptedLength);
		System.arraycopy(rejectedTemp, 0, rejected, 0, rejectedLength);
	}

	public ApplicantForGradSchool[] getApplicants() {
		return applicants.clone(); // returns a clone of applicants object
	}

	public ApplicantForGradSchool[] getAccepted() {
		return accepted.clone();
	}

	public ApplicantForGradSchool[] getRejected() {
		return rejected;
	}

}
