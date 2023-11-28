class Plant {
    constructor(height = 200, age = 1){
        this.height = height;
        this.age = age;

    }
    grow(){
        this.height+=10;
    }
}
const bamboo = new Plant();
console.log(bamboo);

class Rose extends Plant{
    constructor(height, age, numberOfFlowers){
        super(height,age)
        this.numberOfFlowers = numberOfFlowers;
    }
}
const rose = new Rose(12);
console.log(rose)
rose.grow();
console.log(rose)