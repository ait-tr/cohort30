import React from 'react';

import style from './CityPage.module.css';

function CityPage(): JSX.Element {
    return (
        <div className={style.cityClass}>
            <h1>Все о городе</h1>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
             Culpa totam voluptate ipsum quis tenetur necessitatibus voluptas
              numquam quod odio praesentium ad,
              doloribus, soluta porro eius.
            </p>
            <img src="https://img.goodfon.ru/original/1920x1200/9/11/berlin-germaniya-muzey-bode.jpg" alt="" />

        </div>
    );
}
export default CityPage;
