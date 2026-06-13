document.getElementById("volunteerForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const volunteer = {

        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        phone: document.getElementById("phone").value,
        college: document.getElementById("college").value,
        skills: document.getElementById("skills").value,
        interest: document.getElementById("interest").value,
        availability: document.getElementById("availability").value
    };

    const response = await fetch("/volunteers", {

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify(volunteer)
    });

    if(response.ok){
        document.getElementById("message")
        .innerText = "Registration Successful!";
        document.getElementById("volunteerForm").reset();
    }
});