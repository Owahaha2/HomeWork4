import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class MyList<T> {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    static ArrayList<String> arr=new ArrayList<>();
    public void Do(){
        arr.add("lin");
        arr.add("tong");
        arr.add("jiejie");
        arr.add("bu");
        arr.add("niubi");
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        arr.set(3,"zhenniubi");
        System.out.println(arr);
        System.out.println("第"+a+"个字符是"+arr.get(a));
    }
    class Itr implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
    public Iterator iterator(){
        return new Itr();
    }
}
class Demo8 {
    public static void main(String[] args) {
        System.out.println("请输入一个0-3的整数:");
        MyList my=new MyList();
        my.Do();
        ArrayList mylist=new ArrayList();
        mylist.add("zhe");
        mylist.add("shen");
        mylist.add("niubi");
        System.out.println();
        Iterator a=mylist.iterator();
        while(a.hasNext()){
            System.out.print(a.next()+" ");
        }
    }
}