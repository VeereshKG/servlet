<!DOCTYPE html>
<html>
<head>
    <title>Survey Form</title>

    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>
<body class="p-3 mb-2 bg-primary-subtle text-primary-emphasis">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">

        <a class="navbar-brand fw-bold" href="index.jsp">
            BBMP Survey</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav" aria-controls="navbarNav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">

            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="btn btn-outline-info" href="index.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="btn btn-outline-info" href="Survey.jsp">Start Survey</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link disabled">About</a>
                </li>

            </ul>
        </div>

    </div>
</nav>


<div class="container mt-4 mb-5">
    <h2 class="text-center text-primary mb-4">BBMP Citizen Survey System</h2>

    <form action="survey" method="post" class="row g-2">

        <h4 class="text-primary mt-4">Personal Details</h4>

        <div class="col-md-4">
            <label class="form-label">Name</label>
            <input type="text" name="name" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Occupation</label>
            <input type="text" name="occupation" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Education</label>
            <input type="text" name="education" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Native Place</label>
            <input type="text" name="nativePlace" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Age</label>
            <input type="number" name="age" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Date of Birth</label>
            <input type="date" name="dob" class="form-control" required>
        </div>
        <div class="col-md-4">
            <label class="form-label">Gender</label>
            <input type="text" name="gender" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Mother Tongue</label>
            <input type="text" name="motherTongue" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Religion</label>
            <input type="text" name="religion" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Caste</label>
            <input type="text" name="caste" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Mobile Number</label>
            <input type="number" name="mobile" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Friends Name</label>
            <input type="text" name="friends" class="form-control" required>
        </div>
        <div class="col-md-4">
            <label class="form-label">Shoe Size</label>
            <input type="number" name="shoeSize" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">No. of Shoes</label>
            <input type="number" name="shoes" class="form-control" required>
        </div>

        <h4 class="text-primary mt-4">Family Details</h4>

        <div class="col-md-4">
            <label class="form-label">Father Name</label>
            <input type="text" name="fatherName" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Mother Name</label>
            <input type="text" name="motherName" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Married</label>
            <select name="married" class="form-select" required>
                <option value="No">No</option>
                <option value="Yes">Yes</option>
            </select>
        </div>

        <div class="col-md-4">
            <label class="form-label">Wife/Husband Name</label>
            <input type="text" name="spouseName" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">No. of Children</label>
            <input type="number" name="children" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Family Members</label>
            <input type="number" name="familyMembers" class="form-control" required>
        </div>

        <h4 class="text-primary mt-4">Identity Documents</h4>

        <div class="col-md-4">
            <label class="form-label">Aadhar No</label>
            <input type="number" name="aadhar" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">PAN Card</label>
            <input type="text" name="pan" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Voter ID</label>
            <input type="text" name="voterId" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Passport No</label>
            <input type="text" name="passport" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Ration Card No</label>
            <input type="number" name="rationCard" class="form-control" required>
        </div>

        <h4 class="text-primary mt-4">Vehicle Details</h4>

        <div class="col-md-4">
            <label class="form-label">Bike Number</label>
            <input type="text" name="bikeNo" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Car Number</label>
            <input type="text" name="carNo" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">No. of Cycles</label>
            <input type="number" name="cycles" class="form-control" required>
        </div>

        <h4 class="text-primary mt-4">Assets</h4>

        <div class="col-md-4">
            <label class="form-label">Land (Acres)</label>
            <input type="text" name="land" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Total Sites</label>
            <input type="number" name="sites" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Gold (gms)</label>
            <input type="number" name="gold" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Silver (gms)</label>
            <input type="number" name="silver" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Laptop Model</label>
            <input type="text" name="laptop" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">TV Model</label>
            <input type="text" name="tv" class="form-control" required>
        </div>



        <div class="col-md-4">
            <label class="form-label">Share Holding</label>
            <input type="text" name="shareHolding" class="form-control" required>
        </div>

        <h4 class="text-primary mt-4">Financial Details</h4>

        <div class="col-md-4">
            <label class="form-label">Income</label>
            <input type="number" name="income" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Bank Account No</label>
            <input type="text" name="bankAccount" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Insurance Company</label>
            <input type="text" name="insuranceCompany" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Insurance No</label>
            <input type="number" name="insuranceNo" class="form-control" required>
        </div>

        <h4 class="text-primary mt-4">Health Details</h4>

        <div class="col-md-4">
            <label class="form-label">Known Diseases</label>
            <input type="text" name="diseases" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Blood Group</label>
            <input type="text" name="bloodGroup" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Disabled</label>
            <select name="disabled" class="form-select" required>
                <option value="No">No</option>
                <option value="Yes">Yes</option>
            </select>
        </div>

        <h4 class="text-primary mt-4">Others</h4>

        <div class="col-md-4">
            <label class="form-label">Taxes Paid</label>
            <input type="text" name="taxes" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Electricity Bill No</label>
            <input type="text" name="electricityBill" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Water Bill No</label>
            <input type="text" name="waterBill" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Building Owner Name</label>
            <input type="text" name="buildingOwner" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Crop</label>
            <input type="text" name="crop" class="form-control" required>
        </div>
        <div class="col-md-4">
            <label class="form-label">RTC No</label>
            <input type="text" name="rtc" class="form-control" required>
        </div>
        <h4 class="text-primary mt-4">Loan Details</h4>

        <div class="col-md-4">
            <label class="form-label">Loan No</label>
            <input type="text" name="loanNo" class="form-control " required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Loan Balance</label>
            <input type="text" name="loanBalance" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">Loan Type</label>
            <input type="text" name="loanType" class="form-control" required>
        </div>

        <h4 class="text-primary mt-4">Pets</h4>

        <div class="col-md-4">
            <label class="form-label">Pet Name</label>
            <input type="text" name="pet" class="form-control" required>
        </div>

        <div class="col-md-4">
            <label class="form-label">No of Cows</label>
            <input type="number" name="cows" class="form-control" required>
        </div>


        <div class="col-12 text-center mt-4">
            <button class="btn btn-success px-4 py-2" type="submit" required>
                Submit Survey
            </button>
        </div>

    </form>
</div>
<footer class="bg-primary text-white mt-5">
    <div class="container py-3">
        <div class="row">
            <div class="col-md-6">
                <h6 class="fw-bold mb-0">BBMP Survey Application</h6>
            </div>
            <div class="col-md-6 text-md-end">
                <p class="small mb-0">
                    &copy; 2025 BBMP Survey | All Rights Reserved.
                </p>
            </div>
        </div>
    </div>
</footer>


</body>
</html>
