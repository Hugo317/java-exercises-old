import { getRandomDog } from "../services/image-service.js";
import { show } from "../views/image-view.js"


function init(){
	getRandomDog(show)
}

const imageController = {
	init: init
}


export {
	imageController
}