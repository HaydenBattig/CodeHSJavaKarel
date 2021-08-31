function start(){
	// Write your code here
	createTowerInFront();
	getBackDown();
	createTowerInFront();
}

//function createTower(){
//
//

function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}

function getBackDown(){
    move();
    turnRight();
    move();
    move();
    move();
    turnLeft();
}
function createTowerInFront(){
    move();
    putBall();
    turnLeft();
    move();
    putBall();
    move();
    putBall();
    move();
    turnRight();
}