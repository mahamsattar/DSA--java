import java.util.*;
class LL{
    public static void main(String args[]){
        LinkedList <String> list = new LinkedList<String> ();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        for(int i =0 ; i<list.size(); i++){
            System.out.print(list.get(i) + " ->");

        }
        System.out.println("null");
          list.remove(2);
          System.out.println(list);
    }
}