public class Student {
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	// 公有方法获取学生的姓名
	public String getStuName() {
		// this表示本对象
		return this.stuName;
	}

	// 公有方法设置学生姓名
	public void setStuName(String name) {
		this.stuName = name;
	}

	// 公有方法获得学生年龄
	public int getStuAge() {
		return this.stuAge;
	}

	// 公有方法设置学生年龄
	public void setStuAge(int age) {
		this.stuAge = age;
	}

	// 公有方法获得学生性别
	public int getStuSex() {
		return this.stuSex;
	}

	// 公有方法设置学生性别
	public void setStuSex(int sex) {
		this.stuSex = sex;
	}

	// 公有方法获得学生年级
	public int getStuGrade() {
		return this.stuGrade;
	}

	// 公有方法设置学生性别
	public void setStuGrade(int grade) {
		this.stuGrade = grade;
	}

	// 定义听课的方法
	public void learn() {
		System.out.println(stuName + "正在认真听课！");
	}

	// 定义写作业的方法
	public String doHomework(int hour) {
		return "现在是北京时间：" + hour + "点，" + stuName + "正在写作业！";
	}

}
