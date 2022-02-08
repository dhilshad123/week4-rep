/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Week4 {
    public static void main(String[] args) {
       
        System.out.println(Rectangle.getNumberOfObjects());
        
        Rectangle []  rectangles  = new Rectangle[6];
        Rectangle r1 = new Rectangle(18 , 10 , new Point( 0,0));
        Point p = new Point( 100, 200);
        Rectangle r2 = new Rectangle(15 , 6 , p);
        Rectangle r3 = new Rectangle(20 , 16);
        Rectangle r4 = new Rectangle(25 , 12);
        Rectangle r5 = new Rectangle(52 , 20);
        rectangles[0] = r1;
        rectangles[1] = r2;
        rectangles[2] = r3;
        rectangles[3] = r4;
        rectangles[4] = r5;
        rectangles[5] = r5;

        System.out.println("-----------------------");
        for( int i = 0; i < rectangles.length -1 ; i++){
            
            Rectangle re = rectangles[i];
            System.out.println(rectangles[i].toString());
        }
       System.out.println("-----------------------");
        for( Rectangle rect : rectangles){
            System.out.println(rect.toString());
        }
        System.out.println("-----------------------");
        System.out.println(r1.area());
        System.out.println(r1);

        int x = 12;
        x = 10;
      Rectangle r6 = createRectangle();
        displayObjectInfo(r6);

        System.out.println(" R6.LENGTH = " +r6.getLength());


    }


  static void displayObjectInfo(Rectangle obj){
       obj.setLength(300);
      System.out.println(obj.toString());

      
   }

  // creating an object
   static Rectangle createRectangle(){

       Rectangle rectangle = new Rectangle(200 , 100);

       return rectangle;
   }
}
