public class TestStudent2 {
	public static void main(String[] args) {
		Student2 wangYun = new Student2();
		System.out.println("δ��ֵǰ��ѧ������Ϊ��"+wangYun.stuName);
		System.out.println("δ��ֵǰ��ѧ������Ϊ��"+wangYun.stuAge);
		System.out.println("δ��ֵǰ��ѧ���Ա�Ϊ��"+wangYun.stuSex);
		System.out.println("δ��ֵǰ��ѧ���꼶Ϊ��"+wangYun.stuGrade);
		
		wangYun.stuName = "����";
		wangYun.stuAge = 22;
		wangYun.stuSex = 1; // 1�����У�2����Ů
		wangYun.stuGrade = 4;
		System.out.println("��ֵ���ѧ������Ϊ��"+wangYun.stuName);
		System.out.println("��ֵ���ѧ������Ϊ��"+wangYun.stuAge);
		System.out.println("��ֵ���ѧ���Ա�Ϊ��"+wangYun.stuSex);
		System.out.println("��ֵ���ѧ���꼶Ϊ��"+wangYun.stuGrade);
		
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
	
	//�������εķ���
	public void learn()
	{
		System.out.println(stuName+"�����������Σ�");
	}
	//����д��ҵ�ķ���
	public String doHomework(int hour)
	{
		return "�����Ǳ���ʱ�䣺"+hour+"�㣬"+stuName+"����д��ҵ��";
	}

}
