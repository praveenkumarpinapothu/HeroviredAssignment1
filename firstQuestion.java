package Inheritance.HeroviredAssignment;

public class firstQuestion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 8, 10, 11, 14};
        int i=0;
        int x=1;
        while(x<arr[arr.length-1])
        {
            if(arr[i]!=x)
            {
                System.out.print(x+",");
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