// Class
class Animal{
    constructor(age, name, color){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    info(){
        console.log(`Меня зовут ${this.name} Возраст: ${this.age} Цвет: ${this.color}`);
    }
}
const panda = new Animal (14, "po" , "black");
panda.info();

// Наследование
// Создадим производный класс птица -
// добавим поле высота полета heightOfFlight и ration -рацион

class  Bird extends Animal{
    constructor(age, name, color, heightOfFlight, ration){
        super(age, name, color);
        this.heightOfFlight = heightOfFlight;
        this.ration = ration;
        
    }
}
const colibri = new Bird(14, "po" , "black", 100, "flowers");
console.log(colibri);

class Alcohol {
    constructor(title, strength, volume){
        this.title = title;
        this.strength = strength;
        this.volume = volume;
        
    }
    drink(){
        console.log(`Приятно выпить ${this.title}`);
    }
}

class Cognac extends Alcohol{
    constructor(title, strength, volume, age, country){
        super(title, strength, volume);
        this.age = age;
        this.country = country;
    }
}

class Martiny extends Alcohol {
    constructor(title, strength, volume, sugarAmount){
        super(title, strength, volume);
        this.sugarAmount = sugarAmount;
    }
}

const ararat = new Cognac("Ararat", 100, 100, 15, "Armenia");
ararat.drink();

const blackLabel = new Martiny("Bianco", 100, 100, 15);
blackLabel.drink();




