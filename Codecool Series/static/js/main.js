'use strict';








function listenShortenActors() {


let page = document.querySelector('#shortActors');
let shortenBtn = document.querySelector('#shortActorsBtn');
shortenBtn.addEventListener("click", (event) => {
    event.preventDefault();
    let actorsData = event.currentTarget.dataset.showActors;
    let showId = event.currentTarget.dataset.showId;
    let newData = changeNameActor(actorsData);
    for (let val of actorsData) {
    let fullName = actorsData[val];
    console.log(fullName, val);}
    shortenNames(newData, showId);
});
}


function shortenNames(actorsData, showId) {
    fetch(`/shows/${showId}/actors`, {
        method: "POST",
        headers: new Headers({
            "content-type": "application/json"
        }),
        credentials: 'same-origin',
        body: JSON.stringify(actorsData),

    })
        .then((response) => {
            return response.json();
        })
        .then((response) => {
            alert(response, 'data submitted');
        });

}


function changeNameActor(actorsData){
        console.log(actorsData.split(","));
    let newData = [];

    for (let val of actorsData) {
        let fullName = actorsData[val];
        console.log(fullName, val);
        let name = fullName.split(" ");
        let letterFirstName = name[0];
        let shortName = letterFirstName + ". " + name[1];
        newData.push(shortName);
    };
    return newData;
}

function init() {


    listenShortenActors();

}
init();

