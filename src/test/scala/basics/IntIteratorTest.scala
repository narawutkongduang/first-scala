package basics

import basics.IntIterator
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class IntIteratorTest extends AnyFunSuite with Matchers {

  test("IntIterator_shouldIterate0ToN-1_equalList") {
    val iterator = new IntIterator(5)
    val result = scala.collection.mutable.ListBuffer[Int]()
    while (iterator.hasNext) {
      result += iterator.next()
    }
    result.toList shouldEqual List(0, 1, 2, 3, 4)
  }

  test("IntIterator_setTo0_emptyList") {
    val iterator = new IntIterator(0)
    iterator.hasNext shouldBe false
    val result = scala.collection.mutable.ListBuffer[Int]()
    while (iterator.hasNext) {
      result += iterator.next()
    }
    result.toList shouldEqual List.empty
  }

  test("IntIterator_setTo1_oneElementInList") {
    val iterator = new IntIterator(1)
    iterator.hasNext shouldBe true
    iterator.next() shouldEqual 0
    iterator.hasNext shouldBe false
  }
  
}