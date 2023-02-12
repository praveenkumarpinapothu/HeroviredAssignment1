package Inheritance.HeroviredAssignment;
import java.util.HashSet;
import java.util.Set;
public class secondQuestion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 6, 2, 3, 6, 1, 3, 3};
        Set <Integer> n = new HashSet <>();
        for(int x:arr){
            n.add(x);
        }
        for(int x:n){
            System.out.print(x+" ");
        }
    }
}