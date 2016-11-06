package sy02;

public class LinkList implements IList {
	
	private Node head;//定义一个头结点
	

	public LinkList() {
		super();
		head = new Node();
	}

	@Override
	public void create() {
		
	}

	@Override
	public boolean isEmpty() {

		return head.getNext().equals(null);
	}

	@Override
	public int length() {
		
		int j = 0;
		

		return 0;
	}

	@Override
	public int get(int i) {
		Node p = head.getNext();
		int j = 0;
		while(p.getNext()!=null && j<i)
		{
			p = p.getNext();
			j++;
		}
		if(i<j || p==null)
			System.out.println("第"+i+"个元素不存在");
			

		return p.getData();
	}
	


	@Override
	public void insert(int i, int x) throws Exception {
		Node p = head;//初始化p为头结点
		int j = -1;//计数器
		while(p!=null && j<i-1)
		{
			p = p.getNext();
			++j;
		}
		if(i<=j || p==null)
			throw new Exception("插入位置不合理");
		Node s = new Node(x);
		s.setNext(p.getNext());
		p.setNext(s);
		
	}

	@Override
	public void remove(int i) throws Exception {
		Node p = head;
		int j = -1;
		while(p.getNext()!=null && j<i-1)
		{
			p=p.getNext();
			j++;
		}
		if(p.getNext()==null || i <0)
			throw new Exception("删除位置不正确");
		
		p.setNext(p.getNext().getNext());
		
	}

	@Override
	public int indexOf(int x) {

		return 0;
	}

	@Override
	public void display() {
		Node top = head.getNext();
		while(top!=null)
		{
			System.out.print(top.getData()+" ");
			top=top.getNext();
		}
		System.out.println();
		
	}

}
