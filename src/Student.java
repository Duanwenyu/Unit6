public class Student {
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	// ���з�����ȡѧ��������
	public String getStuName() {
		// this��ʾ������
		return this.stuName;
	}

	// ���з�������ѧ������
	public void setStuName(String name) {
		this.stuName = name;
	}

	// ���з������ѧ������
	public int getStuAge() {
		return this.stuAge;
	}

	// ���з�������ѧ������
	public void setStuAge(int age) {
		this.stuAge = age;
	}

	// ���з������ѧ���Ա�
	public int getStuSex() {
		return this.stuSex;
	}

	// ���з�������ѧ���Ա�
	public void setStuSex(int sex) {
		this.stuSex = sex;
	}

	// ���з������ѧ���꼶
	public int getStuGrade() {
		return this.stuGrade;
	}

	// ���з�������ѧ���Ա�
	public void setStuGrade(int grade) {
		this.stuGrade = grade;
	}

	// �������εķ���
	public void learn() {
		System.out.println(stuName + "�����������Σ�");
	}

	// ����д��ҵ�ķ���
	public String doHomework(int hour) {
		return "�����Ǳ���ʱ�䣺" + hour + "�㣬" + stuName + "����д��ҵ��";
	}

}
