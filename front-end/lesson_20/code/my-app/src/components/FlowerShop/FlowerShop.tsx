import React from 'react';
import Flower from '../Flower/Flower';

export default function FlowerShop():JSX.Element {
  return (
    <div>
      <h2>FlowerShop</h2>
      <Flower title="red tulip" color="red" price={2} family="tulip" />
      <Flower title="rose white" color="white" price={2} family="rose" />
      <Flower title="iris blue" color="blue" price={3} family="iris" />
    </div>
  );
}
