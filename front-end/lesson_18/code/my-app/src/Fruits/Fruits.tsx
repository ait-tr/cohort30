import React from 'react';

interface Props {
    color: string;
    weight: number;
    title: string;
}
function Fruits(props: Props):JSX.Element {
    const { color, weight, title } = props;
    return (
        <div>
        <p>{color} {weight} {title}</p>
        </div>
    );
}
export default Fruits;
