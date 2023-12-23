import React from 'react';

import carShopLogo from './img/carShop.png';
import Car from '../Car/Car';
import Bike from '../Bike/Bike';

export default function CarShop(): JSX.Element {
  return (
    <div>
      <h1>Car Shop</h1>
      <h2>Cars</h2>
      {/* вызываем  */}
      <Car brand="mercedes" color="black" />
      <Car brand="porsche" color="green" />
      <Car brand="bmw" color="yellow" />
      {/* Bike - с пропсами количество скоростей, бренд, цена  */}
      <h2>Bikes</h2>
      <Bike brand="harley davidson" gears={4} price={14_000} />
      <Bike brand="indian" gears={4} price={25_000} />
      <Bike brand="yamaha" gears={5} price={12_000} />
      <h1>Первый способ подгрузить изображение через импорт</h1>
      <img src={carShopLogo} alt="car-shop-logo" />
      <h1>Второй способ из папки public, без точки перед слеш</h1>
      <img src="/carShop.png" alt="car-shop-logo" />
    </div>
  );
}
