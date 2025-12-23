 (() => {
        'use strict';
        const forms = document.querySelectorAll('.needs-validation');

        Array.from(forms).forEach(form => {
            form.addEventListener('submit', event => {
                if (!form.checkValidity()) {
                    event.preventDefault();
                    event.stopPropagation();
                }
                form.classList.add('was-validated');
            }, false);
        });
    })();

    const playerType = document.getElementById("playerType");

    const battingDiv = document.getElementById("battingDiv");
    const bowlingDiv = document.getElementById("bowlingDiv");
    const stumpsDiv = document.getElementById("stumpsDiv");

    const battingAvg = document.getElementById("battingAvg");
    const bowlingAvg = document.getElementById("bowlingAvg");
    const stumps = document.getElementById("stumps");


    function hideAll() {

    battingDiv.style.display = "none";
    bowlingDiv.style.display = "none";
    stumpsDiv.style.display = "none";


    battingAvg.value = 0;
    bowlingAvg.value = 0;
    stumps.value = 0;


    battingAvg.required = false;
    bowlingAvg.required = false;
    stumps.required = false;
}


    hideAll();

    playerType.addEventListener("change", function () {
        hideAll();

        switch (this.value) {
            case "Batter":
                battingDiv.style.display = "block";
                battingAvg.required = true;
                break;

            case "Bowler":
                bowlingDiv.style.display = "block";
                bowlingAvg.required = true;
                break;

            case "Allrounder":
                battingDiv.style.display = "block";
                bowlingDiv.style.display = "block";
                battingAvg.required = true;
                bowlingAvg.required = true;
                break;

            case "Keeper":
                battingDiv.style.display = "block";
                stumpsDiv.style.display = "block";
                battingAvg.required = true;
                stumps.required = true;
                break;
        }
    });

