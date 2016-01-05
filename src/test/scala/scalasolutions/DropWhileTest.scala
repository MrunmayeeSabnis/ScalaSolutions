package scalasolutions

import org.scalatest.{Matchers, FunSpec}

class DropWhileTest extends FunSpec with Matchers{

  describe("DropWhile"){
    it("shold drop the longest prefix till the condition is satisfied"){
      val dropWhileList = new DropWhile
      dropWhileList.dropWhile(List(1,2,3,4,5))(x => x < 4) should be(List(4,5))
    }
  }
}
