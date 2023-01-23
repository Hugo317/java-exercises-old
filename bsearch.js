let baralho = [1,2,3,4,5,7,8,9,10,11,12,13,14,15,16];
let wanted = 12;
let end = baralho.length;
let mid  = Math.floor(baralho.legth/2);
let beg = 0;


for (let i = 0; i< Math.log(2,baralho.length)+2; i++){
	//console.log(i);
	
	
	mid = Math.floor((beg + end) / 2);
		

		if (Math.log(2,baralho) === i){ 
		console.log("not found");
	}

		if ( baralho[mid] === wanted){
		console.log("found card "+ wanted + " in position number " + mid);
			break;
}
		if ( baralho[mid] <  wanted){
		beg = mid +1
		//mid = Math.floor(end - mid / 2);
	}
		if (baralho[mid] > wanted){
		end = mid -1
		//mid = Math.floor(mid / 2);	
	}
}

			 




