const getElementByIndex = (array ,index) =>array[index];
const res = getElementByIndex(["lime", "orange", "banana"], 2);
console.log(res);



const getWeatherDescription = function (code, decode){
    return decode(code);
}
const decode = function (code){
    switch (code){
        case "SQ": return "Шквал";
        case "PO": return "Пыльный вихрь";
        case "BR": return "Дымка";
        case "HZ": return "Мгла";
        case "FU": return "Дым";
        case "SS": return "Песчаная буря";
        case "DS": return "Пылевая буря";
        default: return "No such code";
    }
}

// decode - это функция которая принимает code в качестве аргумента
// и возвращает соответствующее описание погоды

const res1 = getWeatherDescription("BR", decode);
console.log(res1);
console.log(getWeatherDescription("OP",decode));
console.log(decode("BR"));
