<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Matrimony Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>

        .error-text {
            color: red;
            font-size: 14px;
            margin-top: 2px;
        }

        .required {
            color: red;
            font-weight: bold;
        }

        .valid-field {
            border: 2px solid green;
        }

        .invalid-field {
            border: 2px solid red;
        }


    </style>
</head>

<body>
<nav class="navbar navbar-expand-lg" style="background: linear-gradient(90deg,#ff512f,#dd2476);">
    <div class="container">
        <a class="navbar-brand text-white fw-bold" href="index.jsp">Matrimony</a>

        <button class="navbar-toggler text-white" type="button" data-bs-toggle="collapse"
                data-bs-target="#nav1">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="nav1">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link text-white" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="shadi">Registration</a>
                </li>
            </ul>
        </div>
    </div>
</nav>




<div class="container mt-5">
    <h2 class="text-center text-success mb-4">Matrimony Registration Form</h2>

    <form action="matrimony" method="post" id="matriForm"
          class="mx-auto border p-4 rounded shadow form-box" style="max-width: 500px;">


        <div class="mb-3">
            <label class="form-label">Email <span class="required">*</span></label>
            <input type="email" id="email" name="email" class="form-control">
            <div id="emailError" class="error-text"></div>
        </div>


        <div class="mb-3">
            <label class="form-label">For <span class="required">*</span></label>
            <select id="forWhom" name="forWhom" class="form-select">
                <option value="">Select</option>
                <option value="Self">Self</option>
                <option value="Son">Son</option>
                <option value="Daughter">Daughter</option>
            </select>
            <div id="forWhomError" class="error-text"></div>
        </div>

        <div class="mb-3">
            <label class="form-label">Gender <span class="required">*</span></label><br>

            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" value="Male" id="male">
                <label class="form-check-label">Male</label>
            </div>

            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" value="Female" id="female">
                <label class="form-check-label">Female</label>
            </div>

            <div id="genderError" class="error-text"></div>
        </div>

        <label id="labelFor" class="fw-bold mb-2 text-primary">Groom's/Bride's Details</label>

        <div class="mb-3">
            <label class="form-label">Date of Birth <span class="required">*</span></label>
            <input type="date" id="dob" name="dob" class="form-control">
            <div id="dobError" class="error-text"></div>
        </div>


        <div class="mb-3">
            <label class="form-label">Mother Tongue <span class="required">*</span></label>
            <select id="motherTongue" name="motherTongue" class="form-select">
                <option value="">Select</option>
                <option value="Kannada">Kannada</option>
                <option value="Telugu">Telugu</option>
                <option value="Hindi">Hindi</option>
                <option value="Tamil">Tamil</option>
                <option value="Malayalam">Malayalam</option>
            </select>
            <div id="mtError" class="error-text"></div>
        </div>


        <div class="mb-3">
            <label class="form-label">Religion <span class="required">*</span></label>
            <select id="religion" name="religion" class="form-select">
                <option value="">Select</option>
                <option value="Hindu">Hindu</option>
                <option value="Muslim">Muslim</option>
                <option value="Christian">Christian</option>
                <option value="Sikh">Sikh</option>
            </select>
            <div id="religionError" class="error-text"></div>
        </div>


        <div class="mb-3">
            <label class="form-label">Marital Status <span class="required">*</span></label>
            <select id="status" name="martialStatus" class="form-select">
                <option value="">Select</option>
                <option value="Single">Single</option>
                <option value="Married">Married</option>
                <option value="Divorced">Divorced</option>
                <option value="Widow">Widow</option>
            </select>
            <div id="statusError" class="error-text"></div>
        </div>


        <div class="mb-3">
            <label class="form-label">Height (1 - 7 ft) <span class="required">*</span></label>
            <input type="number" id="height" name="height" min="1" max="7" class="form-control">
            <div id="heightError" class="error-text"></div>
        </div>

        <div class="row mt-4">
            <div class="col-6">
                <button type="submit" class="btn btn-primary w-100" id="submitBtn">Submit</button>
            </div>
            <div class="col-6">
                <button type="reset" class="btn btn-danger w-100">Clear</button>
            </div>
        </div>

    </form>
</div>

<script src="script.js"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
