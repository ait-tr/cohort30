import type { FormEvent } from "react"
import { useState } from "react"

export default function Login() {
  const [username, setUsername] = useState("")
  const [password, setPassword] = useState("")
  // useState используется для отслеживания состояний полей ввода
  // для имени пользователя (username) и пароля (password).
  function handleForm(event: FormEvent<HTMLFormElement>) {
    const credentials = { username, password }
    event.preventDefault()
    fetch("https://dummyjson.com/auth/login", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(credentials),
    })
      .then(res => res.json())
      .then(data => localStorage.setItem("access", data.token))
  }
  //handleForm вызывается при отправке формы.
//Создаются учетные данные из текущих состояний username и password.

//event.preventDefault() предотвращает стандартное поведение формы (перезагрузка страницы).
//Отправляется POST-запрос на https://dummyjson.com/auth/login с учетными данными в формате JSON.
//Полученный токен сохраняется в локальное хранилище (localStorage).

  return (
    <div>
      <h1>Login Page</h1>
      <form onSubmit={handleForm}>
        <input
          type="text"
          name="username"
          placeholder="username"
          value={username}
          onChange={e => setUsername(e.target.value)}
        />
        <input
          type="text"
          name="password"
          placeholder="password"
          value={password}
          onChange={e => setPassword(e.target.value)}
        />
        <button type="submit">Login</button>
      </form>

      <p>(Подсказка: username: "kminchelle", password: "0lelplR")</p>
    </div>
  )
}
