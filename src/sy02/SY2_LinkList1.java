package sy02;

import java.util.Scanner;

public class SY2_LinkList1 {
	
	private static void creat(LinkList L) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������и�Ԫ��ֵ��0Ϊ������");
		for(int x = sc.nextInt();x!=0;x=sc.nextInt())
			L.insert(0, x);
		
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		LinkList L  = new LinkList();
		creat(L);
		System.out.println("�����ĵ�����Ϊ��");
		L.display();
		System.out.println("������������λ��0~curLen");
		int i = sc.nextInt();
		System.out.println("��������������ݵ�ֵ��");
		int x = sc.nextInt();
		L.insert(i, x);
		System.out.println("����������Ϊ��");
		L.display();
		System.out.println("�������ɾ����λ��0~curLen-1");
		i = sc.nextInt();
		L.remove(i);
		System.out.println("ɾ���������Ϊ��");
		L.display();
		System.out.println("�����������Ԫ�ص����");
		i= sc.nextInt();
		int o = L.get(i);
		System.out.println("�������"+i+"���ڵ������Ϊ"+o);

	}

}
