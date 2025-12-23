<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>IPL Bidding Portal</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwlZ-GokT6rTlO2ghmhwT4Vk6wJDeDtdi08g&s"
                 alt="IPL Logo"
                 style="height: 40px; width: auto; margin-right: 10px;">
            IPL Bidding Portal
        </a>

        <a class="navbar-brand" href="index.jsp">Home</a>
        <a class="navbar-brand" href="Email.jsp">Search</a>

    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-sm p-3" style="width: 28rem;">

        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNcUDpHbh65k_UBd5aJYLTxyuGZM7vdlVIIA&s"
             class="card-img-top mx-auto"
             style="height: 180px; object-fit: cover; border-radius: 10px;">

        <div class="card-body text-center">
            <form action="email" method="post" class="needs-validation" novalidate>

                <div class="mb-3">
                    <label class="form-label required">Email</label>
                    <input type="email" class="form-control" name="email"  placeholder="Enter email" required>
                    <div class="invalid-feedback"> Please enter a valid email address</div>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
                <c:if test="${not empty error}">
                    <div class="alert alert-danger text-center">
                        ${error}
                    </div>
                </c:if>
            </form>
        </div>
    </div>
</div>

</body>
</html>
