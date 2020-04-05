import scala.util.control._

object Demo {
   def main(args: Array[String]) {
      var a = 0;

      // for loop execution with a range
     // for( a <- 1 to 10){
       //  println( "Value of a: " + a );
     // }

       // for loop execution with a range
     // for( a <- 1 until 10){
       //  println( "Value of a: " + a );
      // }

     //  for( a <- 1 to 3; b <- 1 to 3){
       //  println( "Value of a: " + a );
       //  println( "Value of b: " + b );
     // }

      val numList = List(1,2,3,4,5,6);

      // for loop execution with a collection
      //for( a <- numList ){
        // println( "Value of a: " + a );
      //}

       val loop = new Breaks;
      
      loop.breakable {
         for( a <- numList){
            println( "Value of a: " + a );
            
            if( a == 4 ){
               loop.break;
            }
         }
      }
      println( "After the loop" );
   }
}