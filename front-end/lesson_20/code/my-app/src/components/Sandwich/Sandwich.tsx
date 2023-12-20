import React, { useState } from 'react';

import style from './Sandwich.module.css';

export default function Sandwich(): JSX.Element {
  const [sandwich, setSandwich] = useState<string>('Sandwich:');
  function handleAddBread():void {
    setSandwich(`${sandwich} bread 🍞`);
  }
  function handleAddCheese():void {
    setSandwich(`${sandwich} cheese 🧀`);
  }
  function handleAddSalami():void {
    setSandwich(`${sandwich} salami 🍖`);
  }

  return (
    <div className={style.container}>
      <h2>Sandwich</h2>
      <p>{sandwich}</p>
      <div className={style.btnContainer}>
        <button type="button" onClick={handleAddBread} className={style.btn}>Add bread</button>
        <button type="button" onClick={handleAddCheese} className={style.btn}>Add cheese</button>
        <button type="button" onClick={handleAddSalami} className={style.btn}>Add salami</button>
      </div>
    </div>
  );
}
