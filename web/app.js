// setting constants
const letsStartBtn = document.querySelector('.letsStartBtn')
const threeCircles = document.querySelector('.threeCircles')
const settingsContainer = document.querySelector('.settingsContainer')
var msgsContainer = document.querySelector('.msgsContainer')
const devs1 = document.querySelector('.devs1')
const img = ["./imgs/backgroundImg.png", "./imgs/backgroundimage2.png", "./imgs/backgroundimage3.png", "./imgs/backgroundimage5.png"]

var imgCounter = 0;
const changeBackground = () => {
    imgCounter++
    const page2 = document.querySelector('.page2')
    page2.style = `background-image: url(${img[imgCounter]});`
    console.log(imgCounter);
    if (imgCounter == 3) {
        imgCounter = 0
    }
}

const clearMsgs = () => {
    msgsContainer.innerHTML = ''
}


// this counter for counting masseges and diplay it to left side of navigation bar
var massegesCounter = 0
const msgsCount_1 = () => {
    massegesCounter += 1
    document.querySelector('.p2').innerHTML = `${massegesCounter} Messages`
}









// this function returns you massege as elements
const myMsg = (text) => {
    msgsCount_1()
    return `
                <div class="myMsg">
                    <div class="msgTop">you</div>
                    <div class="msgBody">${text.replace(/<|>/g, "")}</div>
                </div>
            `
}
// this function returns bots massege as elements
const botResponse = (res) => {
    msgsCount_1()
    return `
                <div class="Minionmsg">
                    <div class="msgTop">Minion Bot</div>
                    <div id="msgBody">${res}</div>
                </div>
    `
}






// first bot massege









// page sliding animations when clicking the "lets talk" button
const animations = () => {
    const pageSlider = document.querySelector('.page2')
    pageSlider.classList.add('animatePage2Slider')
}
letsStartBtn.addEventListener('click', () => {
    animations()
})
threeCircles.addEventListener('click', () => {
    settingsContainer.classList.toggle('showsettingsContainer')
    document.querySelector('.c1').classList.toggle('c1Animate')
    document.querySelector('.c2').classList.toggle('c2Animate')
    document.querySelector('.c3').classList.toggle('c3Animate')
})






const scrolIntoLastChild = () => {
    const lC = msgsContainer.lastElementChild
    lC.scrollIntoView()
}


// whenever ENTER button cliked your massege will show in masseges container
const newMsgInput = document.querySelector('.newMsgInput');
newMsgInput.addEventListener('keyup', (key) => {
    if (key.key == "Enter") {
        msgsContainer.innerHTML += myMsg(newMsgInput.value);

        sendRequestByPost();
        scrolIntoLastChild();



    }
})
function sendRequestByPost() {
    //Define asynchronous request object
    var xmlReq;
    //Check whether the browser supports Ajax directly
    if (window.XMLHttpRequest) {// supports Ajax directly
        xmlReq = new XMLHttpRequest();
    } else {// does not support Ajax directly
        xmlReq = new ActiveObject('Microsoft.XMLHTTP');
    }

    //Set callback function
    xmlReq.onreadystatechange = function () {
        if (xmlReq.readyState == 4 && xmlReq.status == 200) {
            //Get the response value of the server
            var result = xmlReq.responseText;
            //Follow up
            msgsContainer.innerHTML += botResponse(result);
        }
    };

    //Create asynchronous post request
    //Create asynchronous get request
    var url = "RobotServlet?textLine=" + newMsgInput.value;
    xmlReq.open("GET", url, true);
    //Send request
    xmlReq.send(null);

    newMsgInput.value = '';

}