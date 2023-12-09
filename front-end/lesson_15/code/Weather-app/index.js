const button = document.getElementById("refreshButton");

const links = [
    {
        url: "https://wttr.in/Moscow",
        params:{
        2: "",
        m: "",
        lang: "ru",
        },
    },
    {
        url: "https://wttr.in/Amsterdam",
        params:{
        2: "",
        m: "",
        lang: "ru",
        },
    },
    {
        url: "https://wttr.in/London",
        params:{
        2: "",
        m: "",
        lang: "ru",
        },
    },
    {
        url: "https://wttr.in/Berlin",
        params:{
        2: "",
        m: "",
        lang: "de",
        },
    },
];

function fetchData(){
    for (const link of links){//  перебор ссылок
    const {url, params} = link // деструктуризация ссылки (извлекается url и params из объекта link)
    const queryString = new URLSearchParams(params).toString();
    fetch(`${url}?${queryString}`)
    .then((response)=>response.text())
    .then((pageText)=> {
        const result = document.getElementById("content");
        result.innerHTML = pageText;
    })
    } 
}
button.addEventListener("click", fetchData)