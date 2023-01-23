let baralho = [2,4,5,8,9,4,2,1,4,5,6,7,8,9,1,1,5,7,9,1,2,4,6,8,9,5,8,3];
let bordenado = [];
let mao = baralho[0];
let maonum = 0;

for (let i = 0; i < baralho.length;0){
	mao = baralho[0];
	maonum = 0;
	for (let j = 0; j < baralho.length; j++){
		
		if ( j === baralho.length -1 && mao > baralho[j]){
			mao = baralho [j];
			maonum = j;
			bordenado.push(mao);
			baralho.splice(maonum,1);
		}
		
		if (j === baralho.length -1 && mao <= baralho[j]){
			bordenado.push(mao);
			baralho.splice(maonum,1);
			}

		if (mao > baralho[j]){
			mao = baralho[j];
			maonum = j; 
		}
}
}
console.log(bordenado);
