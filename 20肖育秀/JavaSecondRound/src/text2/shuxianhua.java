package text2;

public class shuxianhua {

	public static void main(String[] args) {   //������������
		//�����������
		int x = 100 ;
		int a = 0 ;
		int b = 0;
		int c = 0;
		//forѭ�������������λ��ʮλ����λ�ϵ���
		for (x = 100 ;x < 1000 ; x++) {
			a = x / 100 ;   //��λ
			b = (x % 100) / 10 ;    //ʮλ
			c = x % 10 ;  //��λ
			//forѭ��Ƕ��if��䣬Math.pow�������ڷ���һ������ָ������
			if (x == Math.pow (a , 3)+Math.pow (b , 3)+Math.pow (c , 3)) {
				System.out.println("ˮ�ɻ�����" + x);
			}
		}
	}
}
	

