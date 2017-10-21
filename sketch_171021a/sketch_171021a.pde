int Xposition = mouseX;
int Yposition= mouseY;
void setup()
{
  size(800,800);
  
}
void draw()
{
  fill(10000,1000000,10000);
  ellipse(250,400,200,100);
  ellipse(550,400,200,100);
  fill(0,0,0);
  ellipse (Xposition,Yposition,50,50);
  ellipse(Xposition+300,Yposition,50,50);
  Xposition = mouseX;
  Yposition = mouseY;
  if (mouseX <= 200)
  {
   Xposition=200;
  }
  if(mouseX >= 310)
  {
   Xposition=310; 
  }
  if(mouseY >= 410)
  {
   Yposition=410; 
  }
  if(mouseY <= 390)
  {
   Yposition=390; 
  }
  }
  