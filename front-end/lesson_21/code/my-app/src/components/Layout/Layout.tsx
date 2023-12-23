/* eslint-disable import/no-extraneous-dependencies */
import React from 'react';
import { Outlet } from 'react-router-dom';
import NavBar from '../NavBar/NavBar';

export default function Layout(): JSX.Element {
    return (
<>
        <NavBar />
        <Outlet />
        <footer>
            Здесь будет подвал
        </footer>
</>
);
}
