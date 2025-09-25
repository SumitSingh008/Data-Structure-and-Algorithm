package Stack_and_Queue;

// dynamic stack will inherit all the properties of custom stack class
// and will override the push method
// in it we don't need to define the size of the stack as it will be dynamic
// it will double the size of stack when it is full so isFull() method will never return true
// rest all the methods will be same as custom stack
public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();// it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size);
    }

    @Override
    public boolean push(int item) {

        // this will takes care of it if the stack becomes full being full.⭐⭐
        if (this.isFull()) {
            // double the array size⭐⭐⭐
            int[] temp = new int[data.length * 2];

            // copy all the previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}
