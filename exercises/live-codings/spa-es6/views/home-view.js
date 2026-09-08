
function show() {
	const page = document.getElementById('page');
	page.innerHTML = ""

	const header = document.createElement('h1');
	header.innerText = "Random Image Generator";

	const button = document.createElement('button')
	button.innerText = "Clicky clicky";

	page.appendChild(header)
	page.appendChild(button)


	button.addEventListener('click', function (event) {
		window.location.hash = "image"
	})
}

export {
	show
}