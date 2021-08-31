function start(){
    diagnalLineL();
    turnRight();
    goDownSide();
    turnRight();
    diagnalLineR();
    turnLeft();
    goHalfDownSide();
    turnLeft();
    normalLine();
    turnLeft();
    turnLeft();
    goHalfDownSide();
    turnRight();
    goHalfDownSide();
    turnLeft();
    turnLeft();
    normalLine();
    returnToMiddle();
}

function fireWork(){
    
}
function diagnalLineL(hi){
    while(frontIsClear()){
        if(noBallsPresent()){
            putBall();
        }
        turnLeft();
        move();
        turnRight();
        move();
    }
    if(noBallsPresent()){
        putBall();
    }
}
function diagnalLineR(hi){
    while(frontIsClear()){
        if(noBallsPresent()){
            putBall();
        }
        turnRight();
        move();
        turnLeft();
        move();
    }
    if(noBallsPresent()){
        putBall();
    }
}
function goDownSide(){
    while(frontIsClear()){
        move();
    }
}
function goHalfDownSide(){
    move();
    move();
    move();
    move();
}
function normalLine(){
    while(frontIsClear()){
        if(noBallsPresent()){
            putBall();
        }
        move();
    }
    if(noBallsPresent()){
        putBall();
    }
}
function returnToMiddle(){
    turnRight();
    turnRight();
    goHalfDownSide();
    turnRight();
}