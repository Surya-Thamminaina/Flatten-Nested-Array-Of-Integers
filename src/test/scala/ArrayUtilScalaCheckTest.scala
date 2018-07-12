/**
  * Created by surya on 7/7/18.
  * Description: Generated Property-based testing suite
  */

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.PropertyChecks

class ArrayUtilScalaCheckTest extends PropSpec with PropertyChecks with Matchers{

  val nestedArrayOfNumbers: Array[Any] = Array(1, Array(2,3), 4, Array(5, Array(6, Array(7))))

  property("The resultant array's lenght should be greater than or equial to the nested array passed"){
    forAll{ nestedArrays: Array[Any] => {
      ArrayUtil.flattenIntegerArrays(nestedArrays).length should be >= nestedArrays.length
    }}
  }
}
