import React, { useEffect, useState } from 'react';

import { Link } from 'react-router-dom';
import type Product from './types/Product';
import style from './Products.module.css';

export default function Products(): JSX.Element {
    const [products, setProducts] = useState<Product[]>([]);
    async function fetchProducts():Promise<void> {
        const res = await fetch('https://fakestoreapi.com/products');
        const arr = await res.json();
        setProducts(arr);
    }
    useEffect(() => {
        fetchProducts();
    }, []);
  return (
    <div>
        <ul className={style.productList}>
        {products.map((product) => (
            <li className={style.productCard}>
                <p className={style.title}>{product.title}</p>
                <img className={style.image} src={product.image} alt="" />
                <p className={style.price}>{`${product.price} $`}</p>
                <Link className={style.link} to={`${product.id}`}>Посмотреть товар</Link>
            </li>
        ))}
        </ul>
    </div>
  );
}
