import Action from "./types/Action";
import { uid } from "uid";
import Cartoon from "./types/Cartoon";

const initialState: Cartoon[] = [
    {
        id: uid(),
        title: "Tom and Jerry",
        genre:"Wald Disney",
        country:"USA",
        releaseDate:"10.09.1994"
    }
];

export default function cartoonsReducer(
    state: Cartoon[] = initialState,
    action: Action
): Cartoon[]{

    switch (action.type){
        case 'cartoons/add':
            return [...state, { ...action.payload, id: uid() }];
        case 'cartoons/delete':
            return state.filter((cartoon) => cartoon.id !== action.payload);
        case 'cartoons/editTitle':
            return state.map((cartoon)=> cartoon.id === action.payload.id ?
                { ...cartoon, title: action.payload.newTitle } : cartoon
            );
        default: return state;
    }
}