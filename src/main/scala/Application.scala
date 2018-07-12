/**
  * Created by surya on 12/7/18.
  * This is just an entry point of the project that calls flattenIntegerArrays function with a hardcoded input
  * and prints the result array's elements in a readable format
  * as a comma separated string
  */
object Application extends App{

  val inputArray = Array(1, Array(2,3), 4, Array(5, Array(6, Array(7))))

  println(s"Input array is: Array(1, Array(2,3), 4, Array(5, Array(6, Array(7))))")
  println(s"Resultant array's elements are: ${ArrayUtil.flattenIntegerArrays(inputArray).mkString(",")}")

}
