public class AverageTemperatePerDay {
	// Main Method
   public static void main(String[] args) {
      int[][] data = {
         {0,1,79},
         {0,2,79},
         {0,3,74},
         {0,4,79},
         {0,5,74},
         {0,6,79},
         {0,7,76},
         {0,8,77},
         {0,9,80},
         {0,10,77},
         {0,11,76},
         {0,12,76},
         {0,13,79},
         {0,14,74},
         {0,15,77},
         {0,16,77},
         {0,17,76},
         {0,18,77},
         {0,19,74},
         {0,20,75},
         {0,21,79},
         {0,22,74},
         {0,23,76},
         {0,24,74},
         {1,1,74},
         {1,2,75},
         {1,3,80},
         {1,4,78},
         {1,5,79},
         {1,6,75},
         {1,7,79},
         {1,8,75},
         {1,9,78},
         {1,10,77},
         {1,11,74},
         {1,12,80},
         {1,13,78},
         {1,14,74},
         {1,15,77},
         {1,16,79},
         {1,17,79},
         {1,18,74},
         {1,19,79},
         {1,20,78},
         {1,21,77},
         {1,22,76},
         {1,23,78},
         {1,24,80},
         {2,1,74},
         {2,2,77},
         {2,3,80},
         {2,4,74},
         {2,5,78},
         {2,6,77},
         {2,7,76},
         {2,8,76},
         {2,9,76},
         {2,10,75},
         {2,11,75},
         {2,12,79},
         {2,13,79},
         {2,14,79},
         {2,15,74},
         {2,16,75},
         {2,17,79},
         {2,18,74},
         {2,19,78},
         {2,20,74},
         {2,21,78},
         {2,22,78},
         {2,23,77},
         {2,24,74},
         {3,1,80},
         {3,2,79},
         {3,3,79},
         {3,4,78},
         {3,5,76},
         {3,6,77},
         {3,7,79},
         {3,8,74},
         {3,9,75},
         {3,10,76},
         {3,11,74},
         {3,12,77},
         {3,13,77},
         {3,14,78},
         {3,15,75},
         {3,16,78},
         {3,17,79},
         {3,18,74},
         {3,19,80},
         {3,20,79},
         {3,21,79},
         {3,22,76},
         {3,23,79},
         {3,24,74},
         {4,1,77},
         {4,2,75},
         {4,3,77},
         {4,4,79},
         {4,5,79},
         {4,6,74},
         {4,7,77},
         {4,8,79},
         {4,9,77},
         {4,10,76},
         {4,11,77},
         {4,12,80},
         {4,13,76},
         {4,14,79},
         {4,15,76},
         {4,16,75},
         {4,17,74},
         {4,18,78},
         {4,19,75},
         {4,20,77},
         {4,21,77},
         {4,22,75},
         {4,23,77},
         {4,24,79},
         {5,1,75},
         {5,2,76},
         {5,3,77},
         {5,4,76},
         {5,5,80},
         {5,6,75},
         {5,7,80},
         {5,8,79},
         {5,9,78},
         {5,10,75},
         {5,11,74},
         {5,12,74},
         {5,13,77},
         {5,14,75},
         {5,15,80},
         {5,16,75},
         {5,17,78},
         {5,18,80},
         {5,19,77},
         {5,20,80},
         {5,21,74},
         {5,22,74},
         {5,23,74},
         {5,24,75},
         {6,1,76},
         {6,2,79},
         {6,3,74},
         {6,4,79},
         {6,5,78},
         {6,6,74},
         {6,7,75},
         {6,8,78},
         {6,9,77},
         {6,10,74},
         {6,11,74},
         {6,12,80},
         {6,13,77},
         {6,14,74},
         {6,15,80},
         {6,16,79},
         {6,17,80},
         {6,18,76},
         {6,19,75},
         {6,20,78},
         {6,21,77},
         {6,22,79},
         {6,23,80},
         {6,24,78},
         {7,1,80},
         {7,2,80},
         {7,3,76},
         {7,4,77},
         {7,5,78},
         {7,6,78},
         {7,7,80},
         {7,8,80},
         {7,9,79},
         {7,10,77},
         {7,11,79},
         {7,12,75},
         {7,13,80},
         {7,14,79},
         {7,15,76},
         {7,16,78},
         {7,17,80},
         {7,18,79},
         {7,19,77},
         {7,20,78},
         {7,21,74},
         {7,22,77},
         {7,23,76},
         {7,24,74},
         {8,1,80},
         {8,2,74},
         {8,3,77},
         {8,4,80},
         {8,5,78},
         {8,6,77},
         {8,7,76},
         {8,8,80},
         {8,9,78},
         {8,10,79},
         {8,11,76},
         {8,12,77},
         {8,13,77},
         {8,14,77},
         {8,15,80},
         {8,16,76},
         {8,17,77},
         {8,18,80},
         {8,19,78},
         {8,20,78},
         {8,21,78},
         {8,22,77},
         {8,23,75},
         {8,24,77},
         {9,1,75},
         {9,2,78},
         {9,3,78},
         {9,4,75},
         {9,5,78},
         {9,6,76},
         {9,7,76},
         {9,8,74},
         {9,9,78},
         {9,10,76},
         {9,11,80},
         {9,12,74},
         {9,13,79},
         {9,14,78},
         {9,15,75},
         {9,16,75},
         {9,17,74},
         {9,18,79},
         {9,19,77},
         {9,20,78},
         {9,21,76},
         {9,22,75},
         {9,23,74},
         {9,24,78},
         };
      //int[][]data=new int240][3];
    // int[][]data= new double  [240][3];
      int[]dayTemp=new int[10];
      for(int i =0;i<data.length; i++){
         
         dayTemp [data[i][0]]+=data[i][2];
      }
      
      for(int i =0;i<dayTemp.length;i++){
         System.out.printf("The average tempature for day %d was: %.2f\n",i, getAverage(dayTemp[i]));
         
      }
      
      
      
        
                  
   }
   public static double getAverage(int x){
      
      return x/24.0;
   }
      
      
      //for(double i=0;i<10;i++){  
      
        //i=sum+24;
         //average=i/24;
         //System.out.println(average); 
        
      
    
      //sum(X(1:24))
      
         
      
      
   
   
   
}   
   
