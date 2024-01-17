import { useDispatch, useSelector } from "react-redux";
import { RootState } from "../../store";
import DeleteIcon from '@mui/icons-material/Delete';
import CartoonEdit from "./CartoonEdit";


export default function Cartoons():JSX.Element{
    const cartoons = useSelector((state: RootState) => state.cartoons);
    const dispatch = useDispatch();
    const handleDelete = (id: string):void => {
        dispatch({ type: 'cartoons/delete', payload: id });
    
    };
 return(
     <div>
    <h1>Cartoons</h1>
    <ul>{cartoons.map((cartoon)=>
    <li key={cartoon.id}>
        <p>{cartoon.title}</p>
        <CartoonEdit id={cartoon.id} />
        <p>{cartoon.country}, {cartoon.genre}, {cartoon.releaseDate}</p>
        <DeleteIcon onClick={() => handleDelete(cartoon.id)} />
        </li>)}</ul>
    </div>
    );
 }        
