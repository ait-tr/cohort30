/* eslint-disable react-hooks/exhaustive-deps */
import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import Product from '../Products/types/Product';

export default function ProductPage(): JSX.Element {
  const { productId } = useParams();
  const [product, setProduct] = useState<Product | undefined>(undefined);
  async function fetchProduct(): Promise<void> {
    const res = await fetch(`https://fakestoreapi.com/products/${productId}`);
    const obj = await res.json();
    setProduct(obj);
  }
  useEffect(() => {
    fetchProduct();
  }, [productId]);
  return (
  <div>
    <h1>ProductPage</h1>
    <p>{product?.title}</p>
    <p>{product?.description}</p>
    <p>{product?.price}</p>
    <img src={product?.image} alt="" />
    <Link to="../products">К списку товаров</Link>
  </div>
  );
}
