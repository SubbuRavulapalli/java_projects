<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
  <style>
    body{
      background-image: url("https://theme-vision.com/wp-content/uploads/2020/10/785054-ecommerce-istock-020119.jpg");
      background-position: center;
      background-size: cover;
    }
    nav {
      height: 70px;
      background-color: crimson;
      padding: 10px 20px;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }

    h1 {
      font-weight: bold;
      font-size: 2rem;
      font-family: cursive;
      color: white;
      margin: 0;
    }

    form {
      margin: 10px;
    }

    button {
      padding: 10px 20px;
      background-color: #4CAF50;
      border: none;
      color: white;
      cursor: pointer;
      border-radius: 5px;
      font-size: 1rem;
      transition: background-color 0.3s ease;
    }

    button:hover {
      background-color: #45a049;
    }

    .container {
      margin: 50px auto;
      text-align: center;
      color: white;
    }

    .container button {
      background-color: #008CBA;
    }

    .container button:hover {
      background-color: #0073e6;
    }

    .container form {
      display: inline-block;
    }

    .container form + form {
      margin-left: 20px;
    }

  </style>
</head>
<body>
<nav>
  <h1>Admin's Home Page</h1>
  <div class="container">
    <form action="signout">
      <button type="submit">Log Out</button>
    </form>

  </div>
</nav>
<br><br><br>
<form action="getForm">
  <button type="submit">Add Product</button>
</form>
<br><br><br>
<form action="fetchAll">
  <button type="submit">View All Products</button>
</form>
<br><br><br>
<form action="fetchById">
  <button type="submit">Search Product</button>
</form>
<br><br><br>
<form action="deleteById">
  <button type="submit">Delete Product</button>
</form>
<br><br>
<form action="updateById">
  <button type="submit">Update Product</button>
</form>


</body>
</html>
