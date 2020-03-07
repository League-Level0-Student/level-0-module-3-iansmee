void setup(){
  size(400,400);
  int number;
  number = 200;
}
void draw(){
  for (int i = 4; i > 0; i--) {
    if(i % 2 == 0){
      
    fill(#FF0000);
    }
    else{
      fill(#030000);
    }
   ellipse(200,200,i*100,i*100);
    
    
  }
}
  
  
