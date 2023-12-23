import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import Product from '../Products/types/Product';
import style from './ProductPage.module.css';

export default function ProductPage(): JSX.Element {
    const { productId } = useParams();
    const [product, setProduct] = useState<Product | undefined>(undefined);
    async function fetchProduct():Promise<void> {
        const res = await fetch(`https://fakestoreapi.com/products/${productId}`);
        const obj = await res.json();
        setProduct(obj);
    }
    useEffect(() => {
        fetchProduct();
    }, [productId]);
  return (
    <div>
        <h1>Product Page</h1>
        <p>{product?.title}</p>
        <p>{product?.description}</p>
        <p>{product?.price}</p>
        <img className={style.image} src={product?.image} alt="" />
        <Link to="../products">К списку товаров</Link>

    </div>
  );
}
