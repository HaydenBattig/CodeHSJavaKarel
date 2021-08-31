/* This program draws a big tower from Karel's starting spot */
function start(){
	if(facingNorth()){
	    ifFacingNorth();
	}else if(facingWest()){
	    ifFacingWest();
	}else if (facingEast()){
	    ifFacingEast();
	}else if(facingSouth()){
	    ifFacingSouth();
	}
}

function ifFacingSouth(){
    turnLeft();
	turnLeft();
    while(noBallsPresent()){
        putBall();
	    if(frontIsClear()){
	        move();
	    }
	}
}
function ifFacingNorth(){
    while(noBallsPresent()){
	    putBall();
	    if(frontIsClear()){
	        move();
	    }
	}
}
function ifFacingWest(){
    turnRight();
    while(noBallsPresent()){
        putBall();
        if(frontIsClear()){
            move();
        }
	}
}
function ifFacingEast(){
    turnLeft();
    while(noBallsPresent()){
        putBall();
        if(frontIsClear()){
            move();
        }
	}
}