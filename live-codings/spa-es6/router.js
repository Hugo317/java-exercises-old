import { imageController } from "./controllers/image-controller.js"
import { homeController } from "./controllers/home-controller.js";


const routes = {
	marta: {
		hash: '#image', // hash
		controller: imageController // controller
	},
	home: {
		hash: '#home',
		controller: homeController
	}
};


let currentHash = ''; // required to track hash changes


window.onhashchange = function () {

	console.log(window.location.hash)

	// if the url didnt change, do nothing
	if (window.location.hash === currentHash) {
		return;
	}

	// check to see if this hash is valid 
	const routeName = Object.keys(routes).find(function(name){
		return window.location.hash === routes[name].hash;
	})

	// if not, give it a default value
	if(!routeName){
		window.location.hash === "home";
	}

	// whatever the hash is, grab the correct controller and init!
	routes[routeName].controller.init()
}


window.location.hash = "home";

