
// template literals

let firstName = "Bedro"
let age = 55;
let description = `${firstName} + is ${age} years old!`;

// default values

function createCharacter(firstName = "Bedro", age = 55){
	return {
		firstName: firstName,
		age: age
	}
}

// {firstName: Christina, age: 33}
const p1 = createCharacter("Christina", 33);
// {firstName: Bedro, age: 55}
const p2 = createCharacter();


// rest



function createTrainer(name = "Ash", favouritePokemon, ...extras){

	return {
		name: name,
		favouritePokemon: favouritePokemon,
		extras: extras
	}
}

// {name: Christina, favouritePokemon: pikachu, extras: [charmander, squirtle]}
const trainer = createTrainer("Christina", "pikachu", "charmander", "squirtle")


// spread

const pokemon = ['bulbsaur', 'charmander', 'squirtle']

function printPokemon(p1, p2, p3){
	console.log(`${p1}, ${p2} and ${p3} are some of my favourite pokémon! :)`)
}

printPokemon(...pokemon);


// object enhancements

function createAnimal(name, type, biome, diet){

	return {
		name,
		type,
		biome,
		diet,
		speak(speech){
			console.log(this.name, 'says', speech)
		}
	}
}


// array destructuring

const fruits = ['apple', 'banana', 'coconut']

// f1 = apple, f2 = banana, f3 = coconut
const [f1, f2, f3] = fruits;

// ignoring a fruit, fruit1 = apple, fruit2 = coconut
const [fruit1, , fruit2] = fruits;


// object destructuring

const anabela = {
	name: 'ana bela',
	hobbies: ['programming', 'surfing']
}

// creates a const hobbies = ['programming', 'surfing']
const { hobbies } = anabela;

// creates a const firstName = anabela.name
const { firstName: name} = anabela;
