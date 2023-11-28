 // 7 Типов примитивных
 // number, string, boolean, null, undefined, symbol, bigint 

 // Преобразование в строку
 const str = String(1999);
 console.log(str);
 // Преобразование в число
 const num = Number("123232");
 const num2 = Number("121212/3232la"); // NaN
 // NAN - not a number - number
 console.log(typeof NaN);

 // Преобразование в булевое значение
 const b1 = Boolean(1);// true
 const b2 = Boolean(0);// false
 const b3 = Boolean(""); // false
 const b4 = Boolean(-1);// true
 const b5 = Boolean(null);// false
 const b6 = Boolean(undefined);// false
 const b7 = Boolean(NaN);// false

 ('b' + 'a' + + 'a' + 'a').toLowerCase();

 console.log([1,2,3] + [4,5,6]);
 // Массивы преобразуются в строки и далее мы видим результат конкатенации
