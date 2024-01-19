import { useEffect, useState } from "react"
import { useNavigate } from "react-router-dom"

export default function UserProfile() {
  const [user, setUser] = useState<
    { email: string; image: string } | undefined
  >(undefined)
  //Создается состояние user, представляющее информацию о пользователе (email и image).
  const navigate = useNavigate()
  useEffect(() => {
    fetch("https://dummyjson.com/auth/me", {
      method: "GET",
      headers: {
        Authorization: `Bearer ${localStorage.getItem("access")}`,
      },
    })
      .then(res => res.json())
      .then(data => {
        setUser(data)
      })
  }, [])
  console.log("Received JWT:", localStorage.getItem("access"));

  //useEffect используется для выполнения действий после первого рендеринга компоненты.
  //Внутри useEffect выполняется асинхронный GET-запрос к эндпоинту /auth/me.
  //В заголовке запроса устанавливается токен доступа (Authorization: Bearer ...).
  //Полученные данные о пользователе устанавливаются в состояние user.

  const handleLogout = () => {
    // здесь должен быть запрос на логаут эндпоинт

    // очищаем локал сторедж
    localStorage.removeItem("access")
    navigate("/login")
    //handleLogout вызывается при нажатии кнопки "Logout".
    //Здесь обычно должен быть запрос к эндпоинту для выхода (logout),
    // чтобы завершить сеанс пользователя.
    //Локальное хранилище очищается от токена доступа.
    //Используется функция навигации для перенаправления пользователя на страницу входа (/login).
  }
  return (
    <div>
      <h1>User Profile</h1>
      User info: {user?.email ? user.email : "not authorized"}
      <img src={user?.image} alt="" style={{ width: "200px" }} />
      <p>(Подсказка: в useEffect запрос на endpoint /auth/me)</p>
      <button style={{width:150,color:"red",backgroundColor:"black"}} onClick={handleLogout}>
        Logout
      </button>
    </div>
  )
}

