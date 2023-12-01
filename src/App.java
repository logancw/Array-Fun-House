//                                 A31 Array Fun House
//                                   Logan Weisgerber
//                                      11/3/2023




class App {
  
  public static void main(String[] args) {
   int added = 0;
   int repeated = 0;
   int[] sum = {2,4,6,8,10,12,2,2,4,4};


  // LOOP BREAKDOWN
    // Creates new int assigns it the value of 0 checks if i is less then the arrays (values in the array starting at index [0]) then i++ continues the loop
   for(int i = 0; i < sum.length; i++){
       if(sum[i] == 2){ // Checks in the loop when the value of 2 happens
         repeated++; // adds to a count which outputs how many times 2 is seen in the array
       }
   }
   System.out.println("The number 2 appears " + repeated + " times in the array.");
    // For every int value in sum 
    for(int i : sum){
      added = i + added; // add it up essentailly just another loop that goes through each individual index. 
    }
    System.out.println("The sum of the array is " + added);
  }

  

}