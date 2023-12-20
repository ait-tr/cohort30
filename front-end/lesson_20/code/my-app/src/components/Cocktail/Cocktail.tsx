import React, { useEffect, useState } from 'react';
import style from './Cocktail.module.css';

export default function Cocktail(): JSX.Element {
  const [name, setName] = useState<string>('');
  const [image, setImage] = useState<string>('');
  useEffect(() => {
    fetch('https://www.thecocktaildb.com/api/json/v1/1/random.php')
      // pending - ожидание
      // fullfilled - выполненный - вы получили значение
      // rejected - отвергнуть - отклонен - ошибка без значения
      // раскрывает Promise от fetch
      .then((res) => res.json())
      // раскрывает Promise от асинхронного метода json()
      .then((obj) => {
        // поэтапно выводите в консоль
        const { drinks } = obj;
        const { strDrink, strDrinkThumb } = drinks[0];
        setName(strDrink);
        setImage(strDrinkThumb);
      });
  }, []);
  return (
    <div className={style.container}>
      <h1>Cocktail: {name}</h1>
      <img src={image} alt="" />
    </div>
  );
}
