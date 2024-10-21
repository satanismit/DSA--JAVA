import java.util.Scanner;
public class arrayqueue {
    int f=0,r=0;
    int[] arr =new int[5];
    public void enqueue(int n)
    {
        if(r==arr.length) System.out.println("queue overflow!!!");
        else
        {
            r=r+1;
            arr[r]=n;
        }
        if(f==0) f=1;   //for the first time only 
    }

    public int dequeue()
    {
        int x;
        if(f==0) System.out.println("queue underflow!!!");
        x=arr[f];
        if(f==r) 
        {
            f=r=0;
        } 
        else {
            f=f+1;
        }
        return x;
    }

    public void show()
    {
        int temp=f;
        System.out.print("after that your queue:");
        while(temp<=r)
        {
            System.out.print(arr[temp]+"--");
            temp++;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            arrayqueue obj =new arrayqueue();
            int fin=-1,ind=0;
            int[] pop=new int[10];
    while(fin!=0)
    {
        System.out.println("In queue of length 5 ,enter 1 for add value or 2 for get value:");
        int c =sc.nextInt();
        int b;
        
        switch(c)
        {
            case 1: 
            System.out.println("entre value:");
            b=sc.nextInt();
            obj.enqueue(b);
            obj.show();
            break;
            case 2:
            pop[ind++]=obj.dequeue();
            obj.show();
            break;
        }
        System.out.println("\n if you want to exit press 0 other wise press any number:");
        int v=sc.nextInt();
        fin=v;
    }
    System.out.println("poped elements:");
    for(int i:pop)
    {
        System.out.println(i);
    }
        sc.close();
    }
}
