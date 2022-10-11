import java.util.*;


//Approach 1 
//If we compare each element of array with the rest of array


// public class Main{
//     public boolean contdup(int[] arr){   //function to ckeck if array contains duplicate
//         int ans=0;
//         for(int i=0; i<arr.length; i++){
//             int e= arr[i];
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j]==e){
//                 return true;
//             }
//         }
//     }
//     return false;
// }
//     public static void main(String args[]){
//         int[] arr= {3,1,5,2,11,33};
//         Main obj= new Main();

//         System.out.print(obj.contdup(arr));
//     }
// }



// Approach 2: 
// if we sort array and compare adjacent elements


// public class Main{    
//     public boolean contdup(int[] arr) {
//         Arrays.sort(arr);
//         for(int i=0; i<arr.length-1; i++){
//         if(arr[i]==arr[i+1]){
//             return true;
//         }
//     }
//     return false;
        
//     }
//     public static void main(String args[]){
//         int[] arr= {3,1,5,2,1,33};
//         Main obj= new Main();

//         System.out.print(obj.contdup(arr));
//     }
// }




// Approach 3:
// Using hashSet we'll check if element exists twice


    public class Main{
    public boolean contdup(int[] arr) {
        
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
    }
        
    return false;
        
    }
     public static void main(String args[]){
        int[] arr= {3,1,5,2,11,33};
        Main obj= new Main();

        System.out.print(obj.contdup(arr));
    }
}
