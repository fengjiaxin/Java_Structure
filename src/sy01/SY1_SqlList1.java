package sy01;

import java.util.Scanner;

public class SY1_SqlList1 {

	public static void main(String[] args) throws Exception {
		SqList L = new SqList(20);
		Scanner sc = new Scanner(System.in);
		System.out.println("������˳���ĳ���");
		int n = sc.nextInt();
		System.out.println("������˳����и�Ԫ�ص�ֵ��");
		for(int i = 0;i<n;i++)
			L.insert(i,sc.nextInt());
		System.out.println("�����������Ԫ�ص�λ��i(0~curLen)��");
		int i = sc.nextInt();
		System.out.println("������������Ԫ��ֵx:");
		int x = sc.nextInt();
		L.insert( i, x);
		System.out.println("������˳���Ϊ��");
		L.display();
		System.out.println("�������ɾ��Ԫ�ص�λ��i(0~curLen-1)");
		i = sc.nextInt();
		L.remove(i);
		System.out.println("ɾ�����˳���Ϊ��");
		L.display();
		System.out.println("����������ҵ�Ԫ��ֵ��");
		x = sc.nextInt();
		int order = L.indexOf(x);
		if(order ==-1)
			System.out.println("��˳����в�����ֵΪ"+'x'+"��Ԫ�أ�");
		else
			System.out.println("ֵΪ"+x+"��Ԫ���ڴ˱��еĵ�"+order+"��λ����");
	}

}

