import java.util.*;
class stack{
    static class Mystack{
        private int top;
        private final int max=100;
        private int[] arr;


        public Mystack(){
            arr=new int[max];
            top=-1;
        }


       public void push(int val){
            if(top==max-1){
                System.out.println("Stack is full");
            }
            else{
                arr[++top]=val;
            }
        }

        public void pop(){
            if(top==-1){
                System.out.println("Stack is Empty!");
            }
            else{
                --top;
            }
        }
        public void peek(){
            if(top==-1){
                System.out.println("Stack is Empty!");
            }else{
                System.out.println("Top Element: "+arr[top]);
            }

        }
            public void isempty(){
                if(top==-1){
                System.out.println("Stack is Empty!");}
            }
            public void isfull(){
                if(top==max-1){
                System.out.println("Stack is Full!");}
            }

        public void display(){
            System.out.println("Stack Elements:");

            isempty();
            
                for(int i=0;i<=top;i++){
                    System.out.println(arr[i]);
                }
            
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mystack ms=new Mystack();


        int i = 0;
                do{System.out.println("--------Menu------------");
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Peek");
                        System.out.println("4. IsEmpty");
                        System.out.println("5. Display");
                        System.out.println("6. isfull");
                        System.out.println("7. Exit");
                        int inp=sc.nextInt();
                       // int i=0;
                    switch (inp) {
                        //push
                            case 1:
                            System.out.println("Enter the element to push");    
                            int val=sc.nextInt();
                            ms.push(val);

                            break;
                        //pop
                            case 2:
                                ms. pop();
                            break;
        
                        //peek
        
                            case 3:
                            ms.peek();
                            break;
                        //display
                            case 4:
                          ms.isempty();
                            break;
                    case 5:
                    ms.display();
                    break;
                    case 6:
                    ms.isfull();


                    break;
                        default:
                            i=5;
                            break;
                    }
                }while (i != 5);
            
        
    }
}