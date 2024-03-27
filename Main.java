/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static class queueArray{
        int f = -1;
        int r = -1;
        int size = 0;
        int [] arr = new int [100];
        
        public void add(int val){
            if(r == arr.length-1){
                System.out.print("Queue is full");
                return;
            }
            if(f == -1) {
                f = r = 0;
                arr[0] = val;
            }
            
            else {
                arr[r+1] = val;
                r++;
            }
            size++;
        }
        public int remove(){
            if(size == 0){
                System.out.print("Queue is empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }
        public int peek(){
             if(size == 0){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
            }
            for(int i = f;i<= r;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		queueArray q = new queueArray();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.display();
		q.remove();
		q.display();
	}
}
