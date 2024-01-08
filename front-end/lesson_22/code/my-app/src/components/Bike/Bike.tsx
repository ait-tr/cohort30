import React from 'react';

interface Props {
  gears: number;
  brand: string;
  price: number;
}

export default function Bike(props: Props):JSX.Element {
  const { gears, brand, price } = props;
  return (
    <div>
      Brand: {brand} Gears: {gears} Price: {price}
    </div>
  );
}
