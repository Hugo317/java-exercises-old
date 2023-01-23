let palavra = "racecar"
let a = 0; 
let b = palavra.length-1;

for (let i = 0; i < palavra.length  ; i++  ){
	if ((b - a) < 2 ){
		console.log("done, its a palindrome");
		break;
	}
	if (palavra[a] != palavra[b]){
		console.log("not a palindrome");
		}
	
	if (palavra[a] == palavra[b]){
		a = a + 1;
		b = b - 1;
		console.log("iteraçao");	
}
	}
		
