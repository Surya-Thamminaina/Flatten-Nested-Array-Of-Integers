/**
  * Created by surya on 6/7/18.
  * This object contains all the utility functions related to arrays in this project
  */
object ArrayUtil{

  /***
    * A recursive function that flattens the given array of integers of any depth
    * @param inputArray: Input array wich contains integers at any depth
    * @return: Flatten array of all the integeres given in the array in the same order
    */
  def flattenIntegerArrays(inputArray: Array[Any]): Array[Int] = {
    if(inputArray.isEmpty) Array[Int]()
    else {
      inputArray.head match {
        case number:Int => number +: flattenIntegerArrays(inputArray.tail)
        case numbers: Array[Int] => numbers ++ flattenIntegerArrays(inputArray.tail)
        case anyOtherArray: Array[Any] => flattenIntegerArrays(anyOtherArray) ++ flattenIntegerArrays(inputArray.tail)
      }
    }
  }

}
