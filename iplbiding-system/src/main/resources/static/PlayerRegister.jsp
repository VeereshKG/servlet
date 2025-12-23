<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Player Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .required::after {
    content: " *";
    color: red;
    font-weight: bold;
}
           .card-container {
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: calc(100vh - 70px); /* navbar height */
    margin-top: 70px;
}


    </style>
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
<div class="card-container">
    <div class="card shadow-lg p-4" style="width: 40rem; background: rgba(255,255,255,0.85);">
        <div class="card-body">
            <h5 class="card-title text-center mb-4">Player Registration</h5>

            <form action="player" method="post" class="needs-validation" novalidate>

                <div class="mb-3">
                    <label class="form-label required">Player Name</label>
                    <input type="text" class="form-control" name="playerName" required>
                    <div class="invalid-feedback">Please enter player name</div>
                </div>

                <div class="mb-3">
                    <label class="form-label required">Age</label>
                    <input type="number" class="form-control" name="age" min="10" max="60" required>
                    <div class="invalid-feedback">Age must be between 10 and 60</div>
                </div>

                <div class="mb-3">
                    <label class="form-label required">Player Type</label>
                    <select class="form-select" name="playerType" id="playerType" required>
                        <option value="">Select</option>
                        <option value="Batter">Batter</option>
                        <option value="Bowler">Bowler</option>
                        <option value="Allrounder">Allrounder</option>
                        <option value="Keeper">Keeper</option>
                    </select>
                    <div class="invalid-feedback">Please select player type</div>
                </div>


                <div class="mb-3">
                    <label class="form-label required">State</label>
                    <input type="text" class="form-control" name="state" required>
                    <div class="invalid-feedback">Please enter state</div>
                </div>

                <div class="mb-3" id="battingDiv">
                    <label class="form-label">Batting Average</label>
                    <input type="number" step="0.01" min="0" max="100"
                           class="form-control" name="battingAvg" id="battingAvg">
                    <div class="invalid-feedback">Batting average must be between 0 and 100</div>
                </div>

                <div class="mb-3" id="bowlingDiv">
                    <label class="form-label">Bowling Average</label>
                    <input type="number" step="0.01" min="0" max="100"
                           class="form-control" name="bowlingAvg" id="bowlingAvg">
                    <div class="invalid-feedback">Bowling average must be between 0 and 100</div>
                </div>

                <div class="mb-3" id="stumpsDiv">
                    <label class="form-label">Number of Stumps</label>
                    <input type="number" min="0"
                           class="form-control" name="stumps" id="stumps">
                    <div class="invalid-feedback">Stumps cannot be negative</div>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Register</button>
                </div>

                <div >
                    <h1 style="color:red;">${error}</h1>
                    <h1 style="color:red;">${playererror}</h1>
                </div>
            </form>

        </div>
    </div>
</div>
<script src="player.js">
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
