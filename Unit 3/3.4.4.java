function start(){
    // Go go the top of the stairs
    for(var i = 0; i < 4; i++){
        climbStep();
    }
    
    
    // Go down the slide
    for(var i = 0; i < 4; i++){
        getABall();
    }
    
}

// Makes Karel climb up one step
// Precondition: Karel is facing East at the bottom of a step
// Postcondition: Karel is facing East on top of the next step
function climbStep(){
    turnLeft();
    move();
    turnRight();
    move();
}

// Has Karel go down part of the slide to collect
// one ball.
// Precondition: Karel is facing East above a ball
// Postcondition: Karel is facing East on the next ball (if there is one)
function getABall(){
    move();
    turnRight();
    move();
    takeBall();
    turnLeft();
}