function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}


function makeSide(){
    move();
    putBall();
    move();
    putBall();
    move();
    putBall();
}

function goHome(){
    turnRight();
    move();
    move();
    move();
    turnLeft();
    turnLeft();
}


turnLeft();
makeSide();
turnRight();
makeSide();
turnRight();
makeSide();
goHome();