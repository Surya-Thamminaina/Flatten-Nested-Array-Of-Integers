import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by surya on 6/7/18.
  * Description: Unit test suit for the function
  */
class ArrayUtilTest extends FlatSpec with Matchers{

  val SUB_ARRAY1 = Array(1,2)
  val SUB_ARRAY2 = Array(4,5)
  val INPUT_NESTED_ARRAY_MOCK: Array[Any] = Array(SUB_ARRAY1, Array(3, SUB_ARRAY2), Array(6, Array(7, Array(8))))
  type responseType = Array[Int]
  behavior of "FlattenNestedTypesTest"

  "flattenTheNestedArray" should
    "return a single array of integers as response" in {
    ArrayUtil.flattenIntegerArrays(INPUT_NESTED_ARRAY_MOCK) shouldBe a [responseType]
  }

  "flattenTheNestedArray" should
    "conatin all sub arrays" in{
    val result = ArrayUtil.flattenIntegerArrays(INPUT_NESTED_ARRAY_MOCK)
    result should contain allElementsOf SUB_ARRAY1
    result should contain allElementsOf SUB_ARRAY2
  }


}
