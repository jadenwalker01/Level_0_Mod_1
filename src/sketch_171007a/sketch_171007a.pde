void setup()
{
  size(800,800);
}

void draw()
{
 fill(0,200,0); 
  ellipse(400,400,800,800);
  fill(500,0,0);
  ellipse(400,400,750,750);
  PImage Planet1 = loadImage("planet1.png");
   Planet1.resize(50,50);
  image(Planet1, 40, 367);
  PImage Planet2 = loadImage("planet2.png");
   Planet2.resize(50,50);
  image(Planet2, 650, 456);
  PImage Planet3 = loadImage("Planet3.png");
   Planet3.resize(50,50);
  image(Planet3, 408, 564);
  PImage Planet4 = loadImage("planet4.png");
   Planet4.resize(50,50);
  image(Planet4, 545, 75);
  PImage Planet5 = loadImage("planet5.png");
   Planet5.resize(50,50);
  image(Planet5, 400, 198);
  PImage Planet6 = loadImage("planet6.png");
   Planet6.resize(50,50);
  image(Planet6, 200, 243);
  PImage Planet7 = loadImage("planet7.png");
   Planet7.resize(50,50);
  image(Planet7, 200, 589);
}