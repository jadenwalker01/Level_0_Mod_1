int x= 800;
int y = 800;
int i = 0;
void setup()
{
 size(800,800);
}
void draw()
{

  for(;i<100; i++)
  { 
   noFill();
ellipse(400,400,x,y);
x=x-8;
y=y-8;
  }

  
}