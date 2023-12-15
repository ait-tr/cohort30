import React, { useState } from 'react';

import style from './butterbrod.module.css';

function Butterbrod(): JSX.Element {
    const [butterbrod, setbutterbrod] = useState<string>('Your Butterbrod');

    function handleAddTomato():void {
        setbutterbrod(`${butterbrod} Tomato`);
    }
    function handleAddCucumber(): void {
        setbutterbrod(`${butterbrod} Cucumber`);
    }
    function handleAddOnion(): void {
        setbutterbrod(`${butterbrod} Onion`);
    }
    function handleAddClear(): void {
        setbutterbrod('Your Butterbrod');
    }

    return (
        <div className={style.container}>
            <h1>Butterbrod</h1>
            <p>{butterbrod}</p>
            <button type="button" onClick={handleAddTomato} className={style.btn}>Добавить Томат</button>
            <button type="button" onClick={handleAddCucumber} className={style.btn}>Добавить огурец</button>
            <button type="button" onClick={handleAddOnion} className={style.btn}>Добавить лук</button>
            <button type="button" onClick={handleAddClear} className={style.btn}>Очистить все</button>
        </div>
    );
}
export default Butterbrod;
