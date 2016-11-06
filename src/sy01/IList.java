package sy01;

public interface IList {
	public void clear();
	public boolean isempty();
	public int length();
	public void insert(int i,int x) throws Exception;
	public void remove(int i)	throws Exception;
	public int indexOf(int x);
	public void display();
	

}

