function start(){ 
    
    createColorsUntilWall();
    turnLeft();
    move();
    turnLeft();
    createColorsUntilWall();
    turnRight();
    move();
    turnRight();
    createColorsUntilWall();
    turnLeft();
    move();
    turnLeft();
    createColorsUntilWall();
    turnRight();
    move();
    turnRight();
    createColorsUntilWall();
    turnLeft();
    move();
    turnLeft();
    createColorsUntilWall();
    turnRight();
    move();
    turnRight();
    createColorsUntilWall();
    turnLeft();
    move();
    turnLeft();
    createColorsUntilWall();
    returnToBottom();
}
function createColorsUntilWall(){
    while(frontIsClear()){
        if (colorIs(Color.white)){
            paint(Color.black);
        }
        if (colorIs(Color.red)){
            move();
            paint(Color.black)
        }
        if (colorIs(Color.black)){
            move();
            paint(Color.red);
        }
    }
}
function returnToBottom(){
    turnLeft();
    while(frontIsClear()){
        move();
    }
    turnLeft();
}