public class Array_practic {
    public static void main(String[] args) {      
      
       //Store only even numbers in the array
       int[] arr1= new int[5];
       for(int i=0; i<arr1.length; i++){
        arr1[i]= i*2+2;
         System.out.println(arr1[i]);
       }
        
       //Calculate the sum of array elements  
       int[] arr2 ={3,5,8,10,4,9};
       int sum= 0;
       for(int i=0; i<arr2.length; i++){
        sum+=arr2[i];
       }
       System.out.println("sum is: "+sum);
       
       //Find the largest value in the array
       int max = arr2[0];
       for(int i=1; i<arr2.length; i++){
        if(arr2[i]>max)
            max= arr2[i];
       }
       System.out.println("max value is: "+max);

       //Sort array and print it  
      int [] array = {1,4,7,2};
      for(int i=0; i<array.length-1 ; i++){
        for (int j=i+1; j<array.length ; j++){
           if (array[i]<array[j]){
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
            }  
        }
      }
      System.out.print("Sorted array: ");
      for(int i=0; i<array.length; i++){
         System.out.print(array[i]+" "); 
      }

      
      }
        
    }
    
