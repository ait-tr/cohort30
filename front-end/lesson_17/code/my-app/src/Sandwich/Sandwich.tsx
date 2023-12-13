import React, { useState } from 'react';

import styles from './Sandwich.module.css'; //  импорт модуля

export default function Sandwich(): JSX.Element {
   const [sandwich, setSandwich] = useState<string>('Бутербродный конфигуратор: ');
   function handleAddCheese(): void {
    setSandwich(`${sandwich} сыр`);
   }
   function handleAddBread(): void {
    setSandwich(`${sandwich} хлеб`);
   }
   function handleAddSalami(): void {
    setSandwich(`${sandwich} колбаса`);
   }
   function handleAddClear(): void {
    setSandwich('Бутерброд: ');
   }
// Хук useState возвращает массив из двух элементов
// (состояние, функция изменения состояние), а принимает начальное состояние.
// Состояние - может быть чем угодно: строкой, числом, массивом и т.д.
// и с ним можно работать как с любой другой переменной,
// но изменять только с помощью функции изменения состояния.
// Если делать через обычную переменную без юзстэйт то нужен будет слушатель событий
//  и значение на странице не будет обновляться а юзстэйт отлавливает изменение
// и отрисовывает на странице
    return (
        <><h1>Sandwich</h1>
        <img src="https://100foto.club/uploads/posts/2022-11/1668343862_18-100foto-club-p-sendvichi-dlya-kofeen-29.jpg" alt="" />
        <p>{sandwich}</p>
        <div className={`${styles.container} ${styles.anotherClass}`}>
            <button type="button" onClick={handleAddCheese} className={styles.btn}>Добавить сыр</button>
            <button type="button" onClick={handleAddBread} className={styles.btn}>Добавить хлеб</button>
            <button type="button" onClick={handleAddSalami} className={styles.btn}>Добавить колбасу</button>
            <button type="button" onClick={handleAddClear} className={styles.btn}>Сбросить</button>
        </div>
        </>
    );
}
