
package Q3;

import java.util.LinkedList;

public class Mystack {

    private LinkedList<Integer> ls ;
    private int size;
    private int min = (int) 1e9;
    public Mystack(int size){
        this.size=size;
        ls = new LinkedList<Integer>();
    }

    public int push(int data){
        if( ls.isEmpty() && size>0){
            ls.add(data);
            this.size = this.size+1;
            this.min=data;
        }else if(size>0){

            ls.addFirst(data);
            this.size=this.size+1;
            if(data<this.min){
                this.min=data;
            }
        }else{
            System.out.println("stack is full");
        }
        return data;
    }

    public void pop(){
        if(ls.isEmpty()){
            System.out.println("stack is empty");
        }else{

            System.out.println(ls.getFirst());
            ls.removeFirst();
            this.size = this.size-1;
            for(int data : ls){
                if(this.min>data){
                    this.min=data;
                }
            }
        }
    }
    public boolean isEmpty(){
        return ls.isEmpty();
    }
    public int size(){
        return size;
    }
    public int getMin(){
        return this.min;
    }
    public void display(){
        System.out.println(ls);
    }

}
