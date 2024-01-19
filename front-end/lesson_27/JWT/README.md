# Simple Example of JWT Token Usage with Local Storage

Deployment link: `https://simple-react-jwt-fbqf.vercel.app/`

Explore the documentation for a mock server at `https://dummyjson.com/docs/auth`. The mock server provides two endpoints:

- `https://dummyjson.com/auth/login`: The login endpoint returns a JWT token.
- `https://dummyjson.com/auth/me`: This endpoint provides information about the current user only if the user is authorized.

## Authentication Token Retrieval

### Login Endpoint
```javascript
{
  "id": 15,
  "username": "kminchelle",
  "email": "kminchelle@qq.com",
  "firstName": "Jeanne",
  "lastName": "Halvorson",
  "gender": "female",
  "image": "https://robohash.org/Jeanne.png?set=set4",
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvYXV0cXVpYXV0LnBuZz9zaXplPTUweDUwJnNldD1zZXQxIiwiaWF0IjoxNjM1NzczOTYyLCJleHAiOjE2MzU3Nzc1NjJ9.n9PQX8w8ocKo0dMCw3g8bKhjB8Wo7f7IONFBDqfxKhs"
}
```

## User Profile Endpoint
```json
{
  "id": 15,
  "username": "kminchelle",
  "email": "kminchelle@qq.com",
  "firstName": "Jeanne",
  "lastName": "Halvorson",
  "gender": "female",
  "image": "https://robohash.org/Jeanne.png?set=set4",
  ... // other user fields
}
```

## Page Structure

There are two pages: login and profile. The profile page displays information about the current user.

## Bearer Token Usage

To fetch data on the profile page, include the `Authorization` header in the request with the token prefixed by `Bearer` (with a space at the end):

```javascript
fetch("https://dummyjson.com/auth/me", {
  method: "GET",
  headers: {
    Authorization: `Bearer ${localStorage.getItem("access")}`,
  },
})
```

## Additional Considerations

Remember that you can store not only the token itself but also information about the current user in local storage. This ensures persistence even after refreshing the page.
