function start(){
    // Start here
    while(frontIsClear()){
        move();
    }
    if(frontIsBlocked()){
        turnLeft();
    }
    while(frontIsClear()){
        if(rightIsBlocked()){
            putBall();
        }
        move();
        
    }
    if(frontIsBlocked()){
        if(rightIsBlocked()){
            putBall();
        }
    }
}