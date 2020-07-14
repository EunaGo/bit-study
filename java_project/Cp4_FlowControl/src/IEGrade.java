
public class IEGrade {

	public static void main(String[] args) {

		int score = 99;
		String grade = "";

		if (score >= 90) {

			grade = "A";
			if (score >= 98) {
				grade = grade + "+";
			} else if (score < 94) {
				grade = grade + "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88) {
				grade = grade + "+";
			} else if (score < 84) {
				grade = grade + "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 78) {
				grade = grade + "+";
			} else if (score < 74) {
				grade = grade + "-";
			}

	}
}
}
