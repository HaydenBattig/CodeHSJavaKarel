function start(){
	// Write your code here
	makeTower();
	makeTower();
	getBackOnPreviousTower();
}

function makeTower(){
    move();
    putBall();
    turnLeft();
    move();
    putBall();
    move();
    putBall();
    move();
    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    turnLeft();
}

function getBackOnPreviousTower(){
    turnLeft();
    move();
    move();
    move();
    turnLeft();
    move();
    turnAround();
}