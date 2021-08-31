function start(){
    putBallsInRow();
    makeDiagonal();
    move();
    turnAround();
    putBallsInRow();
}

// Turns right lmao
function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}

// Turns around lmao
function turnAround(){
    turnLeft();
    turnLeft();
}

// Puts down four balls in a row
function putBallsInRow(){
    move();
    putBall();
    move();
    putBall();
    move();
    putBall();
    move();
    putBall();
}

// Makes the diagonal for the 'Z'
function makeDiagonal(){
    turnRight();
    move();
    turnRight();
    move();
    putBall();
    
    turnLeft();
    move();
    turnRight();
    move();
    putBall();

    turnLeft();
    move();
    turnRight();
    move();
}