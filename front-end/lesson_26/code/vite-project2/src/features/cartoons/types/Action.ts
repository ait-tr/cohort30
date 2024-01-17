import CartoonCredentials from "./CartoonCredentials";

type Action =
|{type:'cartoons/add',payload: CartoonCredentials}
|{type:'cartoons/delete',payload: string}
|{type:'cartoons/editTitle',payload: {id: string, newTitle: string}};

export default Action;
