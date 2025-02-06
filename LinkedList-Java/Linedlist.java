import java.util.Scanner;
class node{
    int roll;
    String name;
    node next;
    public node(int roll,String name){
        this.roll=roll;
        this.name=name;
        this.next=null;

    }
}


public class Linedlist {
    node head;
        public void insertBeg(int roll,String name){
            node n=new node(roll,name);
            n.next=head;
            head=n;
        }
        public void insend(int roll,String name){
            node temp=head;
            node newnode=new node(roll,name);

            if(head==null){
                head=newnode;
            }
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }

        public void deisp(){
           
            System.out.println("Elements are:");
            node temp=head;
            while(temp!=null){
            System.out.println(temp.roll+" "+temp.name);
            temp=temp.next;
           
            }
        }
public void search(int roll){
    node temp=head;
           while(temp!=null){
                if(temp.roll==roll){
                    System.out.println("Found"+temp.roll+" "+temp.name);
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Not Found");
        }

        public void deleteNode(int pos) {
            if (head == null) { 
                System.out.println("List is empty");
                return;
            }
            if (pos == 1) { 
                head = head.next;
                return;
            }
            node temp = head;
            for (int i = 1; temp != null && i < pos - 1; i++) { 
                temp = temp.next;
            }
            if (temp == null || temp.next == null) { 
                System.out.println("Position out of bounds");
                return;
            }
            temp.next = temp.next.next; 
        }
    

        public void inspos(int roll,String name,int pos){
            node temp=head;
            node newnode=new node(roll,name);
            if(pos==1){
                insertBeg(roll,name);
            }
            for(int i=1;temp!=null && i<pos-1;i++){
                temp=temp.next;
            } 
            newnode.next=temp.next;
            temp.next=newnode;
        }
        public void len(){
           int c=0;

            node temp=head;
            while(temp!=null){
                c++;
            System.out.println(temp.roll+" "+temp.name);
            temp=temp.next;
           
            }
            System.out.println("length is "+c);
        }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linedlist ll=new Linedlist();
        int roll;String name;int pos;

        int i = 0;
                do{System.out.println("--------Menu------------");
                        System.out.println("1. Insert in beginning");
                        System.out.println("2. Insert in End");
                        System.out.println("3. Insert in position");
                        System.out.println("4. Display");
                        System.out.println("5. length");
                        System.out.println("6. Search");
                        System.out.println("7. reverse");
                        System.out.println("8. sum");
                        System.out.println("9. sort");
                        System.out.println("10. Delete");
                        System.out.println("11. Min/Max");
                        System.out.println("12. Exit");
                        int inp=sc.nextInt();                   
                    switch (inp) {
                       
                            case 1:
                                    System.out.println("Enter the roll number ");
                                    roll=sc.nextInt();
                                    System.out.println("Enter the name ");
                                    name=sc.next();
                                    ll.insertBeg(roll,name);

                                 break;
                        
                            case 2:
                            System.out.println("Enter the roll number ");
                                    roll=sc.nextInt();
                                    System.out.println("Enter the name ");
                                    name=sc.next();
                                    
                               ll.insend(roll, name);
                                break;
        
                       
        
                            case 3:
                           
                                System.out.println("Enter the roll number ");
                                roll=sc.nextInt();
                                System.out.println("Enter the name ");
                                name=sc.next();
                                System.out.println("Enter the pos ");
                                pos=sc.nextInt();
                                ll.inspos(roll,name,pos);
                                break;
                       
                            case 4:
                                 ll.deisp();

                                break;
                            case 5:
                           ll.len();
                           
                                
                                break;
                            case 6:
                            System.out.println("Enter the roll number ");
                             roll=sc.nextInt();
                                ll.search(roll);
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                            System.out.println("Enter the roll number ");
                            roll=sc.nextInt();
                               ll.del(roll);
                                break;
                            case 11:
                                break;
                            case 12:
                            i=5;
                                break;

                        
                    }
                }while (i != 5);
            }
        }
        
    
