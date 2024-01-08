import React from 'react';

interface Props {
  title: string;
  color: string;
  price: number;
  family: string;
}
export default function Flower(props: Props): JSX.Element {
  const {
    title, color, price, family
   } = props;
  return (
    <div>
      <h3>Flower</h3>
      <p>
        Title: {title}
        <span style={{ backgroundColor: color }}>Color: {color}</span>
        Price: {price}
        Family: {family}
      </p>
    </div>
  );
}
