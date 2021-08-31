function start(){
	// Write your code here
	//max moves is 13
	for(var i = 0; i < 13; i++){
	    if(frontIsClear()){
	        move();
	    }else{
	        jumpHurdle();
	    }
	}
}
function jumpHurdle(){
    turnLeft();
    move();
    turnRight();
    move();
    turnRight();
    move();
    turnLeft();
}