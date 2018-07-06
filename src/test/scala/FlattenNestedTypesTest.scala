import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by surya on 6/7/18.
  * Description: Unit test suit for the function
  */
class FlattenNestedTypesTest extends FlatSpec with Matchers{

  val SUB_ARRAY1 = Array(1,2,3,4)
  val SUB_ARRAY2 = Array(6,8,10,12)
  val SUB_ARRAY3 = Array(5,7,9,11)
  val INPUT_NESTED_ARRAY_MOCK = Array(SUB_ARRAY1, SUB_ARRAY2, SUB_ARRAY3)
  type responseType = Array[Int]
  behavior of "FlattenNestedTypesTest"

  "flattenTheNestedArray" should
    "return a single array of integers as response" in {
    FlattenNestedTypes.flattenTheNestedArray(INPUT_NESTED_ARRAY_MOCK) shouldBe a [responseType]
  }

  "flattenTheNestedArray" should
    "conatin all sub arrays" in{
    FlattenNestedTypes.flattenTheNestedArray(INPUT_NESTED_ARRAY_MOCK) should contain allElementsOf SUB_ARRAY1
    FlattenNestedTypes.flattenTheNestedArray(INPUT_NESTED_ARRAY_MOCK) should contain allElementsOf SUB_ARRAY2
    FlattenNestedTypes.flattenTheNestedArray(INPUT_NESTED_ARRAY_MOCK) should contain allElementsOf SUB_ARRAY3
  }


}
