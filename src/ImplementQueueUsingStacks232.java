import java.util.Stack;

public class ImplementQueueUsingStacks232 {
    /** Initialize your data structure here. */
    Stack<Integer> storage;
    Stack<Integer> temp;
    public ImplementQueueUsingStacks232() {
        storage = new Stack<>();
        temp = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        storage.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (storage.empty())
        {
            return -1;
        }
        while (storage.size() > 1)
        {
            temp.push(storage.pop());
        }
        int result = storage.pop();
        while(temp.size() > 0)
        {
            storage.push(temp.pop());
        }
        return result;
    }

    /** Get the front element. */
    public int peek() {
        if (storage.empty())
        {
            return -1;
        }
        while (storage.size() > 1)
        {
            temp.push(storage.pop());
        }
        int result = storage.peek();
        while(temp.size() > 0)
        {
            storage.push(temp.pop());
        }
        return result;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return storage.empty();
    }
}
