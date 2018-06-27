class Sync{

synchronized void print(int n,int y){
for(int i=y;i<=n;i++){

System.out.println(i);

try{

Thread.sleep(3);

   }

catch(Exception e){

System.out.println(e);
   }

  }

 }

}

class Thread_1 extends Thread{
Sync s;
Thread_1(Sync s){
this.s=s;
}
public void run(){
s.print(500,0);
}
}

class Thread_2 extends Thread{
Sync s;
Thread_2(Sync s){
this.s=s;
}
public void run(){
s.print(1000,500);
}
}

public class MultiThread{
public static void main(String[] args){

Sync o=new Sync();
Thread_1 t1=new Thread_1(o);
Thread_2 t2=new Thread_2(o);
t1.start();
t2.start();
}
}