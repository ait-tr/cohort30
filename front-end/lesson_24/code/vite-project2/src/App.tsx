import Counter from './features/counter/Counter';
import './App.css';
import Sandwich from './features/sandwich/Sandwich';
import TaskCreation from './features/tasks/taskCreation';
import Tasks from './features/tasks/Tasks';
import Movies from './features/movies/Movies';
import MovieCreation from './features/movies/MovieCreation';

function App():JSX.Element {
  return (
    <div>
      <Counter />
      <Sandwich />
      <Tasks />
      <TaskCreation />
      <Movies />
      <MovieCreation />
     
    </div>
  );
}

export default App;
