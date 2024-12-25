<%-- 
    Document   : index
    Created on : Dec 25, 2024, 12:48:49?PM
    Author     : ASUS
--%>
<%
    HttpSession userSession = request.getSession(false);
    if (userSession == null || userSession.getAttribute("user") == null) {
        response.sendRedirect("login.jsp");
        return;
    }

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apps-SoC</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #373b3e;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: Arial, sans-serif;
        }
        .app-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 40px;
            text-align: center;
        }
        .app-button {
            background-color: #1e1e2d; /* Warna tombol */
            color: #ffffff;
            border: none;
            margin: 10px 0;
            width: 100%;
        }
        .app-button:hover {
            background-color: #343a40; /* Warna tombol saat hover */
        }
        .footer {
            margin-top: 20px;
            font-size: 0.9rem;
            color: #6c757d;
        }
    </style>
</head>
<body>
    <div class="app-container">
        <p>List of Applications</p>
        <div>
            <a href="movies?action=all" class="btn app-button">List Movie</a>
            <a href="actors" class="btn app-button">List Actor</a>
            <a href="movie-actors" class="btn app-button">List Movie Actor</a>
        </div>
        <form method="POST" action="login" style="display: inline;">
            <input type="hidden" name="action" value="logout">
            <button type="submit" class="mt-3 btn btn-danger">Logout</button>
        </form>
    </div>
</body>
</html>
