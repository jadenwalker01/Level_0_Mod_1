
int x= 800;
int y = 800;
int i = 0;
int x1 = 400;
int x2 = 1523;
int speed = 1;
int speed2 = 1; 
void setup() {
  size(3000, 5000);
}
void draw()
{
  background(220);


  for (i=0; i<100; i++)
  { 
    noFill();
    ellipse(x1, 500, i*8, i*8);
  }
  
  if (x1<0||x1>1950){
  speed=speed*-1;
  }
  x1=x1+speed;
  for (i = 0; i<100; i++)
  { 
    noFill();
    ellipse(x2, 500, i*8, i*8);
  }
  x2=x2-speed2;
  if (x2<0||x2>1950){
  speed2=speed2*-1;
  }
  
}  