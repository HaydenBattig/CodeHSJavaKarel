function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}

function buryBall(){
    turnRight();
    move();
    move();
    move();
    putBall();
    turnLeft();
    turnLeft();
    move();
    move();
    move();
    turnRight();
}

move();
move();
buryBall();
move();
move();
move();
buryBall();
move();
move();
move();
buryBall();
move();