<%-- 
    Document   : index
    Created on : 17 sept. 2021, 05:30:40
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>minion bot</title>
    <link rel="stylesheet" href="style.css">
     
</head>
<body>



    <main>
        
        <div class="page1">
            <div class="inPg1">
                <div class="page1Title">hi <br>
                    im minion bot</div>
        
                <img class="img1" src="./imgs/img1.png" alt="">
                <div class="page1body">
                    im a chat bot and 
                    i can talk to you in whatever topic you want.
                </div>
            </div>
            <button class="letsStartBtn">lets talk</button>
        </div>
        
        <div class="pageSlider">
            <div class="page2">

                <div class="page2Nav">
                    <div class="navLeft">
                        <div class="nfLeft"><img src="./imgs/logoImg.png" alt=""></div>
        
                        <div class="nfRight">
                            <div class="p1">minion bot</div>
                            <div class="p2"></div>
                        </div>
                    </div>
                    <div class="navRight">
                        <div class="threeCircles">
                            <div class="c c1"></div>
                            <div class="c c2"></div>
                            <div class="c c3"></div>
                        </div>
                    </div>
                </div>


                <div class="settingsContainer">

                    <div class="set">
                        <div class="setTitle">Settings</div>
                        <div class="devs">
                            <div class="dev devs1" onclick="changeBackground()">change background</div>
                            <div class="dev devs2" onclick="clearMsgs()">clear messages</div>
                        </div>
                    </div>

                    <div class="set">
                        <div class="setTitle">Developers</div>
                        <div class="devs">
                            <div class="dev">Front-end : Omar CHATIN</div>
                            <div class="dev">Back-end :  Naoufal EL ALLALI</div>
                        </div>
                    </div>


                </div>
        
                <div class="msgsContainer"></div>
        
                <div class="page2Bottom">
                    <input type="text"  name="textLine" placeholder="write to minion bot" class="newMsgInput">
                </div>
                
            </div>
        </div>
        
    </main>
    
   
    
  



    <script src="./app.js"></script>
     
</body>

</html>