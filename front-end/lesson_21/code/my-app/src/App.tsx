import React from 'react';
import './App.css';

import { Route, Routes } from 'react-router-dom';
import Activity from './components/Activity/Activity';
import Counter from './components/Counter/Counter';
import Cocktail from './components/Cocktail/Cocktail';
import Layout from './components/Layout/Layout';
import Home from './components/Home/Home';
import Products from './components/Products/Products';
import ProductPage from './components/ProductPage/ProductPage';

function App(): JSX.Element {
  return (
  <Routes>
    <Route path="/" element={<Layout />}>
    <Route index element={<Home />} />
    <Route path="/activity" element={<Activity />} />
    <Route path="/counter" element={<Counter />} />
    <Route path="/cocktail" element={<Cocktail />} />
    <Route path="/products" element={<Products />} />
    <Route path="/products/:productId" element={<ProductPage />} />
    </Route>
  </Routes>
);
}

export default App;
