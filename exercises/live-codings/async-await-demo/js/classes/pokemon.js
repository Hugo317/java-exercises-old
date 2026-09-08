class Pokemon {
	constructor(name, sprite){
		this.name = name;
		this.sprite = sprite;
	}

	draw(){
		
		const img = document.createElement('img')
		img.src = this.sprite;
		document.getElementById('card').appendChild(img)
	}
}

export {
	Pokemon
}