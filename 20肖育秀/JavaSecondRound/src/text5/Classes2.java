package text5;

import java.util.Scanner;

public class Classes2 {
	String grade;//�꼶
	String major;//רҵ
	String id;//�༶���
	String manager;//�༶������
	
	public Classes2(String grade,String major,String id){ //�����вεĹ��췽��1
		this.grade = grade;//��ȷ���ʳ�Ա����grade 
		this.major = major;//��ȷ���ʳ�Ա����major
		this.id = id;//��ȷ���ʳ�Ա����id
	}
	
	public  Classes2(String grade,String major,String id,String manager){ //�����вεĹ��췽��2
		this.grade = grade;//��ȷ���ʳ�Ա����grade
		this.major = major;//��ȷ���ʳ�Ա����major
		this.id = id;//��ȷ���ʳ�Ա����id
		this.manager = manager;	//��ȷ���ʳ�Ա����manager
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //����Scanner���󣬴Ӽ����ж�ȡ����
		System.out.println("������༶����:");
		int num = sc.nextInt(); //��¼�༶����
		Classes2[] classes = new Classes2[num]; //ͨ���༶��������������
		//forѭ��
		for (int i = 0; i < num; i++) {
			System.out.println("������༶��");
			String grade = sc.next();
			System.out.println("������רҵ��");
			String major = sc.next();
			System.out.println("������༶��ţ�");
			String id = sc.next();
			System.out.println("������༶�����ˣ�");
			String manager = sc.next();
			//if����ж��Ƿ��и�����
			if (manager != null) {
				classes[i] = new Classes2(grade, major, id);
			} else {
				classes[i] = new Classes2(grade, major, id, manager);
			}
		}
		// ��ѯ�ķ�ʽ
		System.out.println("�����밴�����ַ�ʽ��ѯ���ݣ�1.�༶;2.רҵ;3.�༶���");
		int a = sc.nextInt();
		// ��switch��������ж���ж�
		switch (a) {
		//���༶��ѯ
		case 1: 
			System.out.println("�������ѯ���꼶��");
			String b = sc.next();
			System.out.println("��ѯ������£�");
			//forѭ��
			for (int i = 0; i < num; i++) {
				if (classes[i].grade.equals(b)) {
					//if����ж��Ƿ��и�����
					if (classes[i].manager != null) {
						System.out.println("�꼶��" + classes[i].grade + "\n" + "רҵ:" + classes[i].major + "\n"+ "�༶���:" + classes[i].id);
					} else {
						System.out.println("�꼶��" + classes[i].grade + "\n" + "רҵ:" + classes[i].major + "\n"+ "�༶���:" + classes[i].id+ "\n" + "�༶������" + classes[i].manager);
					}
				}
			}
			break;
		//��רҵ��ѯ
		case 2:
			System.out.println("�������ѯ��רҵ��");
			String c = sc.next();
			System.out.println("��ѯ������£�");
			//forѭ��
			for (int i = 0; i < num; i++) {
				if (classes[i].major.equals(c)) {
					// if����ж��Ƿ��и�����
					if (classes[i].manager != null) {
						System.out.println("�꼶��" + classes[i].grade + "\n" + "רҵ:" + classes[i].major + "\n"+ "�༶���:" + classes[i].id + "\n");
					} else {
						System.out.println("�꼶��" + classes[i].grade + "\n" + "רҵ:" + classes[i].major + "\n"+ "�༶���:" + classes[i].id + "\n" + "�༶������" + classes[i].manager);
					}
				}
			}
			break;
		//���༶���
		case 3:
			System.out.println("�������ѯ�İ༶��ţ�");
			String d = sc.next();
			System.out.println("��ѯ������£�");
			// forѭ��
			for (int i = 0; i < num; i++) {
				if (classes[i].id.equals(d)) {
					//if����ж��Ƿ��и�����
					if (classes[i].manager != null) {
						System.out.println("�꼶��" + classes[i].grade + "\n" + "רҵ:" + classes[i].major + "\n"+ "�༶���:" + classes[i].id);
					} else {
						System.out.println("�꼶��" + classes[i].grade + "\n" + "רҵ:" + classes[i].major + "\n"+ "�༶���:" + classes[i].id + "\n" + "�༶������" + classes[i].manager);
					}
				}
			}
			break;
		}
	}
}




