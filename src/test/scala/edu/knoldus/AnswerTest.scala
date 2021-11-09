package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class AnswerTest extends AnyFlatSpec {
  val result = new EmptySet[Answer]
  val result1 = new NonEmptySet[Answer](Answer(30),result.incl(Answer(25)),result.incl(Answer(22)))

  "Condition for incl method" should "include element in empty stack" in {
    println(assert(result1.contains(Answer(25))))
  }

  "Condition for contain method" should "check for the element is present or not" in {
    val result2 = result.incl(Answer(30)).incl(Answer(22)).incl(Answer(1))
    println(assert(result2.contains(Answer(22))))
  }

  "Condition for contain method" should "check for the element is present in nonempty" in {
   println( assert(result1.contains(Answer(25))))
  }

}
