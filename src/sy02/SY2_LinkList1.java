package sy02;

import java.util.Scanner;

public class SY2_LinkList1 {
	
	private static void creat(LinkList L) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("情输入链表中个元素值（0为结束）");
		for(int x = sc.nextInt();x!=0;x=sc.nextInt())
			L.insert(0, x);
		
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		LinkList L  = new LinkList();
		creat(L);
		System.out.println("建立的单链表为：");
		L.display();
		System.out.println("情输入带插入的位置0~curLen");
		int i = sc.nextInt();
		System.out.println("情输入带插入数据的值：");
		int x = sc.nextInt();
		L.insert(i, x);
		System.out.println("插入后的链表为：");
		L.display();
		System.out.println("情输入待删除的位置0~curLen-1");
		i = sc.nextInt();
		L.remove(i);
		System.out.println("删除后的链表为：");
		L.display();
		System.out.println("情输入带查找元素的序号");
		i= sc.nextInt();
		int o = L.get(i);
		System.out.println("此链表第"+i+"个节点的数据为"+o);

	}

}
