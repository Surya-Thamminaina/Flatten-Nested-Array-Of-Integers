/**
  * Created by surya on 7/7/18.
  * Description: Generated Property-based testing suite
  */

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.PropertyChecks

class FlattenArrayScalaCheckTest extends PropSpec with PropertyChecks with Matchers{

  val nestedArrayOfNumbers: Array[Array[Int]] = Array(Array(1,2,3,4), Array(5,6,7,8))

  property("The resultant array's lenght should be greater than or equial to the nested array passed"){
    forAll{ nestedArrays: Array[Array[Int]] => {
      FlattenNestedTypes.flattenTheNestedArray(nestedArrays).length should be >= nestedArrays.length
    }}
  }
}
