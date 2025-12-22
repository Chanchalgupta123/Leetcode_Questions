package Stack;

public class arrayImplementationInStack {
    public static class Stack{
        int idx=0;
        int arr[]=new int[5];
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx-1];

    }
    int pop(){
        if(idx==0) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
        }
        int size(){
            return idx;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }
        boolean isFull(){
            if(arr.length==idx){
                return true;
            }
            else return false;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
//        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();



    }
}
