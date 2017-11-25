int x= 800;
int y = 800;
int i = 0;
int x1 = 400;
int x2 = 1523; 
void setup()
{
 size(3000,5000);
   for(i=0;i<100; i++)
  { 
   noFill();
ellipse(x1,500,x,y);
x=x-8;
y=y-8;
  }
    for(i = 0 ;i<100; i++)
  { 
   noFill();
ellipse(x2,500,x,y);
x=x-8;
y=y-8;

  }
}
void draw()
{
 
 

  ellipse(x2,500,x,y);
  
x2=x2-1;
background(250,250,250);
ellipse(x2,500,x,y);

  
} 