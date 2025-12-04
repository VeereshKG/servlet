 const ownerField = document.getElementById("ownerName");
    const vehicleField = document.getElementById("vehicleNumber");
    const typeField = document.getElementById("vehicleType");
    const insField = document.getElementById("insuranceType");
    const premiumField = document.getElementById("premium");

    ownerField.addEventListener("input", validateOwner);
    vehicleField.addEventListener("input", validateVehicle);
    typeField.addEventListener("change", validateType);
    insField.addEventListener("change", validateInsurance);
    premiumField.addEventListener("input", validatePremium);

    function validateOwner() {
        let value = ownerField.value.trim();
        if (value.length < 3) {
            ownerField.classList.add("invalid-input");
            ownerField.classList.remove("valid-input");
            document.getElementById("ownerErr").innerHTML = "Enter valid Name";
            document.getElementById("ownerErr").style.color = "red";
            return false;
        } else {
            ownerField.classList.remove("invalid-input");
            ownerField.classList.add("valid-input");
            document.getElementById("ownerErr").innerHTML = "valid";
            document.getElementById("ownerErr").style.color = "green";
            return true;
        }
    }

    function validateVehicle() {
        let value = vehicleField.value.trim();
        let regex = /^[A-Z]{2}-\d{2}-[A-Z]{2}-\d{4}$/;
        if (!regex.test(value)) {
            vehicleField.classList.add("invalid-input");
            vehicleField.classList.remove("valid-input");
            document.getElementById("vehicleErr").innerHTML = "Enter valid vehicle number";
            document.getElementById("vehicleErr").style.color = "red";
            return false;
        } else {
            vehicleField.classList.remove("invalid-input");
            vehicleField.classList.add("valid-input");
            document.getElementById("vehicleErr").innerHTML = "Valid number";
            document.getElementById("vehicleErr").style.color = "green";
            return true;
        }
    }

    function validateType() {
        let value = typeField.value;
        if (value === "") {
            typeField.classList.add("invalid-input");
            typeField.classList.remove("valid-input");
            document.getElementById("typeErr").innerHTML = "Please select vehicle type";
            document.getElementById("typeErr").style.color = "red";
            return false;
        } else {
            typeField.classList.remove("invalid-input");
            typeField.classList.add("valid-input");
            document.getElementById("typeErr").innerHTML = "Selected";
            document.getElementById("typeErr").style.color = "green";
            return true;
        }
    }

    function validateInsurance() {
        let value = insField.value;
        if (value === "") {
            insField.classList.add("invalid-input");
            insField.classList.remove("valid-input");
            document.getElementById("insErr").innerHTML = "Please select insurance type";
            document.getElementById("insErr").style.color = "red";
            return false;
        } else {
            insField.classList.remove("invalid-input");
            insField.classList.add("valid-input");
            document.getElementById("insErr").innerHTML = "Selected";
            document.getElementById("insErr").style.color = "green";
            return true;
        }
    }

    function validatePremium() {
        let value = premiumField.value;
        if (value <= 0) {
            premiumField.classList.add("invalid-input");
            premiumField.classList.remove("valid-input");
            document.getElementById("premiumErr").innerHTML = "amount must be greater than 0";
            document.getElementById("premiumErr").style.color = "red";
            return false;
        } else {
            premiumField.classList.remove("invalid-input");
            premiumField.classList.add("valid-input");
            document.getElementById("premiumErr").innerHTML = "Valid amount";
            document.getElementById("premiumErr").style.color = "green";
            return true;
        }
    }

    function validateForm() {
        let v1 = validateOwner();
        let v2 = validateVehicle();
        let v3 = validateType();
        let v4 = validateInsurance();
        let v5 = validatePremium();

        return v1 && v2 && v3 && v4 && v5;
    }

    function clearForm() {
        document.getElementById("insuranceForm").reset();
    
        document.querySelectorAll("input, select").forEach(field => {
            field.classList.remove("invalid-input", "valid-input");
        });
    
        document.querySelectorAll("small").forEach(msg => msg.innerHTML = "");
    }