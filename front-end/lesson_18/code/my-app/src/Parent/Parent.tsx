import React from 'react';

import Child from '../Child/Child';

function Parent(): JSX.Element {
    const pirat = { name: 'John', age: 30 };
    return (
        <Child pirat={pirat} />
    );
}
export default Parent;
