package test_inter;
 
public

class Test_1 {
 
    public static void main(String[] args) {
        
 
    int i, j;
 
    int[] numIndex = new int[201]; 
    for (i = 0; i<200 ; i++){
      numIndex[i] = i;
    }
 
    for (j=200; j>=0; j--){ 
      System.out.println(numIndex[j]);   
    } 
 
  }
}