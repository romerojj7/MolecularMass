public class IntStack {
	// May create private data here.
    private static final int MAX = 99;
    private int count;
    private int[] a;

	public IntStack() {
		// TODO: Code to initialize your stack.
        count = 0;
        a = new int[MAX];
        
	}

	public void push(int x) {
		// TODO: Code to push an item x onto the stack. The stack wlil never contain more than 100 elements
        a[count] = x;
        count++;

	}

	public int pop() {
		// TODO: Code to pop and retrun an item from the top of the stack. If the stack is empty, return -1.
        if (count == 0)
        {
            return -1;
        }

        count--;
        return a[count];
	}

    public boolean isEmpty()
    {
        if (count == 0)
        {
            return true;
        }
        return false;
    }
}
