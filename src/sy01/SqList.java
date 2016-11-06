package sy01;

public class SqList implements IList {
	
	private int[] ListElem;
	private int curLen;
	
	
	public SqList(int capacity) {
		ListElem = new int[capacity];
	}

	public int[] getListElem() {
		return ListElem;
	}

	public void setListElem(int[] listElem) {
		ListElem = listElem;
	}

	public int getCurLen() {
		return curLen;
	}

	public void setCurLen(int curLen) {
		this.curLen = curLen;
	}

	
	
	@Override
	public void clear() {
		
	}

	@Override
	public boolean isempty() {
		
		return curLen==0;
	}

	@Override
	public int length() {
		
		return curLen;
	}

	@Override
	public void insert(int i, int x) throws Exception {
		if(curLen==ListElem.length)
			throw new Exception("顺序表已满");
		if(i<0||i>curLen)
			throw new Exception("插入位置不合法");
		for(int j=curLen;j>i;j--)
			ListElem[j]=ListElem[j-1];
		ListElem[i]=x;
		curLen++;
	}

	@Override
	public void remove(int i) throws Exception {
		if(i<0||i>curLen)
			throw new Exception("删除位置不合法");
		for(int j=i;j<curLen-1;j++)
			ListElem[j]=ListElem[j+1];
		curLen--;
	}

	@Override
	public int indexOf(int x) {
		int j =0;
		while(j<curLen && ListElem[j]!=x)
			j++;
		if(j<curLen)
			return j;
		else
		return -1;
	}

	@Override
	public void display() {
		if(curLen==0)
			System.out.println("线性表为空表");
		else
		System.out.print("{");
		for(int j =0;j<curLen-1;j++)
			System.out.print(ListElem[j]+",");
		System.out.println(ListElem[curLen-1]+"}");
	}

	
	

}
