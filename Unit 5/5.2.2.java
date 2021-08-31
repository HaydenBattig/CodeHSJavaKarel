function start(){
    move();
    while(ballsPresent()){
        if(frontIsClear()){
            takeBall();   
        }else{
            move();
        }
    }
    move();
}