package bean;

public class Lesson {
	private String lessonName;
	private int lessonScore;

	public Lesson() {
	}

	public Lesson(String lessonName, int lessonScore) {
		super();
		this.lessonName = lessonName;
		this.lessonScore = lessonScore;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public int getLessonScore() {
		return lessonScore;
	}

	public void setLessonScore(int lessonScore) {
		this.lessonScore = lessonScore;
	}

}
