package text3;

import java.util.Scanner;

public class Shuzu {

		public static void main(String[] args) {
			System.out.println("������ѧ������:");
			Scanner reader = new Scanner(System.in);//����Scanner���󣬴Ӽ����л�ȡѧ������
			int num = reader.nextInt();  //��¼ѧ������
			int students[] = new int[num];	//ͨ��ѧ����������������
			int no = 0;  //����������
			int maxscore = 0; // ��߷�
			int maxperson = 1; // ��߷�ѧ��
			System.out.println("������ÿ��ѧ���ĳɼ�:������0~100");
			
			//forѭ������ȡѧ���ɼ�
			for ( int a = 0; a < num; a++) {
				students[a] = reader.nextInt();
				//if������䣬�жϲ�������������߷֡���߷�ѧ��
				if (students[a] < 60) {
					no++;
				}
				if (maxscore < students[a]) {
					maxscore = students[a];
					maxperson = a;
				}
			}
			
			System.out.println("��߷ֵ�ѧ���ĳɼ���:" + maxscore);
			System.out.println("���ǵ�:" + (maxperson + 1) + "��ѧ��");
			System.out.println("�����������:"+ no);
	 

			
	}

}
