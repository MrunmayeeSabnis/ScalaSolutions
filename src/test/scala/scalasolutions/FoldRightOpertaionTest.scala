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

    describe("with element in the list "){
      it("as 0 should return 0 as the result"){
        foldRightOperation.product(List(1,2,3,4,0,8,9)) should be(0)
      }

      it("non-zero element in the list"){
        foldRightOperation.product(List(1,2,3,4)) should be(24)
      }
    }
  }
}
