import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Counter from './Counter/Counter';
import CityPage from './CityPage/CityPage';
import Sandwich from './Sandwich/Sandwich';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <App />
    <Counter />
    <CityPage />
    <Sandwich />
  </React.StrictMode>
);
