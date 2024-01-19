import { NavLink, Route, Routes } from "react-router-dom"
import "./App.css"
import Login from "./components/Login"
import UserProfile from "./components/UserProfile"

const App = () => {
  return (
    <div className="App">
      <header>
        <nav style={{ display: "flex", gap: "20px", justifyContent: "center" }}>
          <NavLink to="login">Login</NavLink>
          <NavLink to="/">Profile</NavLink>
        </nav>
      </header>
      <Routes>
        <Route index element={<UserProfile />} />
        <Route path="login" element={<Login />} />
      </Routes>
    </div>
  )
}

export default App
