package sy02;

public interface IList {
	public void create();//ͷ������
	public boolean isEmpty();
	public int length();
	public int get(int i);
	public void insert(int i,int x) throws Exception;
	public void remove(int i) throws Exception;
	public int indexOf(int x);
	public void display();
	

}
