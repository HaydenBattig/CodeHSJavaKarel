function start(){
	// Write your code here
	createTowerInFront();
	getBackDown();
	createTowerInFront();
	
}

function turnRight(){
    /*
    * This function turns Karel Right
    *
    */
    turnLeft();
    turnLeft();
    turnLeft();
}

function createTowerInFront(){
    // creates a tower infront of you 3 balls high and prepares you for getBackDown();
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

function getBackDown(){
    move();
    turnRight();
    move();
    move();
    move();
    turnLeft();
}