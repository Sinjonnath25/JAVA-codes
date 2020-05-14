interface Istack
{
        int stackfull();
        int stackempty();
        void push(int item);
        int pop();
}
class Fstack implements Istack
{
        private int stk[ ];
        private int top;
        public Fstack(int size)
        {
                stk=new int[size];
                top=-1;
        }
        public int stackfull()
        {
                if(top==stk.length-1)
                {
                        /*System.out.println("Stack Overflows");
                        System.out.println("Stack is Full");*/
                        return 1;
                }
                else{
                        //System.out.println("Stack is not Full");
                        return 0;
                }
        }
        public void push(int item)  //method
        {
                if(stackfull()!=0)
                {
                        System.out.println("Stack Overflows");
                }
                else
                        stk[++top]=item;
        }  
        public int stackempty(){
                if(top==-1)
                        return 1;
                else 
                   return 0;
        }

         public int pop()
        {
                if(stackempty()!=0)
                {
                        System.out.println("Stack Underflows");
                        return 0;
                }
                else
                        return stk[top--];
        }

}
class StackTest1
{
        public static void main(String args[ ])
        {
                Fstack fs=new Fstack(3);
                Istack mystk;
                mystk=fs;
                for(int i=0;i<3;i++)
                        mystk.push(10+i);
                System.out.println("Fixed length Stack Contents using interface reference");
                for(int i=0;i<3;i++)
                        System.out.println(mystk.pop());
                /*mystk=ds;
                for(int i=0;i<7;i++)
                        mystk.push(i);
                System.out.println("Dynamic length Stack Contents using interface reference");
                for(int i=0;i<7;i++)
                        System.out.println(mystk.pop());*/
        }
}