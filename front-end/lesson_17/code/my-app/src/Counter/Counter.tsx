import React, { useState } from 'react';

import style from './Counter.module.css';

function Counter():JSX.Element {
    // создали переменную состояния counter
    // и функцию setCounter для изменения состояния
    // useState -  это хук
    // в круглых скобках начальное состояние переменной состояния
    // хук useState  принимает начальное значение переменной состояния
    // возвращает массив в котором на первом месте переменная состояния
    // а на втором месте функция  сетер
    // Хук - это функция которая используется только внутри компонента
    // В жизненном цикле компонента React есть 3 фазы:
    // Сборка (mounting)
    // Обновление (updating)
    // Разборка (unmounting)
    const [counter, setCounter] = useState<number>(0);
// void означает, что функция handlePlus не возвращает никакого значения (void).
// Она просто выполняет инструкцию увеличения счетчика
// (setCounter(counter + 1)), но не возвращает какое-либо конкретное значение
// обратно в вызывающую часть программы.
    function handlePlus(): void {
        setCounter(counter + 1);
    }
    function handleMinus(): void {
        setCounter(counter - 1);
    }
    return (
        <><h1>Добавление денег</h1><img src="https://www.zastavki.com/pictures/originals/2020Finance_Wallpapers___Money_Lot_of_euro_bills_close_up_145693_.jpg" alt="" />
        <div className={`${style.container} ${style.counterClass}`}>
            <button className={style.btn} type="button" onClick={handleMinus}>Убрать лишние деньги</button>
            <span style={{ color: 'red' }}>{counter}</span>
            <button className={style.btn} type="button" onClick={handlePlus}>Добавить деньги на счет</button>
        </div>
        </>
    );
}
export default Counter;
