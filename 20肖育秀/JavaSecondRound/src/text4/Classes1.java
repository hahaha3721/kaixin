package text4;

public class Classes1 {
	String grade;//�꼶
	String major;//רҵ
	String id;//�༶���
	String manager;//�༶������
	
	public Classes1(String grade,String major,String id){ //�����вεĹ��췽��1
		this.grade = grade;//��ȷ���ʳ�Ա����grade 
		this.major = major;//��ȷ���ʳ�Ա����major
		this.id = id;//��ȷ���ʳ�Ա����id
	}
	
	public  Classes1(String grade,String major,String id,String manager){ //�����вεĹ��췽��2
		this.grade = grade;//��ȷ���ʳ�Ա����grade
		this.major = major;//��ȷ���ʳ�Ա����major
		this.id = id;//��ȷ���ʳ�Ա����id
		this.manager = manager;	//��ȷ���ʳ�Ա����manager
	}
	
	public void setGrade(String grade){
		this.grade = grade;//����grade��ֵ
	}
	
	public void setMajor(String major){
		this.major = major;//����major��ֵ
	}
	
	public void setid(String id){
		this.id = id ;//����id��ֵ
	}
	
	public void method1() { // ����1
		System.out.println("����༶������Ϣ");
		
		// if����ж��Ƿ��и�����
		if (manager!= null) {
			System.out.println("�꼶��" + grade + "\n" + "רҵ:" + major+ "\n" + "�༶���:" + id + "\n" + "�༶������:" + manager);
		} else {
			System.out.println("�꼶��" + grade + "\n" + "רҵ:" + major+ "\n" + "�༶���:" + id);
				}
	}
	 
	public void getmanager(){ //����2
		
	}
	
	public void method3(String manager){ //����3
		this.manager = manager;//���ð༶������
	}
	
	public static void main(String[] args){
		Classes1 class_1 = new Classes1("1��","2020��","�������","��ǿ");
		Classes1 class_2 = new Classes1("2��","2020��","�������");
		class_1.method1();
		System.out.println();
		class_2.method1();
	}
	
}

