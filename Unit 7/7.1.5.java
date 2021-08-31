function start(){
    // Start here!
    turnLeft();
    while(frontIsClear()){
        move();
    }
    turnRight();
    goAcrossFence();
    getToEnd();
    turnRight();
}
function goAcrossFence(){
    while(frontIsClear()){
        move();
        if(leftIsClear()){
            turnLeft();
            move();
            turnRight();
            break;
        }
    }
}
function getToEnd(){
    while(frontIsClear()){
        move();
    }
    turnLeft();
    while(frontIsClear()){
        move();
    }
}