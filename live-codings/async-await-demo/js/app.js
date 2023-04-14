import { Pokemon } from './classes/pokemon.js'


async function fetchPokemon(pokemonName){

	const url = "https://pokeapi.co/api/v2/pokemon/" + pokemonName;

	try {

		const response = await fetch(url);
		const {name, sprites} = await response.json()
		
		const ditto = new Pokemon(name, sprites.front_default)
		ditto.draw()

	} catch (err){
		console.log(err)
	}
}

fetchPokemon('bulbasaur')
