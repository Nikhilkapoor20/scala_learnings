object Demo {
   def main(args: Array[String]) {
      println( apply( layout, "10") )
   }

   def apply(f: String => String, v: String) = f(v)
   
  // need help
  // function abc<T> (x: T) = normally 
  // multi statement ?
   def layout[T](x: T) = x match {
       case x => 1
   }
}