// Build the tent
makeLeftSide();
makeRightSide();
goHome();

// Turns right
function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}

// Turns around
function turnAround(){
    turnLeft();
    turnLeft();
}

// Makes the left side of the tent
function makeLeftSide(){
    putBall();
    move();
    turnLeft();
    move();
    turnRight();
    
    putBall();
    move();
    turnLeft();
    move();
    turnRight();
    
    putBall();
    move();
    turnLeft();
    move();
    turnRight();
    
}

// Makes the right side of the tent
function makeRightSide(){
    putBall();
    turnRight();
    move();
    turnLeft();
    move();
    
    putBall();
    turnRight();
    move();
    turnLeft();
    move();
    
    putBall();
    turnRight();
    move();
    turnLeft();
    move();
    putBall();
    
}

// Goes back to the starting position
function goHome(){
    turnAround();
    move();
    move();
    move();
    move();
    move();
    move();
    turnAround();
}