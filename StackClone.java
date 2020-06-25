package CC;

public class StackClone<T> {
	private T[] stackarray;
	private int top = -1;
	private int size;
	
	@SuppressWarnings("unchecked")
	public StackClone(int size) {
		stackarray = (T[])new Object[size];
		this.size = size;
	}
	
	public void push(T input) {
		if(top >= size) return;
		stackarray[++top] = input;
	}

	public boolean isEmpty() {
		if(top == -1) return true;
		return false;
	}
	
	public T pop() {
		if(isEmpty()) return null;
		T save = stackarray[top];
		stackarray[top--] = null;
		return save;
	}
	
	public T top() {
		if(isEmpty()) return null;
		return stackarray[top];
	}
	
	public int size() {
		return top+1;
	}
	
	public StackClone<T> clone(){
		StackClone<T> clone = new StackClone<T>(size);
		for(int i=0; i<=top; i++) {
			clone.push(stackarray[i]);
		}
		return clone;
	}

	public static void main(String[] args) {
		StackClone<Integer> cloned = new StackClone<>(10);
		for(int i=0; i<10; i++) {
			cloned.push(i+1);
		}
		StackClone<Integer> clone = cloned.clone();
		for(int i=0; i<10; i++) {
			System.out.println("clone: "+clone.pop());
		}
		System.out.println(cloned.isEmpty());
		
	}

}
