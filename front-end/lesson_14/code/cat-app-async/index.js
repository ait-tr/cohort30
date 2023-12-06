const catFactsElement = document.getElementById("cat-facts")

// Функцию обертка 
async function loadCatFact(){
    const response = await fetch ("https://catfact.ninja/fact");
    const obj = await response.json();
    console.log(obj);
    const {fact, length} = obj;
    catFactsElement.textContent = `${fact} ${length}`;
}

loadCatFact();