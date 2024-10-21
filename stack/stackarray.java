public class stackarray {
    int[] arr =new int[7];
    int top=-1;
   
    void display()
    {
        int ref=top;
        while(ref>=0)
        {
            System.out.print(arr[ref]+" ");
            ref--;
        }
    }
     
    void push(int n)
    {
        if(top==arr.length)
        {
            System.out.println("over flow");
        }
        top++;
        arr[top]=n;

    }
    int  pop()
    {
        if(top==-1)
        {
            System.out.println("under flow");
        }
        int x= arr[top];
        top--;
        return x;
    }

    public static void main(String[] args) {
     
        stackarray obj = new stackarray();
        obj.push(2);
        obj.push(3);
        int a=obj.pop();
        obj.push(4);
        int b= obj.pop();
        System.out.println("value that are pop: "+a+" "+b);
        System.out.println("your remaining stack:");
        obj.display();
           
       }
}
