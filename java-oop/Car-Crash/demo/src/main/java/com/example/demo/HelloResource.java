public class Neighbours {
  2         public static void main(String[] args){
        3
        4
        5     int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
        6         int diff = 10000 ;
        7         int Neig1 = 0;
        8         int Neig2 = 0;
        9
        10  for(int i = 0  ; i < myArray.length ; i++){
            11         System.out.print(i);
            12         System.out.print(myArray.length -1);
            13         if ( i == myArray.length -1){
                14
                15                 System.out.println(Neig1 + Neig2 + " are the closeste neighb    ours");
                16                 break;
                17 }
            18
            19         if (Math.abs(myArray[i]-myArray[i+1]) < diff){
                20
                21                          diff = Math.abs(myArray[i]-myArray[i+1])Neig1 = myArray[i+1];
                23                          Neig2 = myArray[i];
                "Neighbours.java" 29L, 558B