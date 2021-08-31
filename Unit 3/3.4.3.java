// Karel completes the climbStep action 4 times to get to the 
// top of the steps.
function start(){
    for(var i = 0; i < 4; i++){
        climbStep();
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