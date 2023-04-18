



function show(data){
	const page = document.getElementById('page');
	page.innerHTML = "";
	const image = document.createElement('img');
	image.src = data;
	page.appendChild(image)
}

export {
	show
}

