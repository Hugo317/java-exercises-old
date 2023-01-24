public class Neighbours {
	public static void main(String[] args){

	
    int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
	int diff = 10000 ;
	int Neig1 = 0;
	int Neig2 = 0; 
 
 for(int i = 0  ; i < myArray.length ; i++){
	// System.out.print(int i);
	 //System.out.print(myArray.length -1);
	if ( i == myArray.length-1){

		System.out.println(Neig1 + " and " + Neig2 + " are the closeste neighbours with the diffrence " + diff);
		break;
}

	if (Math.abs(myArray[i]-myArray[i+1]) < diff){
	
			diff = Math.abs(myArray[i]-myArray[i+1]);
			Neig1 = myArray[i+1];
			Neig2 = myArray[i];
			// System.out.println(Neig1);

}	
		
}
}
	}
