import React, { useEffect, useState } from 'react';

export default function Playground():JSX.Element {
  const [numberOfDogs, setNumberOfDogs] = useState<number>(0);
  const [numberOfBirds, setNumberOfBirds] = useState<number>(10);
  function handleAddDog():void {
    setNumberOfDogs(numberOfDogs + 1);
  }
  function handleAddBird():void {
    setNumberOfBirds(numberOfBirds + 1);
  }
  // Component lifcycle - жизненный цикл компонента
  // Этапы жизненого цикла:
  // Mount - первая отрисовка компонента на странице
  // Update - изменение
  // Unmount - когда перестает отрисовываться

  // useEffect
  // позволяет вызвать функцию
  // на каком-нибудь из этапов жизни компонента
  // - принимает колбек функцию и второй опиональный параметр -
  // массив зависимостей

  // Пример 1 - пустой массив зависимостей
  useEffect(() => {
    console.log('UseEffect 1 - только при первой отрисовке === mount');
  }, []);
  // Пример 2 - без массива (вообще)
  useEffect(() => {
    console.log('UseEffect 2 - при маунте, и при любых изменениях');
  });
  // Пример 3 - с указанием зависимостей
  useEffect(() => {
    console.log('UseEffect 3 - при первичной отрисовке и при изменении переменной numberOfDogs');
  }, [numberOfDogs]);

  return (
    <div>
      <h1>Playground</h1>
      <p>Number of dogs: {numberOfDogs}</p>
      <p>Number of birds: {numberOfBirds}</p>
      <button type="button" onClick={handleAddDog}>Let the dog in</button>
      <button type="button" onClick={handleAddBird}>New bird</button>
    </div>
  );
}
