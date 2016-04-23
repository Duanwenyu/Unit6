public class TestStudent2 {
	public static void main(String[] args) {
		Student2 wangYun = new Student2();
		System.out.println("未赋值前的学生姓名为："+wangYun.stuName);
		System.out.println("未赋值前的学生年龄为："+wangYun.stuAge);
		System.out.println("未赋值前的学生性别为："+wangYun.stuSex);
		System.out.println("未赋值前的学生年级为："+wangYun.stuGrade);
		
		wangYun.stuName = "王云";
		wangYun.stuAge = 22;
		wangYun.stuSex = 1; // 1代表男，2代表女
		wangYun.stuGrade = 4;
		System.out.println("赋值后的学生姓名为："+wangYun.stuName);
		System.out.println("赋值后的学生年龄为："+wangYun.stuAge);
		System.out.println("赋值后的学生性别为："+wangYun.stuSex);
		System.out.println("赋值后的学生年级为："+wangYun.stuGrade);
		
//		wangYun.learn();
//		String rstString = wangYun.doHomework(22);
//		System.out.println(rstString);
	}
}
class Student2
{
	String stuName;
	int stuAge;
	int stuSex;
	int stuGrade;
	
	//定义听课的方法
	public void learn()
	{
		System.out.println(stuName+"正在认真听课！");
	}
	//定义写作业的方法
	public String doHomework(int hour)
	{
		return "现在是北京时间："+hour+"点，"+stuName+"正在写作业！";
	}

}
