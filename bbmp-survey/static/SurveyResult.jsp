<!DOCTYPE html>
<html>
<head>
    <title>Survey Result</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="p-3 mb-2 bg-primary-subtle text-primary-emphasis">

<div class="container mt-4">


    <div class="card shadow-lg p-4">
        <h2 class="text-center text-primary mb-4">Survey Details</h2>
        <h1 style="color:blue;">${success}</h1>
        <h1 style="color:red;">${error}</h1>


        <h4 class="text-success mb-3">Personal Details</h4>
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Occupation:</strong> ${occupation}</p>
        <p><strong>Education:</strong> ${education}</p>
        <p><strong>Native Place:</strong> ${nativePlace}</p>
        <p><strong>Age:</strong> ${age}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Mother Tongue:</strong> ${motherTongue}</p>
        <p><strong>Religion:</strong> ${religion}</p>
        <p><strong>Caste:</strong> ${caste}</p>

        <hr>

        <h4 class="text-success mb-3">Contact Details</h4>
        <p><strong>Mobile No:</strong> ${mobile}</p>
        <p><strong>Friends Count:</strong> ${friends}</p>

        <hr>

        <h4 class="text-success mb-3">Family Details</h4>
        <p><strong>Father Name:</strong> ${fatherName}</p>
        <p><strong>Mother Name:</strong> ${motherName}</p>
        <p><strong>Married:</strong> ${married}</p>
        <p><strong>Spouse Name:</strong> ${spouseName}</p>
        <p><strong>No. of Children:</strong> ${children}</p>
        <p><strong>No. of Family Members:</strong> ${familyMembers}</p>

        <hr>

        <h4 class="text-success mb-3">Identity Documents</h4>
        <p><strong>Aadhar:</strong> ${aadhar}</p>
        <p><strong>PAN:</strong> ${pan}</p>
        <p><strong>Voter ID:</strong> ${voterId}</p>
        <p><strong>Passport:</strong> ${passport}</p>
        <p><strong>Ration Card:</strong> ${rationCard}</p>

        <hr>

        <h4 class="text-success mb-3">Vehicle Details</h4>
        <p><strong>Bike No:</strong> ${bikeNo}</p>
        <p><strong>Car No:</strong> ${carNo}</p>
        <p><strong>No. of Cycles:</strong> ${cycles}</p>

        <hr>

        <h4 class="text-success mb-3">Assets</h4>
        <p><strong>Land:</strong> ${land}</p>
        <p><strong>No. of Sites:</strong> ${sites}</p>
        <p><strong>Gold:</strong> ${gold}</p>
        <p><strong>Silver:</strong> ${silver}</p>
        <p><strong>Laptop:</strong> ${laptop}</p>
        <p><strong>TV:</strong> ${tv}</p>
        <p><strong>Share Holding:</strong> ${shareHolding}</p>
        <p><strong>Shoe Size:</strong> ${shoeSize}</p>
        <p><strong>No. of Shoes:</strong> ${shoes}</p>

        <hr>

        <h4 class="text-success mb-3">Financial Details</h4>
        <p><strong>Income:</strong> ${income}</p>
        <p><strong>Bank Account:</strong> ${bankAccount}</p>
        <p><strong>Insurance Company:</strong> ${insuranceCompany}</p>
        <p><strong>Insurance Number:</strong> ${insuranceNo}</p>

        <hr>

        <h4 class="text-success mb-3">Health Details</h4>
        <p><strong>Diseases:</strong> ${diseases}</p>
        <p><strong>Blood Group:</strong> ${bloodGroup}</p>
        <p><strong>Disabled:</strong> ${disabled}</p>

        <hr>

        <h4 class="text-success mb-3">Property & Utilities</h4>
        <p><strong>RTC:</strong> ${rtc}</p>
        <p><strong>Taxes:</strong> ${taxes}</p>
        <p><strong>Electricity Bill:</strong> ${electricityBill}</p>
        <p><strong>Water Bill:</strong> ${waterBill}</p>
        <p><strong>Building Owner:</strong> ${buildingOwner}</p>

        <hr>

        <h4 class="text-success mb-3">Agriculture</h4>
        <p><strong>Crop:</strong> ${crop}</p>

        <hr>

        <h4 class="text-success mb-3">Loan Details</h4>
        <p><strong>Loan Number:</strong> ${loanNo}</p>
        <p><strong>Loan Balance:</strong> ${loanBalance}</p>
        <p><strong>Loan Type:</strong> ${loanType}</p>

        <hr>

        <h4 class="text-success mb-3">Pets</h4>
        <p><strong>Pet:</strong> ${pet}</p>
        <p><strong>No. of Cows:</strong> ${cows}</p>


        <div class="text-center mt-4">
            <a class="btn btn-primary px-4" href="index.jsp">Back to Home</a>
        </div>
    </div>
</div>

</body>
</html>
