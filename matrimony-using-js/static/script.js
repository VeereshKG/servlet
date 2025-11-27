function setError(input, msgBox, message) {
    input.classList.remove("valid-input");
    input.classList.add("invalid-input");
    msgBox.innerHTML = message;
}

function setSuccess(input, msgBox) {
    input.classList.remove("invalid-input");
    input.classList.add("valid-input");
    msgBox.innerHTML = "";
}

function updateLabelByGender() {
    const male = document.getElementById("male").checked;
    const female = document.getElementById("female").checked;
    const label = document.getElementById("labelFor");

    if (male) label.textContent = "Groom Details";
    else if (female) label.textContent = "Bride Details";
    else label.textContent = "Groom's/Bride's Details";
}

document.getElementById("male").addEventListener("change", updateLabelByGender);
document.getElementById("female").addEventListener("change", updateLabelByGender);

function validateEmail() {
    const email = document.getElementById("email");
    const msg = document.getElementById("emailError");
    const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email.value.trim() === "") return setError(email, msg, "Email is required"), false;
    if (!pattern.test(email.value.trim())) return setError(email, msg, "Invalid email format"), false;

    setSuccess(email, msg);
    return true;
}

function validateDropdown(id, msgId, message) {
    const select = document.getElementById(id);
    const msg = document.getElementById(msgId);

    if (select.value === "" || select.value === "Select")
        return setError(select, msg, message), false;

    setSuccess(select, msg);
    return true;
}

function validateGender() {
    const male = document.getElementById("male").checked;
    const female = document.getElementById("female").checked;
    const msg = document.getElementById("genderError");

    if (!male && !female)
        return msg.innerHTML = "Please select gender", false;

    msg.innerHTML = "";
    return true;
}

function validateDOB() {
    const dob = document.getElementById("dob");
    const msg = document.getElementById("dobError");

    if (dob.value === "") return setError(dob, msg, "Date of Birth is required"), false;

    setSuccess(dob, msg);
    return true;
}

function validateHeight() {
    const h = document.getElementById("height");
    const msg = document.getElementById("heightError");
    const v = parseFloat(h.value);

    if (h.value.trim() === "") return setError(h, msg, "Height is required"), false;
    if (v < 1 || v > 7) return setError(h, msg, "Height must be between 1 and 7 ft"), false;

    setSuccess(h, msg);
    return true;
}

document.getElementById("matriForm").addEventListener("submit", function (e) {
    if (
        !validateEmail() ||
        !validateDropdown("forWhom", "forWhomError", "Please select For Whom") ||
        !validateGender() ||
        !validateDOB() ||
        !validateDropdown("motherTongue", "mtError", "Select Mother Tongue") ||
        !validateDropdown("religion", "religionError", "Select Religion") ||
        !validateDropdown("status", "statusError", "Select Marital Status") ||
        !validateHeight()
    ) {
        e.preventDefault();
    }
});

document.getElementById("email").addEventListener("input", validateEmail);
document.getElementById("forWhom").addEventListener("change", () => validateDropdown("forWhom", "forWhomError", "Please select For Whom"));
document.getElementById("male").addEventListener("change", validateGender);
document.getElementById("female").addEventListener("change", validateGender);
document.getElementById("dob").addEventListener("change", validateDOB);
document.getElementById("motherTongue").addEventListener("change", () => validateDropdown("motherTongue", "mtError", "Select Mother Tongue"));
document.getElementById("religion").addEventListener("change", () => validateDropdown("religion", "religionError", "Select Religion"));
document.getElementById("status").addEventListener("change", () => validateDropdown("status", "statusError", "Select Marital Status"));
document.getElementById("height").addEventListener("input", validateHeight);


document.getElementById("clear").addEventListener("click", function () {
    document.querySelectorAll(".error-text").forEach(e => e.innerHTML = "");
    document.querySelectorAll("input, select").forEach(i =>
        i.classList.remove("valid-input", "invalid-input")
    );
});
