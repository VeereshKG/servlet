<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>IPL Bidding</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>

        .card-container {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 90vh;
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
    <div class="card shadow-lg p-4" style="width: 34rem; background: rgba(255,255,255,0.9);">

        <h5 class="text-center mb-3"> CompanyName: ${company.company}</h5>


        <form action="searchPlayer" method="post" class="mb-4">
            <div class="mb-3">
                <label class="form-label">Player Type</label>
                <select class="form-select" name="playerType"
                        id="playerType" onchange="showFields()" required>
                    <option value="">Select</option>
                    <option value="Batter">Batter</option>
                    <option value="Bowler">Bowler</option>
                    <option value="Allrounder">Allrounder</option>
                    <option value="Keeper">Keeper</option>
                </select>
            </div>

            <div class="mb-3 d-none" id="battingAvgDiv">
                <label class="form-label">Batting Average</label>
                <input type="number" step="0.01" min="0" class="form-control" name="battingAvg"
                       placeholder="Enter batting average">
            </div>

            <div class="mb-3 d-none" id="bowlingAvgDiv">
                <label class="form-label">Bowling Average</label>
                <input type="number" step="0.01" min="0" class="form-control" name="bowlingAvg"
                       placeholder="Enter bowling average">
            </div>

            <div class="mb-3 d-none" id="stumpingDiv">
                <label class="form-label">Number of Stumps</label>
                <input type="number" min="0" class="form-control" name="stumps" placeholder="No Of Stumps">
            </div>


            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
            <c:if test="${not empty error}">
                <div class="alert alert-danger alert-dismissible fade show mt-3" role="alert">
                    <strong>${errormsg}</strong>
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            </c:if>
        </form>


        <c:if test="${not empty playerList}">
            <h6 class="text-success text-center"> Players List</h6>

            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Batting Avg</th>
                    <th>Bowling Avg</th>
                    <th>Stumps</th>
                    <th>Biding</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${playerList}" var="item">
                    <tr>
                        <td>${item.playerName}</td>
                        <td>${item.playerType}</td>
                        <td>${item.battingAvg}</td>
                        <td>${item.bowlingAvg}</td>
                        <td>${item.stumps}</td>
                        <td>
                            <c:choose>
                                <c:when test="${item.sold}">
    <span class="badge bg-danger">
        SOLD - ${item.soldCompany} (${item.soldAmount} Cr)
    </span>
                                </c:when>
                                <c:otherwise>
                                    <a href="bid?PlayerName=${item.playerName}"
                                       class="btn btn-warning">StartBid</a>
                                </c:otherwise>
                            </c:choose>

                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>

        <!--        <p class="text-danger fw-bold">${errormsg}</p>-->


    </div>
</div>
<script>
    function showFields() {
        const type = document.getElementById("playerType").value;

        document.getElementById("battingAvgDiv").classList.add("d-none");
        document.getElementById("bowlingAvgDiv").classList.add("d-none");
        document.getElementById("stumpingDiv").classList.add("d-none");

        if (type === "Batter") {
            document.getElementById("battingAvgDiv").classList.remove("d-none");
        }
        else if (type === "Bowler") {
            document.getElementById("bowlingAvgDiv").classList.remove("d-none");
        }
        else if (type === "Allrounder") {
            document.getElementById("battingAvgDiv").classList.remove("d-none");
            document.getElementById("bowlingAvgDiv").classList.remove("d-none");
        }
        else if (type === "Keeper") {
            document.getElementById("battingAvgDiv").classList.remove("d-none");
            document.getElementById("stumpingDiv").classList.remove("d-none");
        }
    }
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
