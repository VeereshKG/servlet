<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Matrimony Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script>
        function validateForm() {
            const email = document.getElementById("email").value;
            const forWhom = document.getElementById("forWhom").value;
            const gender = document.querySelector("input[name='gender']:checked");
            const dob = document.getElementById("dob").value;
            const motherTongue = document.getElementById("motherTongue").value;
            const religion = document.getElementById("religion").value;
            const martialStatus = document.getElementById("status").value;
            const height = document.getElementById("height").value;

            const submitBtn = document.getElementById("submitBtn");

            let valid = true;

            const emailReg = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[A-Za-z]{2,}$/;
            if (!emailReg.test(email)) {
            valid = false;
            }

            if (forWhom === "") {
            valid = false;
            }

            if (gender === null){
            valid = false;
            }

            if (dob === "") {
            valid = false;
            }

            if (motherTongue === ""){
            valid = false;
            }

            if (religion === "") {
            valid = false;
            }

            if (martialStatus === ""){
            valid = false;
            }


            if (height < 1 || height > 7) {
            valid = false;
            }

            submitBtn.disabled = !valid;
        }

        function updateLabel() {
            const gender = document.querySelector("input[name='gender']:checked");
            const label = document.getElementById("labelFor");
            if (gender) {
                label.innerHTML = gender.value === "Male" ? "Groom's" : "Bride's";
            }
            validateForm();
        }
    </script>


</head>
<body class="bg-light"  oninput="updateLabel()" onchange="validateForm()">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Matrimony</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav" aria-controls="navbarNav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="shadi">Registration</a>
                </li>

            </ul>
        </div>
    </div>
</nav>


<div class="container mt-5">
    <h2 class="text-center text-success mb-4">Matrimony Registration Form</h2>

    <form action="matrimony" method="post" class="mx-auto border p-4 rounded bg-white shadow" style="max-width: 450px;">

        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" id="email" name="email" class="form-control" required>
        </div>

        <div class="mb-3">
            <label class="form-label">For</label>
            <select id="forWhom" name="forWhom" class="form-select" required>
                <option selected>Select</option>
                <option value="Self">Self</option>
                <option value="Son">Son</option>
                <option value="Daughter">Daughter</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Gender</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" value="Male" id="male">
                <label class="form-check-label">Male</label>
            </div>

            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" value="Female" id="female">
                <label class="form-check-label">Female</label>
            </div>
        </div>


        <label id="labelFor" style="font-weight:bold;">Groom's/Bride's</label><br><br>

        <div class="mb-3">
            <label class="form-label">Date of Birth</label>
            <input type="date" name="dob" id="dob" class="form-control" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Mother Tongue</label>
            <select name="motherTongue" class="form-select"  id="motherTongue"  required>
                <option selected>Select</option>
                <option value="Kannada">Kannada</option>
                <option value="Telugu">Telugu</option>
                <option value="Hindi">Hindi</option>
                <option value="Tamil">Tamil</option>
                <option value="Malayalam">Malayalam</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Religion</label>
            <select name="religion" class="form-select"  id="religion"  required>
                <option selected>Select</option>
                <option value="Hindu">Hindu</option>
                <option value="Muslim">Muslim</option>
                <option value="Christian">Christian</option>
                <option value="Sikh">Sikh</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Marital Status</label>
            <select id="status" name="martialStatus" class="form-select" required>
                <option value="">Select</option>
                <option value="Single">Single</option>
                <option value="Married">Married</option>
                <option value="Divorced">Divorced</option>
                <option value="Widow">Widow</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Height (1 - 7 ft)</label>
            <input type="number" name="height" id="height"  min="1" max="7" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-primary w-100" id="submitBtn">Submit</button>

    </form>
</div>
</body>
</html>
