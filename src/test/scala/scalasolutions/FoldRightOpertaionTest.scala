package scalasolutions

import org.scalatest.{Matchers, FunSpec}

class FoldRightOpertaionTest extends FunSpec with Matchers{
  
  describe("FoldRight operation"){

    val foldRightOperation = new FoldRightOperation

    it("should return the sum of all the characters in the string elements in the list"){
      foldRightOperation.foldRight(List("Mrunmayee", "Minkashi"), 0)((x, y) => x.size + y) should be(17)
    }

    it("should return the sum of all the elements in the list"){
      foldRightOperation.foldRight(List(1,2,3,4), 0)((x, y) => x + y) should be(10)
    }

    it("should return the product of all the elements in the list"){
      foldRightOperation.foldRight(List(1,2,3,4), 1)((x, y) => x * y) should be(24)
    }
  }
}
