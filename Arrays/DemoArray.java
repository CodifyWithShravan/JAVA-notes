public class DemoArray{
    public static void main(String[] args) {
        int a[] = {10,20,30,40}; // Static intialising the values into the array

        int n = a.length; // To find the length of the array

        for(int i = 0; i<n; i++){ // Traversing and accessing the array
            System.out.println(a[i]); 
        }

        a[2] = 100; // Can modify the elemnts in the array

        System.out.println();
 
        for(int i = 0; i<n; i++){ // Traversing the array after changing the a[2]
            System.out.println(a[i]); 
        }

    }
}