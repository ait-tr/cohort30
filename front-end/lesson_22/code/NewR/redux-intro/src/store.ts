import { combineReducers, createStore } from 'redux';
import counterReducer from './features/counter/counterReducer';

 const store = createStore(
     combineReducers({ counter: counterReducer })
 );
export default store;
export type RootState = ReturnType<typeof store.getState>;


//import { combineReducers, createStore } from 'redux';
// - Здесь импортируются функции combineReducers и createStore из библиотеки Redux.
// combineReducers используется для объединения нескольких редюсеров в один,
// а createStore используется для создания Redux-хранилища.

// import counterReducer from './features/counter/counterReducer';
// - Импорт редюсера counterReducer из файла './features/counter/counterReducer'.
// Редюсеры в Redux отвечают за обновление состояния приложения в зависимости от действий
// (actions), происходящих в приложении.

// Создание Redux-хранилища с помощью createStore и combineReducers.
// combineReducers используется для объединения редюсера counterReducer в объект состояния Redux
// под ключом counter.


// const store = createStore(
// combineReducers({ counter: counterReducer }));

//export default store; - Экспорт созданного Redux-хранилища по умолчанию,
// чтобы другие части приложения могли иметь к нему доступ.

//export type RootState = ReturnType<typeof store.getState>; - Экспорт типа RootState,
// который представляет тип состояния Redux.
// ReturnType<typeof store.getState> используется для извлечения типа состояния,
// возвращаемого функцией getState объекта store.

//Redux-хранилище, которое содержит состояние приложения, управляемое редюсером counterReducer.
// RootState представляет тип этого состояния и может использоваться для типизации при работе с
// состоянием Redux в других частях приложения.