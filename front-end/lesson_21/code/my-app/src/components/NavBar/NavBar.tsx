/* eslint-disable import/no-extraneous-dependencies */
import React from 'react';

import { NavLink } from 'react-router-dom';
import style from './NavBar.module.css';

export default function NavBar(): JSX.Element {
    return (
        <nav className={style.navigation}>
            <ul className={style.list}>
        <li className={style.listElement}>
<NavLink to="/cocktail" className={style.link}>Cocktail</NavLink>
        </li>
        <li className={style.listElement}>
<NavLink to="/activity" className={style.link}>Activity</NavLink>
        </li>
        <li className={style.listElement}>
<NavLink to="/counter" className={style.link}>Counter</NavLink>
        </li>
        <li className={style.listElement}>
<NavLink to="/products" className={style.link}>Products</NavLink>
        </li>
        <li className={style.listElement}>
<NavLink to="/" className={style.link}>Home</NavLink>
        </li>

            </ul>
        </nav>
    );
}
