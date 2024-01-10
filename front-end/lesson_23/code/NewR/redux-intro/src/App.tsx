import React from 'react';
import Counter from './features/counter/Counter';
import './App.css';
import Sandwich from './features/sandwich/Sandwich';
import TaskCreation from './features/tasks/taskCreation';
import Tasks from './features/tasks/Tasks';

function App():JSX.Element {
  return (
    <div>
      <Counter />
      <Sandwich />
      <Tasks />
      <TaskCreation />
    </div>
  );
}

export default App;
