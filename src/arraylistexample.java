import java.util.ArrayList;

public class arraylistexample {
public static void main(String[] args){
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    al.add(20);
    al.add(30);
    System.out.println(al);
    System.out.println(al.get(0));
    al.remove(0);
    System.out.println(al);
    System.out.println(al.size());
    al.set(1,50);;
    System.out.println(al);

}
}
