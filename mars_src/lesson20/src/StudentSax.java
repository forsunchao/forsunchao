import java.util.HashSet;
import java.util.Set;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import bean.Lesson;
import bean.Student;

public class StudentSax extends DefaultHandler {
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	private Lesson lesson;
	private Set<Lesson> lessons;
	private Student student;
	private Set<Student> students;
	private String preTag;

	@Override
	public void startDocument() throws SAXException {
		lessons = new HashSet<Lesson>();
		students = new HashSet<Student>();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if ("student".equals(qName)) {
			student = new Student();
		}
		if ("lesson".equals(qName)) {
			lesson = new Lesson();
		}
		preTag = qName;
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (student != null && "student".equals(qName)) {
			student.setLessons(lessons);
			students.add(student);
			student = null;
			lessons = new HashSet<Lesson>();
		}
		if (lesson != null && "lesson".equals(qName)) {
			lessons.add(lesson);
			lesson = null;
		}
		preTag = null;
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if (student != null) {
			String data = new String(ch, start, length);
			if ("name".equals(preTag)) {
				student.setName(data);
			}
			if ("sex".equals(preTag)) {
				student.setSex(data);
			}
			if ("lessonName".equals(preTag)) {
				lesson.setLessonName(data);
			}
			if ("lessonScore".equals(preTag)) {
				lesson.setLessonScore(Integer.parseInt(data));
			}
		}
	}

}
