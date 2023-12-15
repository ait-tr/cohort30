/* eslint-disable max-len */
import React, { useState } from 'react';
import style from './Sandwich_1.module.css';

export default function Sandwich1(): JSX.Element {
    const [sandwich1, setSandwich1] = useState<string>('Your Sandwich');
    function handleAddTomato():void {
        setSandwich1(`${sandwich1} Tomato`);
    }
    function handleAddCucumber():void {
        setSandwich1(`${sandwich1} Cucumber`);
    }
    function handleAddOnion():void {
        setSandwich1(`${sandwich1} Onion`);
    }
    function handleAddClear():void {
        setSandwich1(`${sandwich1} Sandwich`);
    }
    return (
        <>
        <h1>Sanwich with salami</h1>
        <img src="https://w.forfun.com/fetch/8a/8a9d28bc5f9f32d78b6c5be2b05c2a83.jpeg" alt="" />
        <div className={`${style.container} ${style.anotherClass}`}>
            <button type="button" onClick={handleAddTomato} className={style.btn}> Tomato</button>
            <button type="button" onClick={handleAddCucumber} className={style.btn}>Cucumber</button>
            <button type="button" onClick={handleAddOnion} className={style.btn}>Onion</button>
            <button type="button" onClick={handleAddClear} className={style.btn}>Clear</button>
        </div>
        </>
    );
}
