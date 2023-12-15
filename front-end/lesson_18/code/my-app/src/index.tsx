import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Counter from './Counter/Counter';
import CityPage from './CityPage/CityPage';
import Sandwich from './Sandwich/Sandwich';
import Sandwich1 from './Sandwich1/Sandwich1';
import Butterbrod from './butterbrod/butterbrod';
import Car from './Car/Car';
import Fruits from './Fruits/Fruits';
import Parent from './Parent/Parent';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <App />
    <Counter />
    <CityPage />
    <CityPage />
    <Sandwich />
    <Sandwich1 />
    <Butterbrod />
    <Car color="red" brand="BMW" />
    <Car color="blue" brand="Mercedes" />
    <Car color="yellow" brand="Volvo" />
    <Car color="black" brand="Tesla" />
    <Car color="green" brand="Suzuki" />
    <Fruits color="yellow" title="banana" weight={2500} />
    <Fruits color="green" title="apple" weight={1000} />
    <Fruits color="red" title="apple" weight={2000} />
    <Parent />
  </React.StrictMode>
);
