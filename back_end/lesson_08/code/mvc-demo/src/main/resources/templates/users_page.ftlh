<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<div>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Email</th>
            <th>Password</th>
        </tr>
        <#list usersList as user>
            <tr>
             <td>${user.firstName}</td>
             <td>${user.lastName}</td>
             <td>${user.email}</td>
             <td>${user.password}</td>
            </tr>
        </#list>
    </table>


</body>
</html>