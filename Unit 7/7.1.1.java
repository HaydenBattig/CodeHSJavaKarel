function start() {
    move();
    hookUpForBall();
    returnToStart();
}

function hookUpForBall(){
    turnLeft();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    takeBall();
}
// Comment for the required comment
function returnToStart(){
    turnLeft();
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    turnLeft();
    putBall();
}