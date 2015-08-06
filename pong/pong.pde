PImage Game;
int lives=5;
PImage backgroundImage;
float positionY =random(50);
float positionX =random(1000);
int speedX=6;
int speedY=-6;
void setup()
{
 backgroundImage = loadImage("url.jpg");
 Game=loadImage("Game_Over_Screen.png");
  size (1000,1000);
}
void draw()
{
image(backgroundImage, 0, 0);
  
  fill(255,255,255);
 rect(mouseX,900,120,20);
  ellipse(positionX,positionY,30,30);
  stroke(0,0,0,0);
  positionX=positionX+speedX;
  positionY=positionY+speedY;
  
  if(positionX>=990||positionX<10){
   speedX=(speedX*-1);
  }  
  if(positionY<10)
  {
    speedY=(speedY*-1);
  }
  if(positionY>=885&&positionY<=920&&positionX>=mouseX&&positionX<=(mouseX+120)){
    speedY=(speedY*-1);
  }
  else if(positionY>=1000)
  {
    positionX=100;
    positionY=100;
    lives--;
    
  }
  if(lives==0){
    image(Game,300,300);
    


  }
  
  
}


