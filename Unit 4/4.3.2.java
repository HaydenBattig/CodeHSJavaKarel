function start(){
    if(ballsPresent()){
        takeBall();
        turnAround();
    } else if(facingEast()){
        move();
        takeBall();
    } else{
        turnAround();
    }
    
   
    //turnAround();
}