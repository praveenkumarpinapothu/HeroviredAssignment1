package Inheritance.HeroviredAssignment;

public class firstQuestion {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6};
        int i=0;
        int x=1;
        while(x<arr[arr.length-1])
        {
            if(arr[i]!=x)
            {
                System.out.println(x);
                x++;
            }
            else
            {
                i++;
                x++;
            }
        }
    }
}