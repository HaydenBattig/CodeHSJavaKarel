/* This program will have Karel run around the racetrack
 * 8 times. */
function start() {
    var balls = 0;
    while(frontIsClear()){
        move();
    }
    turnLeft();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    while(frontIsClear()){
        move();
    }
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    turnLeft();
    while(frontIsClear()){
        move();
    }
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    turnLeft();
    while(frontIsClear()){
        move();
    }
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    putBall();
    turnLeft();
}

function e(){
    move();
    //Help me
}

function f(){
    putBall();
    //hi
}