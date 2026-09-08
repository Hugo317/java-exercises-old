



async function getRandomDog(show) {


	// promises
	fetch('https://dog.ceo/api/breeds/image/random').then(function (response) {
		return response.json();
	}).then(function (json) {
		return json;
	})

	// async await
	const response =  await fetch('https://dog.ceo/api/breeds/image/random');
	const json = await response.json();
	show(json.message);

}

export {
	getRandomDog,
}