import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Counter from './components/Counter/Counter';
import CityPage from './components/CityPage/CityPage';
import Sandwich from './components/Sandwich/Sandwich';
import CarShop from './components/CarShop/CarShop';
import FlowerCard from './components/FlowerCard/FlowerCard';
import Playground from './components/Playground/Playground';
import RandomDog from './components/RandomDog/RandomDog';
import Cocktail from './components/Cocktail/Cocktail';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <>
    <App />
    <Counter />
    <CityPage />
    <Sandwich />
    <CarShop />
    <FlowerCard />
    <Playground />
    <RandomDog />
    <Cocktail />
  </>
);
