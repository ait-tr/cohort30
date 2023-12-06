const catFactsElement = document.getElementById("cat-facts");
// console.log(catFactsElement);
fetch("https://catfact.ninja/fact")
.then((response)=> response.json())
.then((obj)=>{
    const {fact, length} = obj;// деструктуризация
    catFactsElement.textContent = `${fact} ${length}` //сохраняем в параграф
})