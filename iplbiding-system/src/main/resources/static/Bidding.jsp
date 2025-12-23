<!DOCTYPE html>

<html lang="en">
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
    <div class="card shadow-sm p-3" style="width: 35rem;">

        <img src="https://images.mykhel.com/img/2025/12/ipl-2026-auction-live-updates1-1765805189.jpg"
             class="card-img-top mx-auto"
             style="height: 180px; object-fit: cover; border-radius: 10px;">

        <div class="card-body text-center">

            <form action="bid" method="post">
                <h5 class="text-center mb-3"> CompanyName: ${company.company}</h5>
                <div class="mb-3">
                    <label>Player Name</label>
                    <input type="text" name="playerName" value="${name}" readonly class="form-control">
                </div>

                <div class="mb-3">
                    <label>Bid Amount</label>
                    <input type="number" name="price" required class="form-control">
                </div>

                <button type="submit" class="btn btn-primary">Place Bid</button>

                <p class="text-success">${success}</p>
                <p class="text-danger">${error}</p>

            </form>
        </div>
    </div>
</div>

</body>
</html>
